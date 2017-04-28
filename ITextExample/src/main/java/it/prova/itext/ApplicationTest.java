package it.prova.itext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

@SpringBootApplication
public class ApplicationTest {

	
	public static void main(String[] args) throws URISyntaxException,
			FileNotFoundException, IOException, DocumentException {

		createPdf("OUT.compressed.pdf");

	}

	public static void createPdf(String filename) throws IOException,
			DocumentException {
		PdfReader[] readers = { new PdfReader("POSTELMM1.pdf"),
				new PdfReader("POSTELMM2.pdf"), new PdfReader("POSTELMM3.pdf"),
				new PdfReader("POSTELMM4.pdf"), new PdfReader("POSTELMM5.pdf"),
				new PdfReader("POSTELMM6.pdf") };
		createPdf(filename, readers);
	}

	public static void createPdf(String filename, PdfReader[] readers)
			throws IOException, DocumentException {
		Document document = new Document();
		
		// USANDO QUESTA CLASSE IL NUOVO PDF VIENE OTTIMIZZATO PER LE IMMAGINI UGUALI
		PdfSmartCopy copy = new PdfSmartCopy(document, new FileOutputStream(
				filename));
		copy.setMergeFields();
		document.open();
		for (PdfReader reader : readers) {
			copy.addDocument(reader);
		}
		document.close();
		for (PdfReader reader : readers) {
			reader.close();
		}
	}

}
