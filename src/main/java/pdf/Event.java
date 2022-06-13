package pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPageEvent;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author ArvikV
 * @version 1.0
 * @since 10.06.2022
 */
public class Event implements PdfPageEvent {
    @Override
    public void onOpenDocument(PdfWriter pdfWriter, Document document) {

    }

    @Override
    public void onStartPage(PdfWriter pdfWriter, Document document) {

    }

    @Override
    public void onEndPage(PdfWriter pdfWriter, Document document) {

    }

    @Override
    public void onCloseDocument(PdfWriter pdfWriter, Document document) {

    }

    @Override
    public void onParagraph(PdfWriter pdfWriter, Document document, float v) {

    }

    @Override
    public void onParagraphEnd(PdfWriter pdfWriter, Document document, float v) {

    }

    @Override
    public void onChapter(PdfWriter pdfWriter, Document document, float v, Paragraph paragraph) {

    }

    @Override
    public void onChapterEnd(PdfWriter pdfWriter, Document document, float v) {

    }

    @Override
    public void onSection(PdfWriter pdfWriter, Document document, float v, int i, Paragraph paragraph) {

    }

    @Override
    public void onSectionEnd(PdfWriter pdfWriter, Document document, float v) {

    }

    @Override
    public void onGenericTag(PdfWriter pdfWriter, Document document, Rectangle rectangle, String s) {

    }
}
