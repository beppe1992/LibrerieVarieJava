package com.arca.creazionexml.xml;


import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DatiPolizza {

	@XStreamAlias("DATAINIZIOCOPERTURA")
	private Date dataInizioCopertura;
	
	@XStreamAlias("DATATERMINECOPERTURA")
	private Date dataTermineCopertura;
	
	@XStreamAlias("DATAEFFETTOPOLIZZA")
	private Date dataEffettoPolizza;
	
	@XStreamAlias("DATASCADENZAPOLIZZA")
	private Date dataScadenzaPolizza;
	
	@XStreamAlias("FRAZIONAMENTO")
	private String frazionamento;
	
	@XStreamAlias("ADEGUAMENTOAUTOMATICO")
	private String adeguamentoAutomatico;
	
	@XStreamAlias("MASSIMALERCA")
	private Float massimaleRca;
	
	@XStreamAlias("TIPOTARIFFA")
	private String tipoTariffa;
	
	@XStreamAlias("CLASSECU")
	private String classeCu;
	
	@XStreamAlias("CLASSEARCA")
	private String classeArca;
	
	@XStreamAlias("PEJUS")
	private String pejus;
	
	@XStreamAlias("ANZIANITAASSICURATIVA")
	private Integer anzianitaAssicurativa;
	
	@XStreamAlias("BONUSPROTETTO")
	private String bonusProtetto;
	
	@XStreamAlias("FRANCHIGIA")
	private Double franchigia;
	
	@XStreamAlias("NUMERODOCUMENTAZIONE")
	private Integer numeroDocumentazione;
	
	@XStreamAlias("TIPOGUIDA")
	private String tipoGuida;
	
	@XStreamAlias("GUIDAMINORI25")
	private String guidaMinori25;
	
	@XStreamAlias("NSINISTRIULTIMI3ANNI")
	private Integer nSinistriUltimi3Anni;
	
	@XStreamAlias("FORMULAPERSONALIZZAZIONE")
	private String formulaPersonalizzazione;
	
	@XStreamAlias("BERSANI")
	private String bersani;
	
	@XStreamAlias("PRIMOPROPRIETARIO")
	private String primoProprietario;
	
	@XStreamAlias("FACOLTASOSPENSIONE")
	private String facoltaSospensione;
	
	@XStreamAlias("NETTOGARNORC")
	private Float nettoGarNoRc;
	
	@XStreamAlias("IMPORTODETRINFORTUNI")
	private Float importoDetrInfortuni;

	public Date getDataInizioCopertura() {
		return dataInizioCopertura;
	}

	public void setDataInizioCopertura(Date dataInizioCopertura) {
		this.dataInizioCopertura = dataInizioCopertura;
	}

	public Date getDataTermineCopertura() {
		return dataTermineCopertura;
	}

	public void setDataTermineCopertura(Date dataTermineCopertura) {
		this.dataTermineCopertura = dataTermineCopertura;
	}

	public Date getDataEffettoPolizza() {
		return dataEffettoPolizza;
	}

	public void setDataEffettoPolizza(Date dataEffettoPolizza) {
		this.dataEffettoPolizza = dataEffettoPolizza;
	}

	public Date getDataScadenzaPolizza() {
		return dataScadenzaPolizza;
	}

	public void setDataScadenzaPolizza(Date dataScadenzaPolizza) {
		this.dataScadenzaPolizza = dataScadenzaPolizza;
	}

	public String getFrazionamento() {
		return frazionamento;
	}

	public void setFrazionamento(String frazionamento) {
		this.frazionamento = frazionamento;
	}

	public String getAdeguamentoAutomatico() {
		return adeguamentoAutomatico;
	}

	public void setAdeguamentoAutomatico(String adeguamentoAutomatico) {
		this.adeguamentoAutomatico = adeguamentoAutomatico;
	}

	public Float getMassimaleRca() {
		return massimaleRca;
	}

	public void setMassimaleRca(Float massimaleRca) {
		this.massimaleRca = massimaleRca;
	}

	public String getTipoTariffa() {
		return tipoTariffa;
	}

	public void setTipoTariffa(String tipoTariffa) {
		this.tipoTariffa = tipoTariffa;
	}

	public String getClasseCu() {
		return classeCu;
	}

	public void setClasseCu(String classeCu) {
		this.classeCu = classeCu;
	}

	public String getClasseArca() {
		return classeArca;
	}

	public void setClasseArca(String classeArca) {
		this.classeArca = classeArca;
	}

	public String getPejus() {
		return pejus;
	}

	public void setPejus(String pejus) {
		this.pejus = pejus;
	}

	public Integer getAnzianitaAssicurativa() {
		return anzianitaAssicurativa;
	}

	public void setAnzianitaAssicurativa(Integer anzianitaAssicurativa) {
		this.anzianitaAssicurativa = anzianitaAssicurativa;
	}

	public String getBonusProtetto() {
		return bonusProtetto;
	}

	public void setBonusProtetto(String bonusProtetto) {
		this.bonusProtetto = bonusProtetto;
	}

	public Double getFranchigia() {
		return franchigia;
	}

	public void setFranchigia(Double franchigia) {
		this.franchigia = franchigia;
	}

	public Integer getNumeroDocumentazione() {
		return numeroDocumentazione;
	}

	public void setNumeroDocumentazione(Integer numeroDocumentazione) {
		this.numeroDocumentazione = numeroDocumentazione;
	}

	public String getTipoGuida() {
		return tipoGuida;
	}

	public void setTipoGuida(String tipoGuida) {
		this.tipoGuida = tipoGuida;
	}

	public String getGuidaMinori25() {
		return guidaMinori25;
	}

	public void setGuidaMinori25(String guidaMinori25) {
		this.guidaMinori25 = guidaMinori25;
	}

	public Integer getnSinistriUltimi3Anni() {
		return nSinistriUltimi3Anni;
	}

	public void setnSinistriUltimi3Anni(Integer nSinistriUltimi3Anni) {
		this.nSinistriUltimi3Anni = nSinistriUltimi3Anni;
	}

	public String getFormulaPersonalizzazione() {
		return formulaPersonalizzazione;
	}

	public void setFormulaPersonalizzazione(String formulaPersonalizzazione) {
		this.formulaPersonalizzazione = formulaPersonalizzazione;
	}

	public String getBersani() {
		return bersani;
	}

	public void setBersani(String bersani) {
		this.bersani = bersani;
	}

	public String getPrimoProprietario() {
		return primoProprietario;
	}

	public void setPrimoProprietario(String primoProprietario) {
		this.primoProprietario = primoProprietario;
	}

	public String getFacoltaSospensione() {
		return facoltaSospensione;
	}

	public void setFacoltaSospensione(String facoltaSospensione) {
		this.facoltaSospensione = facoltaSospensione;
	}

	public Float getNettoGarNoRc() {
		return nettoGarNoRc;
	}

	public void setNettoGarNoRc(Float nettoGarNoRc) {
		this.nettoGarNoRc = nettoGarNoRc;
	}

	public Float getImportoDetrInfortuni() {
		return importoDetrInfortuni;
	}

	public void setImportoDetrInfortuni(Float importoDetrInfortuni) {
		this.importoDetrInfortuni = importoDetrInfortuni;
	}

		
}
