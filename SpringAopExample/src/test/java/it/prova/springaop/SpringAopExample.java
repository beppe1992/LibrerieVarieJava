package it.prova.springaop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.prova.springaop.service.MioSitoService;

@ContextConfiguration(locations = { "classpath:springaop-configuration.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringAopExample {

	@Autowired
	MioSitoService service;
	
	@Test
	public void mainBeforeeAfterReturning() {

		
		service.loginSuMioSito("Giuseppe");
		
	}
	
	@Test
	public void mainTuttiIGet() {

		// viene eseguito lo stessob aspetto logAfter sia se viene chiamato il metodo getLogin che getLoginUpperCase
	
		service.getLogin();
		
		service.getLoginUpperCase();
		
	}
	
	@Test
	public void metodoInErrore() {

		// viene eseguito l'aspetto che intercetta l'errore
		
		service.metodoInErrore();
		
	}
}


