package it.prova.springjunittransation;

import it.prova.springjunittransation.dao.ITabellaADao;
import it.prova.springjunittransation.dao.TabellaA;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@ContextConfiguration(locations = { "classpath:context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTestNoTransactional {

	@Autowired
	ITabellaADao tabellaADao;

	@org.junit.Test
	public void testInsert() {
		TabellaA dto = new TabellaA();
		dto.setCodice("5454");
		dto.setDescrizione("descrizione");
		tabellaADao.insert(dto);
	}

	@org.junit.Test
	public void testSelect() {
		TabellaA dto = tabellaADao.select();
		Assert.assertEquals("5454", dto.getCodice());
		Assert.assertEquals("descrizione", dto.getDescrizione());
	}
}
