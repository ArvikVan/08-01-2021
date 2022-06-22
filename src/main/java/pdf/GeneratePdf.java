package pdf;

import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
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
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

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

    /*private final static String TEMP_JSON = "{\"id\":3677751255694242000,\"ofdId\":\"ofd1\",\"receiveDate\":\"2021-04-23T20:50:39Z\",\"subtype\":\"receipt\",\"address\":\"350087,Россия,Краснодарский край,,г Краснодар г.п.,,,ул им Ягодина МД элем. улично-дорожн.сети,,д. 1,,,,\",\"content\":{\"messageFiscalSign\":9297239341736763000,\"code\":3,\"fiscalDriveNumber\":\"9289440300694481\",\"kktRegId\":\"0002128807009086    \",\"userInn\":\"234305505336\",\"fiscalDocumentNumber\":91187,\"dateTime\":1619221800,\"fiscalSign\":2771329287,\"shiftNumber\":460,\"requestNumber\":125,\"operationType\":1,\"totalSum\":98602,\"items\":[{\"name\":\"Крупа Родные Края 800г Гречневая Элита /12\",\"price\":9400,\"quantity\":1,\"sum\":9400,\"nds\":2,\"paymentType\":4,\"productType\":1},{\"name\":\"Пирожки по домашн. с адыг. сыром 400гр/ Пекарня Станичник\",\"price\":13900,\"quantity\":1,\"sum\":13900,\"nds\":2,\"paymentType\":4,\"productType\":1},{\"name\":\"Вода Пьюр Лайф 2л пэт негаз\",\"price\":6200,\"quantity\":2,\"sum\":12400,\"nds\":1,\"paymentType\":4,\"productType\":1},{\"name\":\"Энерг напиток Торнадо Актив 1л пэт\",\"price\":6700,\"quantity\":1,\"sum\":6700,\"nds\":1,\"paymentType\":4,\"productType\":1},{\"name\":\"Корм Педигри дентастикс 77гр для средних собак\",\"price\":8800,\"quantity\":1,\"sum\":8800,\"nds\":1,\"paymentType\":4,\"productType\":1},{\"name\":\"Хлеб Ржаной 300гр нарезка/ХЗ№6\",\"price\":3300,\"quantity\":1,\"sum\":3300,\"nds\":2,\"paymentType\":4,\"productType\":1},{\"name\":\"Помидоры на ветке кг ЙФ\",\"price\":16300,\"quantity\":0.334,\"sum\":5444,\"nds\":2,\"paymentType\":4,\"productType\":1},{\"name\":\"Яблоки Красные кг ЙФ\",\"price\":8600,\"quantity\":0.53,\"sum\":4558,\"nds\":2,\"paymentType\":4,\"productType\":1}],\"operator\":\"Кассир\",\"cashTotalSum\":0,\"ecashTotalSum\":98602,\"prepaidSum\":0,\"creditSum\":0,\"provisionSum\":0,\"fnsUrl\":\"www.nalog.ru\",\"retailPlace\":\"Торговый зал\",\"fiscalDocumentFormatVer\":2,\"nds18\":10334,\"nds10\":3328,\"user\":\"ИП Челухин Е.В.\",\"retailPlaceAddress\":\"350087, г Краснодар, ул им Ягодина МД, 1\",\"appliedTaxationType\":1,\"region\":\"23\",\"numberKkt\":\"0065770006054530\",\"redefine_mask\":0}}";
// {"name":"Сигареты Винстон сильвер т/у","price":16800,"quantity":2,"sum":33600,"nds":1,"paymentType":4,"productType":1},{"name":"! Пакет бренд Апельсин 38х60 11гр","price":500,"quantity":1,"sum":500,"nds":1,"paymentType":4,"productType":1},{"name":"Крупа Родные Края 800г Гречневая Элита /12","price":9400,"quantity":1,"sum":9400,"nds":2,"paymentType":4,"productType":1},*/
    public OutputStream generateCheckReport(List<String> str) {
        /*String file = "C:/Data/pdf/a.pdf";*/
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter(baos).setCompressionLevel(9));
            Document document = new Document(pdfDoc, PageSize.A4);
            setFont(document);
            Map<String, String> kv = new LinkedHashMap<>();
            Map<String, String> kvn = new LinkedHashMap<>();
            /**
             * инициализация страницы, разбивка страницы на столбцы, задание размера страницы
             */
            float offSet = 35;
            System.out.println("Width(): " + PageSize.A4.getWidth());
            System.out.println("Height(): " + PageSize.A4.getHeight());

            float columnWidth = PageSize.A4.getWidth() / 3.4f;
            float columnHeight = PageSize.A4.getHeight() - 50;

            Rectangle rectangle1 = new Rectangle(offSet - 5, offSet, columnWidth, columnHeight);
            Rectangle rectangle2 = new Rectangle(offSet + columnWidth, offSet, 176, 791);
            Rectangle rec3 = new Rectangle(offSet + columnWidth * 2 + 5, offSet, 177, 790);
            System.out.println("rectangle3 height " + rec3.getHeight());
            Rectangle[] columns = {rectangle1, rectangle2, rec3};
            document.setRenderer(new ColumnDocumentRenderer(document, columns));
            //System.out.println();
            //int pageNumber = document.getRenderer().getCurrentArea().getPageNumber();
            /*-------*/
            for (String report : REPORTS) {
                JSONObject jsonObject = new JSONObject(report);
                JSONObject content = new JSONObject(report);
                System.out.println("length(): " + jsonObject.toString().length() + ", pageNumber " + document.getRenderer().getCurrentArea().getBBox().getHeight() + ", pdfDoc.getNumberOfPages() " + pdfDoc.getNumberOfPages());
                /*if (document.getRenderer().getCurrentArea().getPageNumber() != 1 && content.get("items").toString().length() < 3210) {
                    document.add(new AreaBreak(AreaBreakType.NEXT_AREA));
                } else */
                if (pdfDoc.getNumberOfPages() != 0 && jsonObject.toString().length() > 6100
                        || (document.getRenderer().getCurrentArea().getBBox().getHeight() == 790.0 && jsonObject.toString().length() > 1925
                        || (document.getRenderer().getCurrentArea().getBBox().getHeight() == 791.0 && jsonObject.toString().length() > 3860))) {
                    document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                }
                /*определяем размер чека и его размещение*/
                Paragraph p = new Paragraph();
                p.add("версия ");
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
                    if (Objects.equals(k, "userInn")) {
                        header.addCell(createCell("" + getString(
                                jsonObject, ""), 100f, -3f, TextAlignment.CENTER));
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
                    table.addCell(createCell(count, 10f, -3f, TextAlignment.CENTER));
                    table.addCell(createCell(sum, 10f, -3f, TextAlignment.RIGHT));

                    document.add(table);

                    table = new Table(1);
                    table.setWidth(UnitValue.createPercentValue(100));
                    table.setBorder(Border.NO_BORDER);
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
                table.addCell(createCellBold("ИТОГО", TextAlignment.LEFT));
                table.addCell(createCellBold(getDouble(content, "totalSum"), TextAlignment.RIGHT));

                table.addCell(createCell("Наличные", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "cashTotalSum"), 50f, -3f, TextAlignment.RIGHT));

                table.addCell(createCell("Безналичные", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getDouble(content, "ecashTotalSum"), 50f, -3f, TextAlignment.RIGHT));
                table.addCell(createCell("ИНН", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getString(content, "userInn"), 50f, -3f, TextAlignment.RIGHT));
                table.addCell(createCell("Чек №", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getString(content, "requestNumber"), 50f, -3f, TextAlignment.RIGHT));
                table.addCell(createCell("Смена №", 50f, -3f, TextAlignment.LEFT));
                table.addCell(createCell(
                        getString(content, "shiftNumber"), 50f, -3f, TextAlignment.RIGHT));

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
                kvn.put("nds18", "Сумма НДС чека по ставке 20%");
                kvn.put("nds10", "Сумма НДС чека по ставке 10%");
                kvn.put("nds0", "Сумма расчета по чеку с НДС по ставке 0%");
                kvn.put("ndsNo", "Сумма расчета по чеку без НДС");
                kvn.put("nds10110", "Сумма НДС чека по расч. ставке 10/110");
                kvn.put("ndsCalculated10", "Сумма НДС чека по расч. ставке 10/110");
                kvn.put("nds18118", "Сумма НДС чека по расч. ставке 20/120");
                kvn.put("ndsCalculated18", "Сумма НДС чека по расч. ставке 20/120");

                for (String k : kvn.keySet()) {
                    String v = getDouble(content, k);
                    if (v != null) {
                        table.addCell(createCell(kvn.get(k), 50f, -3f, TextAlignment.LEFT));
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
                document.add(new AreaBreak(AreaBreakType.NEXT_AREA));
            } /*End of receipt */
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

    static Cell createCellBold(String text, TextAlignment alignment) {
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
        cell.setWidth(UnitValue.createPercentValue((float) 50.0));

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
        /*Long dateL = j.getLong("dateTime");
        Date date = new Date(dateL * 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");*/
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
