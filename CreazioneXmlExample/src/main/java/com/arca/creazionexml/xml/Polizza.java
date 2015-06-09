package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("POLIZZA")
public class Polizza {

	@XStreamAlias("ANAGRAFICHE")
	private java.util.List<Anagrafica> anagrafiche;
	
	@XStreamAlias("VINCOLO")
	private Vincolo vincolo;
	
	@XStreamAlias("PROVVIGIONIBANCA")
	private ProvvigioniBanca provvigioniBanca;
	
	@XStreamAlias("DICHIARAZIONIFINIFISCALI")
	private DichiarazioniFiniFiscali dichiarazioniFiniFiscali;
	
	@XStreamAlias("DICHIARAZIONIAVVENUTOPAGAMENTO")
	private DichiarazioniAvvenutoPagamento dichiarazioniAvvenutoPagamento;
	
	@XStreamAlias("MAV")
	private Mav mav;
	
	@XStreamAlias("DATIPOLIZZA")
	private DatiPolizza datiPolizza;
	
	@XStreamAlias("ATR")
	private Atr atr;
	
	@XStreamAlias("VEICOLO")
	private Veicolo veicolo;
	
	@XStreamAlias("GARANZIE")
	private java.util.List<Garanzia> garanzie;
	
	@XStreamAlias("TOTALI")
	private Totali totali;
	
	@XStreamAlias("TESTATA")
	private Testata testata;
	
	@XStreamAlias("FATTORI")
	private java.util.List<Fattore> fattori;

	public java.util.List<Anagrafica> getAnagrafiche() {
		return anagrafiche;
	}

	public void setAnagrafiche(java.util.List<Anagrafica> anagrafiche) {
		this.anagrafiche = anagrafiche;
	}

	public Vincolo getVincolo() {
		return vincolo;
	}

	public void setVincolo(Vincolo vincolo) {
		this.vincolo = vincolo;
	}

	public ProvvigioniBanca getProvvigioniBanca() {
		return provvigioniBanca;
	}

	public void setProvvigioniBanca(ProvvigioniBanca provvigioniBanca) {
		this.provvigioniBanca = provvigioniBanca;
	}

	public DichiarazioniFiniFiscali getDichiarazioniFiniFiscali() {
		return dichiarazioniFiniFiscali;
	}

	public void setDichiarazioniFiniFiscali(
			DichiarazioniFiniFiscali dichiarazioniFiniFiscali) {
		this.dichiarazioniFiniFiscali = dichiarazioniFiniFiscali;
	}

	public DichiarazioniAvvenutoPagamento getDichiarazioniAvvenutoPagamento() {
		return dichiarazioniAvvenutoPagamento;
	}

	public void setDichiarazioniAvvenutoPagamento(
			DichiarazioniAvvenutoPagamento dichiarazioniAvvenutoPagamento) {
		this.dichiarazioniAvvenutoPagamento = dichiarazioniAvvenutoPagamento;
	}

	public Mav getMav() {
		return mav;
	}

	public void setMav(Mav mav) {
		this.mav = mav;
	}

	public DatiPolizza getDatiPolizza() {
		return datiPolizza;
	}

	public void setDatiPolizza(DatiPolizza datiPolizza) {
		this.datiPolizza = datiPolizza;
	}

	public Atr getAtr() {
		return atr;
	}

	public void setAtr(Atr atr) {
		this.atr = atr;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}

	public java.util.List<Garanzia> getGaranzie() {
		return garanzie;
	}

	public void setGaranzie(java.util.List<Garanzia> garanzie) {
		this.garanzie = garanzie;
	}

	public Totali getTotali() {
		return totali;
	}

	public void setTotali(Totali totali) {
		this.totali = totali;
	}

	public Testata getTestata() {
		return testata;
	}

	public void setTestata(Testata testata) {
		this.testata = testata;
	}

	public java.util.List<Fattore> getFattori() {
		return fattori;
	}

	public void setFattori(java.util.List<Fattore> fattori) {
		this.fattori = fattori;
	}
	
	
}
