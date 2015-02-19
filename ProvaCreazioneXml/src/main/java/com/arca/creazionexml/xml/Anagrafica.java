package com.arca.creazionexml.xml;

import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ANAGRAFICA")
public class Anagrafica {

	@XStreamAlias("NOME")
	private String nome;
	
	@XStreamAlias("COGNOME")
	private String cognome;
	
	@XStreamAlias("FIGURAANAGRAFICA")
	private String figuraAnagrafica;
	
	@XStreamAlias("SESSO")
	private String sesso;
	
	@XStreamAlias("CF")
	private String codiceFiscale;
	
	@XStreamAlias("PIVA")
	private String partitaIva;
	
	@XStreamAlias("DATANASCITA")
	private Date dataNascita;
	
	@XStreamAlias("ETA")
	private Integer eta;
	
	@XStreamAlias("PROFESSIONE")
	private String professione;
	
	@XStreamAlias("INDIRIZZI")
	private List<Indirizzo> indirizzi;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getFiguraAnagrafica() {
		return figuraAnagrafica;
	}

	public void setFiguraAnagrafica(String figuraAnagrafica) {
		this.figuraAnagrafica = figuraAnagrafica;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getProfessione() {
		return professione;
	}

	public void setProfessione(String professione) {
		this.professione = professione;
	}

	public List<Indirizzo> getIndirizzi() {
		return indirizzi;
	}

	public void setIndirizzi(List<Indirizzo> indirizzi) {
		this.indirizzi = indirizzi;
	}

	
			
}
