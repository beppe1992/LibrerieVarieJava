package com.arca.creazionexml.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Anno {

	@XStreamAlias("ANNO")
	private Integer anno;
	
	@XStreamAlias("SINISTRIRESPPRINC")
	private Integer sinistriResponsabilitaPrincipaòe;
	
	@XStreamAlias("SINISTRIRESPPARITARIA")
	private List<Sinistro> sinistriResponsabilitaParitaria;

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getSinistriResponsabilitaPrincipaòe() {
		return sinistriResponsabilitaPrincipaòe;
	}

	public void setSinistriResponsabilitaPrincipaòe(
			Integer sinistriResponsabilitaPrincipaòe) {
		this.sinistriResponsabilitaPrincipaòe = sinistriResponsabilitaPrincipaòe;
	}

	public List<Sinistro> getSinistriResponsabilitaParitaria() {
		return sinistriResponsabilitaParitaria;
	}

	public void setSinistriResponsabilitaParitaria(
			List<Sinistro> sinistriResponsabilitaParitaria) {
		this.sinistriResponsabilitaParitaria = sinistriResponsabilitaParitaria;
	}

		
}
