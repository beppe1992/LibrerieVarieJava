package com.arca.creazionexml.castror;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;

import com.arca.creazionexml.xml.Anagrafica;
import com.arca.creazionexml.xml.Parametri;
import com.arca.creazionexml.xml.Polizza;
import com.arca.creazionexml.xml.Root;

/**
 * @author arx50011
 * 
 */
public class SerializzaXmlCastror {

	/**
	 * @param args
	 * @throws ValidationException
	 * @throws MarshalException
	 * @throws IOException
	 */
	public static void main(String[] args) throws MarshalException,
			ValidationException, IOException {
		SerializzaXmlCastror main = new SerializzaXmlCastror();
		main.faiXML();

	}

	public void faiXML() throws FileNotFoundException, MarshalException,
			ValidationException {
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
		polizze.add(polizza);
		xml.setPolizze(polizze);

		// LIBRERIA CASTROR
		StringWriter string = new StringWriter();
		try {

			Mapping mapping = new Mapping();
			// 1. Load the mapping information from the file
			mapping.loadMapping("src/main/resources/CastrorConfiguration.xml");
			Marshaller mar = new Marshaller(string);
			mar.setMapping(mapping);
			mar.setSuppressXSIType(true);

			mar.marshal(xml);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("XML CASTROR: \n" + string.toString());

	}

}
