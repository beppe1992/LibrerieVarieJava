package it.spring.approfondimenti.dto;

public class Persona {

	private String nome;

	private String cognome;

	private int eta;

	private int societa;

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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getSocieta() {
		return societa;
	}

	public void setSocieta(int societa) {
		this.societa = societa;
	}

	public void scrivi() {
		System.out.println(eta + 1);
	}
}
