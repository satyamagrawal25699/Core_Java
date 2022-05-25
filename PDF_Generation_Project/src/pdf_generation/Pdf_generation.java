package pdf_generation;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf_generation {

	public static void main(String[] args) {
		try {
			String file_name="E:\\PDF_Generation\\Automated_Pdf.pdf";
			Document document=new Document();
			
			PdfWriter.getInstance(document, new FileOutputStream(file_name));
			document.open();
			
			//Paragrapf writing;
			Paragraph para=new Paragraph("This is new Testing pdf project by knightingale ");
			document.add(para);
			
			//For space between para and table;
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			
			//Table writing;
			
			PdfPTable table=new PdfPTable(3);
			PdfPCell c1=new PdfPCell(new Phrase("Heading1"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Heading2"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Heading3"));
			table.addCell(c1);
			table.setHeaderRows(1);
			table.addCell("1");
			table.addCell("2");
			table.addCell("3");
			table.addCell("4");
			table.addCell("4");
			
			document.add(table);
			
			
			
			
			
			
			
			document.close();
			
			System.out.println("finished");
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
