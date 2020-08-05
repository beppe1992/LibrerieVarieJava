package com.arca.creazionexml.xml;

import java.math.BigDecimal;
import java.util.Date;

import com.arca.creazionexml.xstream.LeftPadConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

public class Testata {

	@XStreamAlias("SOCIETA")
	private Integer societa;

	@XStreamAlias("NUMEROPOLIZZA")
	private BigDecimal numeroPolizza;

	@XStreamConverter(value = LeftPadConverter.class, ints = { 14 }, strings = { "0" })
	@XStreamAlias("NUMEROPOLIZZACONVERTER")
	private BigDecimal numeroPolizzaConverter;

	@XStreamAlias("NUMEROPROPOSTA")
	private BigDecimal numeroProposta;

	@XStreamAlias("DATASCADENZAPROPOSTA")
	private Date dataScadenzaProposta;

	@XStreamAlias("NUMEROPOLIZZASOSTITUITA")
	private BigDecimal numeroPolizzaSostituita;

	@XStreamAlias("MOTIVOSOSTITUZIONE")
	private String motivoSostituzione;

	@XStreamAlias("CONVENZIONE")
	private String convenzione;

	@XStreamAlias("CODFILIALE")
	private String codFiliale;

	@XStreamAlias("DESCRFILIALE")
	private String descrFiliale;

	@XStreamAlias("DATASTAMPALETTERA")
	private Date dataStampaLettera;

	@XStreamAlias("CODICEPRODOTTO")
	private String codiceProdotto;

	@XStreamAlias("DESCRPRODOTTO")
	private String descrProdotto;

	@XStreamAlias("CODBANCA")
	private String codBanca;

	@XStreamAlias("DESCRBANCA")
	private String descrBanca;

	@XStreamAlias("EDIZIONICGA")
	private String edizioniCga;

	@XStreamAlias("CHECKDIGIT")
	private String checkDigit;

	@XStreamAlias("OPERATORE")
	private String operatore;

	@XStreamAlias("FORZATURAANIA")
	private String forzaturaAnia;

	@XStreamAlias("IBAN")
	private String iban;

	@XStreamAlias("PRIVACY")
	private String privacy;

	@XStreamAlias("CODICEALLEGATO")
	private Integer codiceAllegato;

	public BigDecimal getNumeroPolizzaConverter() {
		return numeroPolizzaConverter;
	}

	public void setNumeroPolizzaConverter(BigDecimal numeroPolizzaConverter) {
		this.numeroPolizzaConverter = numeroPolizzaConverter;
	}

	public Integer getSocieta() {
		return societa;
	}

	public void setSocieta(Integer societa) {
		this.societa = societa;
	}

	public BigDecimal getNumeroPolizza() {
		return numeroPolizzaConverter;
	}

	public void setNumeroPolizza(BigDecimal numeroPolizza) {
		this.numeroPolizzaConverter = numeroPolizza;
	}

	public BigDecimal getNumeroProposta() {
		return numeroProposta;
	}

	public void setNumeroProposta(BigDecimal numeroProposta) {
		this.numeroProposta = numeroProposta;
	}

	public Date getDataScadenzaProposta() {
		return dataScadenzaProposta;
	}

	public void setDataScadenzaProposta(Date dataScadenzaProposta) {
		this.dataScadenzaProposta = dataScadenzaProposta;
	}

	public BigDecimal getNumeroPolizzaSostituita() {
		return numeroPolizzaSostituita;
	}

	public void setNumeroPolizzaSostituita(BigDecimal numeroPolizzaSostituita) {
		this.numeroPolizzaSostituita = numeroPolizzaSostituita;
	}

	public String getMotivoSostituzione() {
		return motivoSostituzione;
	}

	public void setMotivoSostituzione(String motivoSostituzione) {
		this.motivoSostituzione = motivoSostituzione;
	}

	public String getConvenzione() {
		return convenzione;
	}

	public void setConvenzione(String convenzione) {
		this.convenzione = convenzione;
	}

	public String getCodFiliale() {
		return codFiliale;
	}

	public void setCodFiliale(String codFiliale) {
		this.codFiliale = codFiliale;
	}

	public String getDescrFiliale() {
		return descrFiliale;
	}

	public void setDescrFiliale(String descrFiliale) {
		this.descrFiliale = descrFiliale;
	}

	public Date getDataStampaLettera() {
		return dataStampaLettera;
	}

	public void setDataStampaLettera(Date dataStampaLettera) {
		this.dataStampaLettera = dataStampaLettera;
	}

	public String getCodiceProdotto() {
		return codiceProdotto;
	}

	public void setCodiceProdotto(String codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}

	public String getDescrProdotto() {
		return descrProdotto;
	}

	public void setDescrProdotto(String descrProdotto) {
		this.descrProdotto = descrProdotto;
	}

	public String getCodBanca() {
		return codBanca;
	}

	public void setCodBanca(String codBanca) {
		this.codBanca = codBanca;
	}

	public String getDescrBanca() {
		return descrBanca;
	}

	public void setDescrBanca(String descrBanca) {
		this.descrBanca = descrBanca;
	}

	public String getEdizioniCga() {
		return edizioniCga;
	}

	public void setEdizioniCga(String edizioniCga) {
		this.edizioniCga = edizioniCga;
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getOperatore() {
		return operatore;
	}

	public void setOperatore(String operatore) {
		this.operatore = operatore;
	}

	public String getForzaturaAnia() {
		return forzaturaAnia;
	}

	public void setForzaturaAnia(String forzaturaAnia) {
		this.forzaturaAnia = forzaturaAnia;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public Integer getCodiceAllegato() {
		return codiceAllegato;
	}

	public void setCodiceAllegato(Integer codiceAllegato) {
		this.codiceAllegato = codiceAllegato;
	}

}
