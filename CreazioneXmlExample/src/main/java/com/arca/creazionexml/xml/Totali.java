package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TOTALI")
public class Totali {

	@XStreamAlias("RATAFIRMA")
	private Totale rataFirma;
	
	@XStreamAlias("RATASUCCESSIVA")
	private Totale rataSuccessiva;
	
	@XStreamAlias("ANNUO")
	private Totale annuo;
	
	@XStreamAlias("CONFLITTOINTERESSI")
	private ConflittoInteressi conflittoInteressi;

	public Totale getRataFirma() {
		return rataFirma;
	}

	public void setRataFirma(Totale rataFirma) {
		this.rataFirma = rataFirma;
	}

	public Totale getRataSuccessiva() {
		return rataSuccessiva;
	}

	public void setRataSuccessiva(Totale rataSuccessiva) {
		this.rataSuccessiva = rataSuccessiva;
	}

	public Totale getAnnuo() {
		return annuo;
	}

	public void setAnnuo(Totale annuo) {
		this.annuo = annuo;
	}

	public ConflittoInteressi getConflittoInteressi() {
		return conflittoInteressi;
	}

	public void setConflittoInteressi(ConflittoInteressi conflittoInteressi) {
		this.conflittoInteressi = conflittoInteressi;
	}
	
	
}
