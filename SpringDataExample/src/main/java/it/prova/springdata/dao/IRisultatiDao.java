package it.prova.springdata.dao;

import it.prova.springdata.dto.RisultatiDto;

import java.util.List;

/**
 * DAO utilizzato per l'accesso alla tabella Risultati
 * 
 * @author arx50011
 * 
 */
public interface IRisultatiDao {

	public void salvaRisultato(RisultatiDto dto);

	public List<RisultatiDto> getRisultatiDataSquadra(String squadra);
}
