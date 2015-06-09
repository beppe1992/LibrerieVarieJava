package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Totale {

	@XStreamAlias("IMPONIBILE")
	private Double imponibile;
	
	@XStreamAlias("IMPOSTE")
	private Double imposte;
	
	@XStreamAlias("SSN")
	private Double ssn;
	
	@XStreamAlias("LORDO")
	private Double lordo;

	public Double getImponibile() {
		return imponibile;
	}

	public void setImponibile(Double imponibile) {
		this.imponibile = imponibile;
	}

	public Double getImposte() {
		return imposte;
	}

	public void setImposte(Double imposte) {
		this.imposte = imposte;
	}

	public Double getSsn() {
		return ssn;
	}

	public void setSsn(Double ssn) {
		this.ssn = ssn;
	}

	public Double getLordo() {
		return lordo;
	}

	public void setLordo(Double lordo) {
		this.lordo = lordo;
	}
	
	
}
