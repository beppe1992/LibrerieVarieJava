package it.prova.springdata.dao;

import it.prova.springdata.dto.RisultatiDto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("RisultatiDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class RisultatiDao implements IRisultatiDao {

	@PersistenceContext
	private EntityManager entityManager;

	// METODO DI SELECT
	public List<RisultatiDto> getRisultatiDataSquadra(String squadra) {

		List<RisultatiDto> risultati = entityManager.find(List.class, squadra);

		return risultati;
	}

	// METODO DI INSERT
	public void salvaRisultato(RisultatiDto dto) {
		entityManager.persist(dto);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
