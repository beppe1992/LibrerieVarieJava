package com.arca.creazionexml.xml;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RATA")
public class Rata {

	@XStreamAlias("SCADENZARATA")
	private Date scadenzaRata;
	
	@XStreamAlias("DATAPAGAMENTO")
	private Date dataPagamento;
	
	@XStreamAlias("IMPORTOPAGATO")
	private Double importoPagato;

	public Date getScadenzaRata() {
		return scadenzaRata;
	}

	public void setScadenzaRata(Date scadenzaRata) {
		this.scadenzaRata = scadenzaRata;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getImportoPagato() {
		return importoPagato;
	}

	public void setImportoPagato(Double importoPagato) {
		this.importoPagato = importoPagato;
	}
	
	
}
