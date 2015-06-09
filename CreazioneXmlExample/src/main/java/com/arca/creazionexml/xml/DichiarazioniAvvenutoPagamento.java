package com.arca.creazionexml.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DichiarazioniAvvenutoPagamento {

	@XStreamAlias("ANNO")
	private Integer anno;
	
	@XStreamAlias("TOTALEPAGATO")
	private Double totalePagato;
	
	@XStreamAlias("RETE")
	private List<Rata> rete;

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Double getTotalePagato() {
		return totalePagato;
	}

	public void setTotalePagato(Double totalePagato) {
		this.totalePagato = totalePagato;
	}

	public List<Rata> getRete() {
		return rete;
	}

	public void setRete(List<Rata> rete) {
		this.rete = rete;
	}

		
}
