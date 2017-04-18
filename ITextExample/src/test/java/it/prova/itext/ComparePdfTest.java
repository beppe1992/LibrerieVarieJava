package it.prova.itext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;

import it.prova.itext.bootservice.CompressPdfService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.itextpdf.text.DocumentException;
import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

public class ComparePdfTest {

	private final Logger logger = LoggerFactory.getLogger(ComparePdfTest.class);

	@Test
	public void testFreeMarkerTemplate() throws URISyntaxException,
			FileNotFoundException, IOException, DocumentException {

		String file1 = "D:/GG_condivisa/PROVE_ITEXT/QuietDichFiniFiscaliVF/QuietDichFiniFiscaliVF_NEW_VERSIONE.pdf";
		String file2 = "D:/GG_condivisa/PROVE_ITEXT/QuietDichFiniFiscaliVF/QuietDichFiniFiscaliVF_ORIGINALE.pdf";

		// compares the pdf documents &amp; returns a boolean
		// true if both files have same content. false otherwise.
		// Default is CompareMode.TEXT_MODE

		PDFUtil pdfUtil = new PDFUtil();
		pdfUtil.setCompareMode(CompareMode.TEXT_MODE);
		logger.info("ESITO COMPARE: " +pdfUtil.compare(file1, file2));
	}


}
