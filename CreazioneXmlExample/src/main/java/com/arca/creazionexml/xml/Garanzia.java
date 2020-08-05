package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("GARANZIA")
public class Garanzia {

	@XStreamAlias("CODICEGARANZIA")
	private Integer codiceGaranzia;
	
	@XStreamAlias("DESCRIZIONE")
	private String descrizione;
	
	@XStreamAlias("PREMIOFIRMA")
	private Double premioFirma;
	
	@XStreamAlias("PREMIORATASUCCESSIVA")
	private Double premioRataSuccessiva;
	
	@XStreamAlias("PREMIOANNUO")
	private Double premioAnnuo;
	
	@XStreamAlias("MASSIMALE")
	private Float massimale;
	
	@XStreamAlias("COPERTURA")
	private String copertura;
	
	@XStreamAlias("FRANCHIGIA")
	private Double franchigia;

	public Integer getCodiceGaranzia() {
		return codiceGaranzia;
	}

	public void setCodiceGaranzia(Integer codiceGaranzia) {
		this.codiceGaranzia = codiceGaranzia;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Double getPremioFirma() {
		return premioFirma;
	}

	public void setPremioFirma(Double premioFirma) {
		this.premioFirma = premioFirma;
	}

	public Double getPremioRataSuccessiva() {
		return premioRataSuccessiva;
	}

	public void setPremioRataSuccessiva(Double premioRataSuccessiva) {
		this.premioRataSuccessiva = premioRataSuccessiva;
	}

	public Double getPremioAnnuo() {
		return premioAnnuo;
	}

	public void setPremioAnnuo(Double premioAnnuo) {
		this.premioAnnuo = premioAnnuo;
	}

	public Float getMassimale() {
		return massimale;
	}

	public void setMassimale(Float massimale) {
		this.massimale = massimale;
	}

	public String getCopertura() {
		return copertura;
	}

	public void setCopertura(String copertura) {
		this.copertura = copertura;
	}

	public Double getFranchigia() {
		return franchigia;
	}

	public void setFranchigia(Double franchigia) {
		this.franchigia = franchigia;
	}
	
	
}
