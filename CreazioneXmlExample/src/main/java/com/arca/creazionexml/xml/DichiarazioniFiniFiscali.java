package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DichiarazioniFiniFiscali {

	@XStreamAlias("ANNO")
	private Integer anno;
	
	@XStreamAlias("IMPORTOINFORTUNI")
	private Double importoInfortuni;
	
	@XStreamAlias("IMPORTOSERVIZIOSANITARIO")
	private Double importoServizioSanitario;

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Double getImportoInfortuni() {
		return importoInfortuni;
	}

	public void setImportoInfortuni(Double importoInfortuni) {
		this.importoInfortuni = importoInfortuni;
	}

	public Double getImportoServizioSanitario() {
		return importoServizioSanitario;
	}

	public void setImportoServizioSanitario(Double importoServizioSanitario) {
		this.importoServizioSanitario = importoServizioSanitario;
	}

		
}
