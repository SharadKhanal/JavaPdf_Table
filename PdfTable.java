package np.com.khanalsharad.PdfTableGenerator;

import java.io.File;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;

public class PdfTable {

	public static void main(String[] args) throws IOException {

		// creating a PdfWriter
		File file = new File("C:\\Users\\Acer\\Desktop\\table.pdf");
		file.createNewFile();

		PdfWriter pdfwriter = new PdfWriter(file);

		// creating PdfDocument object
		PdfDocument pdfDocument = new PdfDocument(pdfwriter);

		// creating a document
		Document document = new Document(pdfDocument);

		float columWidth[] = { 180f, 180f, 180f, 180f };
		Table table = new Table(columWidth);

		table.setTextAlignment(TextAlignment.CENTER);
		table.addCell(new Cell(2, 2).add(new Paragraph("1")));
		table.addCell("2");
		table.addCell("3");
		table.addCell("4");
		table.addCell("5");
		table.addCell("6");
		table.addCell(new Cell(1, 2).add(new Paragraph("7")));
		table.addCell("8");
		document.add(table);

		document.close();
		System.out.println("Pdf created");
	}

	public Document addCell() {
		// TODO Auto-generated method stub
		return null;
	}

}
