package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ConflittoInteressi {

	@XStreamAlias("PREMIOLORDOANNUO")
	private Double premioLordoAnnuo;
	
	@XStreamAlias("PREMIOLORDORCA")
	private Double premioLordoRca;
	
	@XStreamAlias("PROVVIGIONERCA")
	private Double provvigioneRca;
	
	@XStreamAlias("PROVVIGIONERCAPER")
	private Double provvigioneRcaPerc;
	
	@XStreamAlias("COSTIFISSIPV")
	private Double costiFissiPv;
	
	@XStreamAlias("PROVVIGIONINONEROGATE")
	private Double provvigioniNonErogate;
	
	@XStreamAlias("COSTIFISSITOT")
	private Double costiFissiTot;
	
	@XStreamAlias("PROVVIGIONIEROGATE")
	private Double provvigioniErogate;
	
	@XStreamAlias("SCONTORCA")
	private Double scontoRca;
	
	@XStreamAlias("VINCOLATARIOINTERMEDIARIO")
	private String vincolatarioIntermediario;

	public Double getPremioLordoAnnuo() {
		return premioLordoAnnuo;
	}

	public void setPremioLordoAnnuo(Double premioLordoAnnuo) {
		this.premioLordoAnnuo = premioLordoAnnuo;
	}

	public Double getPremioLordoRca() {
		return premioLordoRca;
	}

	public void setPremioLordoRca(Double premioLordoRca) {
		this.premioLordoRca = premioLordoRca;
	}

	public Double getProvvigioneRca() {
		return provvigioneRca;
	}

	public void setProvvigioneRca(Double provvigioneRca) {
		this.provvigioneRca = provvigioneRca;
	}

	public Double getProvvigioneRcaPerc() {
		return provvigioneRcaPerc;
	}

	public void setProvvigioneRcaPerc(Double provvigioneRcaPerc) {
		this.provvigioneRcaPerc = provvigioneRcaPerc;
	}

	public Double getCostiFissiPv() {
		return costiFissiPv;
	}

	public void setCostiFissiPv(Double costiFissiPv) {
		this.costiFissiPv = costiFissiPv;
	}

	public Double getProvvigioniNonErogate() {
		return provvigioniNonErogate;
	}

	public void setProvvigioniNonErogate(Double provvigioniNonErogate) {
		this.provvigioniNonErogate = provvigioniNonErogate;
	}

	public Double getCostiFissiTot() {
		return costiFissiTot;
	}

	public void setCostiFissiTot(Double costiFissiTot) {
		this.costiFissiTot = costiFissiTot;
	}

	public Double getProvvigioniErogate() {
		return provvigioniErogate;
	}

	public void setProvvigioniErogate(Double provvigioniErogate) {
		this.provvigioniErogate = provvigioniErogate;
	}

	public Double getScontoRca() {
		return scontoRca;
	}

	public void setScontoRca(Double scontoRca) {
		this.scontoRca = scontoRca;
	}

	public String getVincolatarioIntermediario() {
		return vincolatarioIntermediario;
	}

	public void setVincolatarioIntermediario(String vincolatarioIntermediario) {
		this.vincolatarioIntermediario = vincolatarioIntermediario;
	}
	
	
}
