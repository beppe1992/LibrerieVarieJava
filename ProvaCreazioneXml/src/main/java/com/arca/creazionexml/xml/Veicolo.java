package com.arca.creazionexml.xml;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
public class Veicolo {

	@XStreamAlias("TIPOVEICOLO")
	private String tipoVeicolo;
	
	@XStreamAlias("CATEGORIAVEICOLO")
	private String categoriaVeicolo;
	
	@XStreamAlias("DATAIMMATRICOLAZIONE")
	private Date dataImmatricolazione;
	
	@XStreamAlias("TARGATELAIO")
	private String targaTelaio;
	
	@XStreamAlias("POTENZAFISCALE")
	private Integer potenzaFiscale;
	
	@XStreamAlias("CILINDRATAMOTOCICLI")
	private Integer cilindrataMotocicli;
	
	@XStreamAlias("POTENZAREALE")
	private Integer potenzaReale;
	
	@XStreamAlias("TIPOALIMENTAZIONE")
	private String tipoAlimentazione;
	
	@XStreamAlias("NUMEROPOSTI")
	private Integer numeroPosti;
	
	@XStreamAlias("TRAINORIMORCHIO")
	private String trainoRimorchio;
	
	@XStreamAlias("FUORISTRADA")
	private String fuoristrada;
	
	@XStreamAlias("PESOMOTRICEERIMORCHIO")
	private Float pesoMotriceERimorchio;
	
	@XStreamAlias("PESOMOTRICE")
	private Float pesoMotrice;
	
	@XStreamAlias("USISPECIALI")
	private String usiSpeciali;
	
	@XStreamAlias("VALOREVEICOLO")
	private Float valoreVeicolo;
	
	@XStreamAlias("VALOREOPTIONAL")
	private Float valoreOptional;
	
	@XStreamAlias("VALOREAUDIOFONO")
	private Float valoreAudioFono;
	
	@XStreamAlias("ANTIFURTOSATELLITARE")
	private String antifurtoSatellitare;
	
	@XStreamAlias("DATAACQUISTO")
	private Date dataAcquisto;
	
	@XStreamAlias("QUADRICICLO")
	private String quadriciclo;
	
	@XStreamAlias("MULTIADATTATO")
	private String multiadattato;

	public String getTipoVeicolo() {
		return tipoVeicolo;
	}

	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	public String getCategoriaVeicolo() {
		return categoriaVeicolo;
	}

	public void setCategoriaVeicolo(String categoriaVeicolo) {
		this.categoriaVeicolo = categoriaVeicolo;
	}

	public Date getDataImmatricolazione() {
		return dataImmatricolazione;
	}

	public void setDataImmatricolazione(Date dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}

	public String getTargaTelaio() {
		return targaTelaio;
	}

	public void setTargaTelaio(String targaTelaio) {
		this.targaTelaio = targaTelaio;
	}

	public Integer getPotenzaFiscale() {
		return potenzaFiscale;
	}

	public void setPotenzaFiscale(Integer potenzaFiscale) {
		this.potenzaFiscale = potenzaFiscale;
	}

	public Integer getCilindrataMotocicli() {
		return cilindrataMotocicli;
	}

	public void setCilindrataMotocicli(Integer cilindrataMotocicli) {
		this.cilindrataMotocicli = cilindrataMotocicli;
	}

	public Integer getPotenzaReale() {
		return potenzaReale;
	}

	public void setPotenzaReale(Integer potenzaReale) {
		this.potenzaReale = potenzaReale;
	}

	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	public Integer getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public String getTrainoRimorchio() {
		return trainoRimorchio;
	}

	public void setTrainoRimorchio(String trainoRimorchio) {
		this.trainoRimorchio = trainoRimorchio;
	}

	public String getFuoristrada() {
		return fuoristrada;
	}

	public void setFuoristrada(String fuoristrada) {
		this.fuoristrada = fuoristrada;
	}

	public Float getPesoMotriceERimorchio() {
		return pesoMotriceERimorchio;
	}

	public void setPesoMotriceERimorchio(Float pesoMotriceERimorchio) {
		this.pesoMotriceERimorchio = pesoMotriceERimorchio;
	}

	public Float getPesoMotrice() {
		return pesoMotrice;
	}

	public void setPesoMotrice(Float pesoMotrice) {
		this.pesoMotrice = pesoMotrice;
	}

	public String getUsiSpeciali() {
		return usiSpeciali;
	}

	public void setUsiSpeciali(String usiSpeciali) {
		this.usiSpeciali = usiSpeciali;
	}

	public Float getValoreVeicolo() {
		return valoreVeicolo;
	}

	public void setValoreVeicolo(Float valoreVeicolo) {
		this.valoreVeicolo = valoreVeicolo;
	}

	public Float getValoreOptional() {
		return valoreOptional;
	}

	public void setValoreOptional(Float valoreOptional) {
		this.valoreOptional = valoreOptional;
	}

	public Float getValoreAudioFono() {
		return valoreAudioFono;
	}

	public void setValoreAudioFono(Float valoreAudioFono) {
		this.valoreAudioFono = valoreAudioFono;
	}

	public String getAntifurtoSatellitare() {
		return antifurtoSatellitare;
	}

	public void setAntifurtoSatellitare(String antifurtoSatellitare) {
		this.antifurtoSatellitare = antifurtoSatellitare;
	}

	public Date getDataAcquisto() {
		return dataAcquisto;
	}

	public void setDataAcquisto(Date dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}

	public String getQuadriciclo() {
		return quadriciclo;
	}

	public void setQuadriciclo(String quadriciclo) {
		this.quadriciclo = quadriciclo;
	}

	public String getMultiadattato() {
		return multiadattato;
	}

	public void setMultiadattato(String multiadattato) {
		this.multiadattato = multiadattato;
	}

		
}
