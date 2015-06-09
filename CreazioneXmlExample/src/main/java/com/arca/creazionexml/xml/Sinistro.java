package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SINISTRO")
public class Sinistro {

	@XStreamAlias("NUMERO")
	private Integer numero;
	
	@XStreamAlias("PERCENTUALE")
	private Integer percentuale;
	
	@XStreamAlias("FLAG")
	private String flag;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(Integer percentuale) {
		this.percentuale = percentuale;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

		
}
