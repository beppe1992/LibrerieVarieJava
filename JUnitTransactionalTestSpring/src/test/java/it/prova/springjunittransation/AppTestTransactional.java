package it.prova.springjunittransation;

import javax.annotation.Resource;
import javax.sql.DataSource;

import it.prova.springjunittransation.dao.ITabellaADao;
import it.prova.springjunittransation.dao.TabellaA;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
//@TransactionConfiguration(transactionManager = "transactionManager")
@Rollback(true)
@Transactional
public class AppTestTransactional extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	ITabellaADao tabellaADao;

	@org.junit.Test
	public void testInsert() {
		TabellaA dto = new TabellaA();
		dto.setCodice("5454");
		dto.setDescrizione("descrizione");
		tabellaADao.insert(dto);
	}

	@org.junit.Test(expected = IncorrectResultSizeDataAccessException.class)
	public void testSelect() {
		tabellaADao.select();

	}

	@Override
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
