package com.arca.creazionexml.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.arca.creazionexml.groovy.IBuildXmlExample;
import com.arca.creazionexml.xml.Anagrafica;
import com.arca.creazionexml.xml.Parametri;
import com.arca.creazionexml.xml.Polizza;
import com.arca.creazionexml.xml.Root;
import com.arca.creazionexml.xml.Testata;

/**
 * @author arx50011
 * 
 */
public class SerializzaXmlGroovy {

	/**
	 * @param args
	 * @throws ValidationException
	 * @throws MarshalException
	 * @throws IOException
	 */
	public static void main(String[] args) throws MarshalException,
			ValidationException, IOException {
		SerializzaXmlGroovy main = new SerializzaXmlGroovy();
		main.faiXMLXStream();

	}

	public void faiXMLXStream() throws FileNotFoundException, MarshalException,
			ValidationException {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:groovy-config.xml");
		ctx.refresh();

		IBuildXmlExample generaXmlService = ctx.getBean(IBuildXmlExample.class);

		Root xml = new Root();

		Parametri parametri = new Parametri();
		parametri.setPathXdp("pathXd+");
		parametri.setXdp("prova°.xdp");
		xml.setParametri(parametri);

		List<Polizza> polizze = new ArrayList<Polizza>();
		Polizza polizza = new Polizza();
		List<Anagrafica> anagrafiche = new ArrayList<Anagrafica>();
		Anagrafica anagrafica = new Anagrafica();

		anagrafiche.add(anagrafica);
		polizza.setAnagrafiche(anagrafiche);
		polizza.setTestata(new Testata());
		polizza.getTestata().setSocieta(417);
		polizze.add(polizza);
		xml.setPolizze(polizze);

		// LIBRERIA GROOVY
		String xmlGroovy = generaXmlService.getXmlAsString(xml);
		System.out.println("XML GROOVY: \n" + xmlGroovy);

	}

}
