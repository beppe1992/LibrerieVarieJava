package it.prova.itext;

import java.math.BigDecimal;

import it.prova.itext.bootservice.CompressPdfService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class UnionPdfest {

	private final Logger logger = LoggerFactory
			.getLogger(UnionPdfest.class);
	
	@Autowired
	private CompressPdfService service;

	@Test
	public void testFreeMarkerTemplate() throws Exception {
		service.compressPdfDaDb();
		
		logger.info("FINE");
	}

	
}
