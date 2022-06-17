package pdf;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.DottedLine;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.ColumnDocumentRenderer;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.text.pdf.PdfPageEvent;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.sun.istack.NotNull;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.geom.Area;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.06.2022
 */
@Slf4j
public class GeneratePdf {

    public static void main(String[] args) {
        GeneratePdf generatePdf = new GeneratePdf();
        generatePdf.generateCheckReport(REPORTS);
    }

    private final static String FONT = "arial.ttf";

    private final static List<String> REPORTS = List.of(
            "{\"dateTime\":\"2021-06-19T12:56:00\",\"cashTotalSum\":0,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":3187100,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":7164,\"fiscalDriveNumber\":\"9282440300670992\",\"fiscalSign\":2515509471,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000474216011153    \",\"nds18\":531193,\"operationType\":1,\"operator\":\"Антонов Никита Владимирович\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":10,\"retailPlace\":\"Магазин Декатлон\",\"retailPlaceAddress\":\"МО 84км МКАД ТПЗ Алтуфьевовл 3 стр 3\",\"shiftNumber\":346,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":3187100,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T14:15:00\",\"cashTotalSum\":2527700,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":0,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":74520,\"fiscalDriveNumber\":\"9282440300894804\",\"fiscalSign\":3918271077,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000412753042078    \",\"nds18\":421291,\"operationType\":1,\"operator\":\"Сайдходжаева Камила Рустамовна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":44,\"retailPlace\":\"Торговый зал 1\",\"retailPlaceAddress\":\"125252 Москва,ул.Авиаконструктора Микояна,10\",\"shiftNumber\":288,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":2527700,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T14:15:00\",\"cashTotalSum\":2527700,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":0,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":74520,\"fiscalDriveNumber\":\"9282440300894804\",\"fiscalSign\":3918271077,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000412753042078    \",\"nds18\":421291,\"operationType\":1,\"operator\":\"Сайдходжаева Камила Рустамовна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":44,\"retailPlace\":\"Торговый зал 1\",\"retailPlaceAddress\":\"125252 Москва,ул.Авиаконструктора Микояна,10\",\"shiftNumber\":288,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":2527700,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T14:15:00\",\"cashTotalSum\":2527700,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":0,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":74520,\"fiscalDriveNumber\":\"9282440300894804\",\"fiscalSign\":3918271077,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000412753042078    \",\"nds18\":421291,\"operationType\":1,\"operator\":\"Сайдходжаева Камила Рустамовна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":44,\"retailPlace\":\"Торговый зал 1\",\"retailPlaceAddress\":\"125252 Москва,ул.Авиаконструктора Микояна,10\",\"shiftNumber\":288,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":2527700,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T12:56:00\",\"cashTotalSum\":0,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":3187100,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":7164,\"fiscalDriveNumber\":\"9282440300670992\",\"fiscalSign\":2515509471,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000474216011153    \",\"nds18\":531193,\"operationType\":1,\"operator\":\"Антонов Никита Владимирович\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":10,\"retailPlace\":\"Магазин Декатлон\",\"retailPlaceAddress\":\"МО 84км МКАД ТПЗ Алтуфьевовл 3 стр 3\",\"shiftNumber\":346,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":3187100,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T14:15:00\",\"cashTotalSum\":2527700,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":0,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":74520,\"fiscalDriveNumber\":\"9282440300894804\",\"fiscalSign\":3918271077,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}, {\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000412753042078    \",\"nds18\":421291,\"operationType\":1,\"operator\":\"Сайдходжаева Камила Рустамовна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":44,\"retailPlace\":\"Торговый зал 1\",\"retailPlaceAddress\":\"125252 Москва,ул.Авиаконструктора Микояна,10\",\"shiftNumber\":288,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":2527700,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T12:56:00\",\"cashTotalSum\":0,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":3187100,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":7164,\"fiscalDriveNumber\":\"9282440300670992\",\"fiscalSign\":2515509471,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000474216011153    \",\"nds18\":531193,\"operationType\":1,\"operator\":\"Антонов Никита Владимирович\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":10,\"retailPlace\":\"Магазин Декатлон\",\"retailPlaceAddress\":\"МО 84км МКАД ТПЗ Алтуфьевовл 3 стр 3\",\"shiftNumber\":346,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":3187100,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T11:19:00\",\"cashTotalSum\":0,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":3297000,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":16100,\"fiscalDriveNumber\":\"9288000100160791\",\"fiscalSign\":1278340747,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000552493047847    \",\"nds18\":549510,\"operationType\":1,\"operator\":\"Галашова Ксения Александровна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":4,\"retailPlace\":\"Магазин Декатлон\",\"retailPlaceAddress\":\"142704 Москва, 21-й км Калужского шоссе д.3\",\"shiftNumber\":169,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":3297000,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}",
            "{\"dateTime\":\"2021-06-19T11:19:00\",\"cashTotalSum\":0,\"code\":3,\"creditSum\":0,\"ecashTotalSum\":3297000,\"fiscalDocumentFormatVer\":2,\"fiscalDocumentNumber\":16100,\"fiscalDriveNumber\":\"9288000100160791\",\"fiscalSign\":1278340747,\"fnsUrl\":\"https://www.nalog.ru/\",\"items\":[{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900},{\"name\":\"Шлем H PLAY 5 для взрослых бел\",\"nds\":1,\"paymentType\":4,\"price\":109900,\"quantity\":1,\"sum\":109900}],\"kktRegId\":\"0000552493047847    \",\"nds18\":549510,\"operationType\":1,\"operator\":\"Галашова Ксения Александровна\",\"prepaidSum\":0,\"provisionSum\":0,\"requestNumber\":4,\"retailPlace\":\"Магазин Декатлон\",\"retailPlaceAddress\":\"142704 Москва, 21-й км Калужского шоссе д.3\",\"shiftNumber\":169,\"taxationType\":1,\"appliedTaxationType\":1,\"totalSum\":3297000,\"user\":\"ООО \\\"ОКТОБЛУ\\\"\",\"userInn\":\"5029086747  \"}"
    );
    public OutputStream generateCheckReport(List<String> str) {
        /*String file = "C:/Data/pdf/a.pdf";*/
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter(baos).setCompressionLevel(9));
            Document document = new Document(pdfDoc, PageSize.A4);
            setFont(document);
            Map<String, String> kv = new LinkedHashMap<>();
            /**
             * инициализация страницы, разбивка страницы на столбцы, задание размера страницы
             */
            float offSet = 35;
            System.out.println("Width(): " + PageSize.A4.getWidth());
            System.out.println("Height(): " + PageSize.A4.getHeight());
            float columnWidth = PageSize.A4.getWidth() / 3.4f;
            float columnHeight = PageSize.A4.getHeight() - 50;
            int receiptNumber = 0;

            Rectangle rectangle1 = new Rectangle(offSet - 5, offSet, columnWidth, columnHeight);
            Rectangle rectangle2 = new Rectangle(offSet + columnWidth, offSet, 176, columnHeight);
            Rectangle rectangle3 = new Rectangle(offSet + columnWidth * 2 + 5, offSet, 177, columnHeight);
            Rectangle[] columns = {rectangle1, rectangle2, rectangle3};
            document.setRenderer(new ColumnDocumentRenderer(document, columns));

            /*-------*/
            for (String report : REPORTS) {
                int numOfPageStart = pdfDoc.getNumberOfPages();
                receiptNumber++;

                JSONObject jsonObject = new JSONObject(report);
                JSONObject content = new JSONObject(report);

                boolean rec2 = Arrays.stream(columns).filter(x -> x.getWidth() == 176).anyMatch(x -> x.contains(rectangle2));
                boolean rec3 = Arrays.stream(columns).filter(x -> x.getWidth() == 177).anyMatch(x -> x.contains(rectangle3));
                if (pdfDoc.getNumberOfPages() != 0 && content.get("items").toString().length() < 3210) {
                    document.add(new AreaBreak(AreaBreakType.NEXT_AREA));
                }
                /*определяем размер чека и его размещение*/
                int itemContentLength = content.get("items").toString().length();
                //System.out.print(" Длина " + content.get("items").toString().length() + " | --" + rec2 + rec3 + "--");
                Paragraph p = new Paragraph();
                p.add("версия ");
 /*-------------*/
                p.add(parseFiscalDocumentFormatVersion(content));
                p.setTextAlignment(TextAlignment.CENTER);
                document.add(p);

                p = new Paragraph();
                p.add(parseOperationType(content));
                p.setTextAlignment(TextAlignment.CENTER);
                p.setBold();
                document.add(p);
                Table header = new Table(1);
                kv = new LinkedHashMap<>();
                kv.put("user", "");
                //kv.put("retailAddress", "Адрес расчета: ");
                kv.put("retailPlaceAddress", "");
                kv.put("retailPlace", "");
                kv.put("userInn", "ИНН ");
                kv.put("requestNumber", "Чек № ");
                kv.put("shiftNumber", "Смена № ");
                kv.put("operator", "Кассир ");

                for (String k : kv.keySet()) {
                    String v = getString(content, k);
                    if (v != null) {
                        header.addCell(createCell(kv.get(k) + v, 100f, -3f, TextAlignment.CENTER));
                    }
                    if (k == "userInn") {
                        header.addCell(createCell("" + getString(
                                jsonObject, "dateTime"), 100f, -3f, TextAlignment.CENTER));
                    }
                }
                document.add(header);

                DottedLine line = new DottedLine(2f);
                line.setGap(3.5f);
                LineSeparator ls = new LineSeparator(line);
                ls.setMarginTop(5f);
                ls.setMarginBottom(5f);
                document.add(ls);

                Table table = new Table(5);
                table.setWidth(UnitValue.createPercentValue(100));
                table.setBorder(Border.NO_BORDER);

                table.addHeaderCell(createHeaderCell("№", 5f, TextAlignment.LEFT));
                table.addHeaderCell(createHeaderCell("Название", 20f, TextAlignment.CENTER));
                table.addHeaderCell(createHeaderCell("Цена", 30f, TextAlignment.RIGHT));
                table.addHeaderCell(createHeaderCell("Кол.", 10f, TextAlignment.RIGHT));
                table.addHeaderCell(createHeaderCell("Сумма", 10f, TextAlignment.RIGHT));

                document.add(table);

                JSONArray items = content.getJSONArray("items");
                for (int i = 0; i < items.length(); i++) {
                    table = new Table(5);
                    table.setWidth(UnitValue.createPercentValue(100));
                    table.setBorder(Border.NO_BORDER);
                    table.setMarginTop(5f);

                    JSONObject item = items.getJSONObject(i);

                    String N = String.valueOf(i + 1);
                    String name = item.getString("name");
                    String price = String.format(
                            "%.2f", item.getDouble("price") / 100.0).replace(',', '.');
                    String count = String.format(
                            "%.1f", item.getDouble("quantity")).replace(',', '.');
                    String sum = String.format(
                            "%.2f", item.getDouble("sum") / 100.0).replace(',', '.');

                    table.addCell(createCell(N, 5f, -3f, TextAlignment.LEFT));
                    table.addCell(createCell(name, 0f, -3f, TextAlignment.LEFT));
                    table.addCell(createCell(price, 10f, -3f, TextAlignment.LEFT));
                    table.addCell(createCell(count, 10f, -3f, TextAlignment.RIGHT));
                    table.addCell(createCell(sum, 10f, -3f, TextAlignment.RIGHT));

                    document.add(table);

                    table = new Table(1);
                    table.setWidth(UnitValue.createPercentValue(100));
                    table.setBorder(Border.NO_BORDER);
                    //table.addCell(createCell(parseNDS(item), 0f, -3f, TextAlignment.LEFT));
                    //table.addCell(createCell(parseProductType(item), 0f, -3f, TextAlignment.LEFT));
                    //table.addCell(createCell(parsePaymentType(item), 0f, -3f, TextAlignment.LEFT));
                    document.add(table);
                }

                line = new DottedLine(2f);
                line.setGap(3.5f);
                ls = new LineSeparator(line);
                ls.setMarginTop(5f);
                ls.setMarginBottom(5f);
                document.add(ls);

                table = new Table(2);
                table.setWidth(UnitValue.createPercentValue(100));
                table.setBorder(Border.NO_BORDER);
                table.addCell(createCellBold("ИТОГО", 50f, TextAlignment.LEFT));
                table.addCell(createCellBold(getDouble(content, "totalSum"), 50f, TextAlignment.RIGHT));

                //        table = new Table(2);
                //        table.setWidth(UnitValue.createPercentValue(100));
                //        table.setBorder(Border.NO_BORDER);

                table.addCell(createCell("Наличные", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "cashTotalSum"), 50f, -3f, TextAlignment.RIGHT));

                table.addCell(createCell("Безналичные", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "ecashTotalSum"), 50f, -3f, TextAlignment.RIGHT));

                /*table.addCell(
                        createCell("Сумма по чеку предоплатой", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "prepaidSum"), 50f, -3f, TextAlignment.RIGHT));

                table.addCell(
                        createCell("Сумма по чеку постоплатой", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "creditSum"), 50f, -3f, TextAlignment.RIGHT));

                table.addCell(createCell(
                        "Сумма по чеку встречным представлением", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "provisionSum"), 50f, -3f, TextAlignment.RIGHT));*/
                kv.put("nds18", "Сумма НДС чека по ставке 20%");
                kv.put("nds10", "Сумма НДС чека по ставке 10%");
                kv.put("nds0", "Сумма расчета по чеку с НДС по ставке 0%");
                kv.put("ndsNo", "Сумма расчета по чеку без НДС");
                kv.put("nds10110", "Сумма НДС чека по расч. ставке 10/110");
                kv.put("ndsCalculated10", "Сумма НДС чека по расч. ставке 10/110");
                kv.put("nds18118", "Сумма НДС чека по расч. ставке 20/120");
                kv.put("ndsCalculated18", "Сумма НДС чека по расч. ставке 20/120");

                for (String k : kv.keySet()) {
                    String v = getDouble(content, k);
                    if (v != null) {
                        table.addCell(createCell(kv.get(k), 50f, -3f, TextAlignment.LEFT));
                        table.addCell(createCell(v, 50f, -3f, TextAlignment.RIGHT));
                    }
                }

                document.add(table);

                line = new DottedLine(2f);
                line.setGap(3.5f);
                ls = new LineSeparator(line);
                ls.setMarginTop(5f);
                ls.setMarginBottom(5f);
                document.add(ls);

                table = new Table(1);
                table.setWidth(UnitValue.createPercentValue(100));
                table.setBorder(Border.NO_BORDER);

                kv = new LinkedHashMap<>();
                kv.put("kktRegId", "РЕГ.НОМЕР ККТ: ");
                kv.put("fiscalDriveNumber", "ФН: №");
                kv.put("fiscalDocumentNumber", "ФД: №");
                kv.put("fiscalSign", "ФПД: #");
                kv.put("Url", "Сайт ФНС: ");
                kv.put("fnsSiteUrl", "Сайт ФНС: ");
                kv.put("fnsUrl", "Сайт ФНС: ");

                for (String k : kv.keySet()) {
                    String v = getString(content, k);
                    if (v != null) {
                        table.addCell(createCell(kv.get(k) + v, 100f, -3f, TextAlignment.LEFT));
                    }
                }
                table.addCell(createCell("ВИД НАЛОГООБЛОЖЕНИЯ: "
                        + parseTT(content), 100f, -3f, TextAlignment.LEFT));
                document.add(table);

                line = new DottedLine(2f);
                line.setGap(3.5f);
                ls = new LineSeparator(line);
                ls.setMarginTop(0f);
                ls.setMarginBottom(0f);
                document.add(ls);

                table = new Table(1);
                table.setWidth(UnitValue.createPercentValue(100));
                table.setBorder(Border.NO_BORDER);
                /**
                 * генерация QR кода
                 */
                String textQR = generateQRText(content);
                BarcodeQRCode qrcode = new BarcodeQRCode(textQR);
                PdfFormXObject barcodeObject = qrcode.createFormXObject(ColorConstants.BLACK, pdfDoc);
                Image barcodeImage = new Image(barcodeObject).setWidth(100f).setHeight(100f);
                table.addCell(createQRCell(barcodeImage));
                table.addCell(createCell("", 100f, 0f, TextAlignment.CENTER));
                document.add(table);
                /**
                 * генерация разделителя чеков, линия
                 */
                SolidLine solidLine = new SolidLine();
                solidLine.setLineWidth(2f);
                LineSeparator lineSeparator = new LineSeparator(solidLine);
                lineSeparator.setMarginBottom(15f);
                document.add(lineSeparator);
                int numOfPageEnd = pdfDoc.getNumberOfPages();
                if (content.get("items").toString().length() > 3210 /*&& rec3 || content.get("items").toString().length() > 3760 && rec2*/) {
                    document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                }
                System.out.print(numOfPageStart + " | " + numOfPageEnd);

            } /*End of receipt */

            System.out.println(" | Кол-во чеков " + receiptNumber);
            document.close();
            pdfDoc.close();
                 log.info("Table created successfully..");

            OutputStream outputStream = new FileOutputStream("file.pdf");
            baos.writeTo(outputStream);
            return baos;
        } catch (Exception e) {
            log.error(e.toString());
            return null;
        }
    }

    static void setFont(Document doc) throws IOException {
        PdfFont font = PdfFontFactory.createFont(FONT,
                PdfEncodings.IDENTITY_H);
        doc.setFontSize(8f);
        doc.setFont(font);
    }

    static String parseFiscalDocumentFormatVersion(JSONObject j) {
        int version = j.getInt("fiscalDocumentFormatVer");
        if (version == 1) {
            return "ФФД 1.0";
        } else if (version == 2) {
            return "ФФД 1.05";
        } else if (version == 3) {
            return "ФФД 1.1";
        }
        return "";
    }

    static String parseOperationType(JSONObject j) {
        int version = j.getInt("operationType");
        if (version == 1) {
            return "Приход";
        } else if (version == 2) {
            return "Возврат прихода";
        } else if (version == 3) {
            return "Расход";
        } else if (version == 4) {
            return "Возврат расхода";
        }
        return "";
    }

    static Cell createHeaderCell(String text, float percentage, TextAlignment alignment) {
        Paragraph p = new Paragraph();
        p.add(text);
        p.setTextAlignment(alignment);
        p.setBold();

        Cell cell = new Cell();
        cell.add(p);
        cell.setBorder(Border.NO_BORDER);

        cell.setWidth(UnitValue.createPercentValue(percentage));

        return cell;
    }

    static Cell createCell(String text, float percentage, float margin, TextAlignment alignment) {
        Paragraph p = new Paragraph();
        p.add(text);
        p.setTextAlignment(alignment);
        p.setMarginTop(margin);

        Cell cell = new Cell();
        cell.add(p);
        cell.setBorder(Border.NO_BORDER);
        //cell.setBackgroundColor(new DeviceRgb(0xA6, 0xCB, 0x0B));
        cell.setWidth(UnitValue.createPercentValue(percentage));

        return cell;
    }

    static Cell createQRCell(Image image) {
        Paragraph p = new Paragraph();
        p.add(image);
        p.setTextAlignment(TextAlignment.CENTER);
        p.setMarginTop((float) -3.0);
        Cell cell = new Cell();
        cell.add(p);
        cell.setBorder(Border.NO_BORDER);
        cell.setWidth(UnitValue.createPercentValue((float) 100.0));
        return cell;
    }

    static String parseNDS(JSONObject j) {
        int nds = j.getInt("nds");
        if (nds == 1) {
            return "НДС 20%";
        } else if (nds == 2) {
            return "НДС 10%";
        } else if (nds == 3) {
            return "НДС 20/120";
        } else if (nds == 4) {
            return "НДС 10/110";
        } else if (nds == 5) {
            return "НДС 0%";
        } else if (nds == 6) {
            return "НДС не облагается";
        }
        return "";
    }

    static String parsePaymentType(JSONObject j) {
        return "ПОЛНЫЙ РАСЧЕТ";
    }

    static String parseProductType(JSONObject j) {
        return "ТОВАР";
    }

    static Cell createCellBold(String text, float percentage, TextAlignment alignment) {
        Paragraph p = new Paragraph();
        p.add(text);
        p.setTextAlignment(alignment);
        p.setMarginTop(-3f);
        p.setBold();
        p.setFontSize(15);
        Cell cell = new Cell();
        cell.add(p);
        cell.setBorder(Border.NO_BORDER);
        //cell.setBackgroundColor(new DeviceRgb(0xA6, 0xCB, 0x0B));
        cell.setWidth(UnitValue.createPercentValue(percentage));

        return cell;
    }

    static String getDouble(JSONObject j, String key) {
        try {
            return String.format("%.2f", j.getDouble(key) / 100.0).replace(',', '.');
        } catch (Exception e) {
            return null;
        }
    }

    static String getString(JSONObject j, String key) {
        try {
            return j.getString(key);
        } catch (Exception e) {
            try {
                return String.valueOf(j.getLong(key));
            } catch (Exception ee) {
                return null;
            }
        }
    }

    static String parseTT(JSONObject j) {
        Map<Long, String> kv = new HashMap<>();
        kv.put(1L, "ОСН");
        kv.put(2L, "УСН доход");
        kv.put(4L, "УСН доход - расход");
        kv.put(8L, "ЕНВД");
        kv.put(16L, "ЕСХН");
        kv.put(32L, "Патент");

        try {
            if (j.has("appliedTaxationType")) {
                return kv.get(j.getLong("appliedTaxationType"));
            } else if (j.has("taxationType")) {
                return kv.get(j.getLong("taxationType"));
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    static String generateQRText(JSONObject j) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); //2021-04-23T20:50:39Z 2021-06-19T14:15:00
        Date date = dateFormat.parse(j.getString("dateTime"));
        dateFormat.setTimeZone(TimeZone.getTimeZone("Etc/GMT+0")); // Set time-zone
        String t = dateFormat.format(date);

        String fn = j.getString("fiscalDriveNumber");
        Long i = j.getLong("fiscalDocumentNumber");
        Long fp = j.getLong("fiscalSign");
        Float s = j.getLong("totalSum") / 100f;
        Long n = j.getLong("operationType");

        return String.format(Locale.US, "t=%s&s=%.2f&fn=%s&i=%s&fp=%s&n=%s", t, s, fn, i, fp, n);
    }
}
