package com.arca.pdfbox.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class ApplicationTest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) throws IOException,
			URISyntaxException {

		URL dir_url = ClassLoader.getSystemResource("MODCONTR.pdf");
		File input = new File(dir_url.toURI());
		PDDocument pd = PDDocument.load(input);

		System.out.println(pd.getNumberOfPages());
		System.out.println(pd.isEncrypted());

		PDFTextStripper stripper = new PDFTextStripper();
		stripper.setStartPage(1); // Start extracting from page 3
		stripper.setEndPage(2); // Extract till page 5
		StringWriter wr = new StringWriter();
		stripper.writeText(pd, wr);

		System.out.println(wr.toString());

		String pdfString = wr.toString();

		if (pdfString.contains("IT 04 O 01015 86781 000000001547")
				&& pdfString.contains("71,00") && pdfString.contains("308,00")
				&& pdfString.contains("07362602198224")
				&& pdfString.contains("FADDA GIOVANNI ANTONIO")){
			System.out.println("PDF OK");
		}
		else{
			System.out.println("PDF KO");
		}

			if (pd != null) {
				pd.close();
			}

	}

}
