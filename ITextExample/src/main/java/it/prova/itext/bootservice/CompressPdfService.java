package it.prova.itext.bootservice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.prova.itext.dao.GetPdfDao;
import it.prova.itext.dto.PdfDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;

@Controller
public class CompressPdfService {

	@Autowired
	GetPdfDao dao;

	public void compressPdfDaDb() throws IOException, DocumentException {

		createPdf("OUT.compressed.pdf");

	}

	private void createPdf(String filename) throws IOException,
			DocumentException {

		List<PdfDto> pdfDaUnire = dao.findAll();

		List<PdfReader> pdfUniti = new ArrayList<PdfReader>();
		for (PdfDto pdf : pdfDaUnire) {

			pdfUniti.add(new PdfReader(pdf.getPdf()));
		}

		PdfReader[] arr = pdfUniti.toArray(new PdfReader[pdfUniti.size()]);

		createPdf(filename, arr);
	}

	private void createPdf(String filename, PdfReader[] readers)
			throws IOException, DocumentException {
		Document document = new Document();

		// USANDO QUESTA CLASSE IL NUOVO PDF VIENE OTTIMIZZATO PER LE IMMAGINI
		// UGUALI
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
