package com.arca.creazionexml.xml;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
public class Vincolo {

	@XStreamAlias("ENTEVINCOLATARIO")
	private String enteVincolatario;
	
	@XStreamAlias("TIPOVINCOLO")
	private String tipoVincolo;
	
	@XStreamAlias("SCADENZAVINCOLO")
	private Date scadenzaVincolo;

	public String getEnteVincolatario() {
		return enteVincolatario;
	}

	public void setEnteVincolatario(String enteVincolatario) {
		this.enteVincolatario = enteVincolatario;
	}

	public String getTipoVincolo() {
		return tipoVincolo;
	}

	public void setTipoVincolo(String tipoVincolo) {
		this.tipoVincolo = tipoVincolo;
	}

	public Date getScadenzaVincolo() {
		return scadenzaVincolo;
	}

	public void setScadenzaVincolo(Date scadenzaVincolo) {
		this.scadenzaVincolo = scadenzaVincolo;
	}
	
	
}
