package com.arca.creazionexml.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ROOT")
public class Root {

	@XStreamAlias("PARAMETRI")
	private Parametri parametri;
	
	@XStreamAlias("POLIZZE")
	private List<Polizza> polizze;

	public Parametri getParametri() {
		return parametri;
	}

	public void setParametri(Parametri parametri) {
		this.parametri = parametri;
	}

	public List<Polizza> getPolizze() {
		return polizze;
	}

	public void setPolizze(List<Polizza> polizze) {
		this.polizze = polizze;
	}

	
	
	
}
