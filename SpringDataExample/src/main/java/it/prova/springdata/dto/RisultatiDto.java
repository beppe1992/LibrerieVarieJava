package it.prova.springdata.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * dto della tabella RISULTATI
 * 
 * @author arx50011
 * 
 */
@Entity
@javax.persistence.Table(name = "employee")
public class RisultatiDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SQUADRA_1")
	private String squadra1;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SQUADRA_2")
	private String squadra2;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RISULTATO")
	private String risultato;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DATA")
	private Date data;

	public String getSquadra1() {
		return squadra1;
	}

	public void setSquadra1(String squadra1) {
		this.squadra1 = squadra1;
	}

	public String getSquadra2() {
		return squadra2;
	}

	public void setSquadra2(String squadra2) {
		this.squadra2 = squadra2;
	}

	public String getRisultato() {
		return risultato;
	}

	public void setRisultato(String risultato) {
		this.risultato = risultato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
