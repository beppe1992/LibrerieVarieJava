package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("INDIRIZZO")
public class Indirizzo {

	@XStreamAlias("TIPOIND")
	private String tipoInd;
	
	@XStreamAlias("VIAIND")
	private String viaInd;
	
	@XStreamAlias("CAPIND")
	private Integer capInd;
	
	@XStreamAlias("COMUNEIND")
	private String comuneInd;
	
	@XStreamAlias("PROVINCIAIND")
	private String provinciaInd;
	
	@XStreamAlias("PRESSOIND")
	private String pressoInd;

	public String getTipoInd() {
		return tipoInd;
	}

	public void setTipoInd(String tipoInd) {
		this.tipoInd = tipoInd;
	}

	public String getViaInd() {
		return viaInd;
	}

	public void setViaInd(String viaInd) {
		this.viaInd = viaInd;
	}

	public Integer getCapInd() {
		return capInd;
	}

	public void setCapInd(Integer capInd) {
		this.capInd = capInd;
	}

	public String getComuneInd() {
		return comuneInd;
	}

	public void setComuneInd(String comuneInd) {
		this.comuneInd = comuneInd;
	}

	public String getProvinciaInd() {
		return provinciaInd;
	}

	public void setProvinciaInd(String provinciaInd) {
		this.provinciaInd = provinciaInd;
	}

	public String getPressoInd() {
		return pressoInd;
	}

	public void setPressoInd(String pressoInd) {
		this.pressoInd = pressoInd;
	}

		
}
