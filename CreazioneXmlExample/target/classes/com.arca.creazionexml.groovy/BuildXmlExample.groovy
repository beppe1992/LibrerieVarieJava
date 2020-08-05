package com.arca.creazionexml.groovy

import com.arca.creazionexml.groovy.IBuildXmlExample
import com.arca.creazionexml.xml.Root
import groovy.xml.StreamingMarkupBuilder
import groovy.xml.XmlUtil
import groovy.util.slurpersupport.GPathResult
import java.io.Serializable
import groovy.xml.MarkupBuilder

/**
 * Classe Groovy che crea il file XML
 * 
 * @author Giordano Giuseppe
 */

public class BuildXmlExample implements IBuildXmlExample {
	
	public String getXmlAsString(Root dati){
			
		def polizze = dati.getPolizze()	
						
		def xmlBuilder = new StreamingMarkupBuilder()
		xmlBuilder.bind {
		  'ROOT' {
		    'PARAMETRI' {
		    	'PATH_XDP' (dati.getParametri().getPathXdp())
		    	'XDP' (dati.getParametri().getXdp())
		     }
		     'POLIZZE' {
		    	polizze.each { f ->
			    	"POLIZZA" (f.getTestata().getSocieta())
			 	}
		     }
		     
		   }

		}
	}
		
}
