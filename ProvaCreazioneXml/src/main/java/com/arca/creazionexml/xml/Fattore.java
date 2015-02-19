package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("FATTORE")
public class Fattore {

	@XStreamAlias("DESCRIZIONE")
	private String descrizione;
	
	@XStreamAlias("VALORE")
	private String valore;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}
	
	
}
