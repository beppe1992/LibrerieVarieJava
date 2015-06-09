package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Mav {

	@XStreamAlias("DAPAGARE")
	private Double daPagare;
	
	@XStreamAlias("CODICEMAV")
	private String codiceMav;

	public Double getDaPagare() {
		return daPagare;
	}

	public void setDaPagare(Double daPagare) {
		this.daPagare = daPagare;
	}

	public String getCodiceMav() {
		return codiceMav;
	}

	public void setCodiceMav(String codiceMav) {
		this.codiceMav = codiceMav;
	}
	
	
}
