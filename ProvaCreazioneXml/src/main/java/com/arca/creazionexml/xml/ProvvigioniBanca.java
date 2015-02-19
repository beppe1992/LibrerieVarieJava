package com.arca.creazionexml.xml;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ProvvigioniBanca {

	@XStreamAlias("DATACA")
	private Date dataCa;
	
	@XStreamAlias("MESE")
	private Integer mese;
	
	private Double importoProvvigioni;

	public Date getDataCa() {
		return dataCa;
	}

	public void setDataCa(Date dataCa) {
		this.dataCa = dataCa;
	}

	public Integer getMese() {
		return mese;
	}

	public void setMese(Integer mese) {
		this.mese = mese;
	}

	public Double getImportoProvvigioni() {
		return importoProvvigioni;
	}

	public void setImportoProvvigioni(Double importoProvvigioni) {
		this.importoProvvigioni = importoProvvigioni;
	}

		
}
