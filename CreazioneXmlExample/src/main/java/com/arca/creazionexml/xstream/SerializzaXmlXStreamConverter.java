package com.arca.creazionexml.xstream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.ContentModel;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.stream.StreamResult;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.util.DocumentHandlerAdapter;
import org.exolab.castor.xml.util.SAX2ANY;

import com.arca.creazionexml.xml.Anagrafica;
import com.arca.creazionexml.xml.Parametri;
import com.arca.creazionexml.xml.Polizza;
import com.arca.creazionexml.xml.Root;
import com.arca.creazionexml.xml.Testata;
import com.thoughtworks.xstream.MarshallingStrategy;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.WriterWrapper;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * @author arx50011
 * 
 */
public class SerializzaXmlXStreamConverter {

	/**
	 * @param args
	 * @throws ValidationException
	 * @throws MarshalException
	 * @throws IOException
	 */
	public static void main(String[] args) throws MarshalException,
			ValidationException, IOException {
		SerializzaXmlXStreamConverter main = new SerializzaXmlXStreamConverter();
		main.faiXML();

	}

	public void faiXML() throws FileNotFoundException, MarshalException,
			ValidationException {
		Root xml = new Root();

		

		List<Polizza> polizze = new ArrayList<Polizza>();
		Polizza polizza = new Polizza();
		polizza.setTestata(new Testata());
		polizza.getTestata().setNumeroPolizzaConverter(new BigDecimal("5646"));
		polizze.add(polizza);
		xml.setPolizze(polizze);

		
		// LIBRERIA XSTREAM
		XStream xStream = new XStream(new DomDriver());
		xStream.aliasPackage("", "com.arca.creazionexml.xml");
		xStream.autodetectAnnotations(true);
		System.out.println("XML XSTREAM: \n"+xStream.toXML(xml));

	}

}
