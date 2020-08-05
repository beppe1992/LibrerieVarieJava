package com.arca.mongodb;

import java.net.UnknownHostException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoDBTest {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource basicDataSource;

	@Autowired
	private Avt005TbService service;

	@Test
	public void mogoDbTest() throws UnknownHostException {

		jdbcTemplate = new JdbcTemplate(basicDataSource);

		List<Avt005Tb> listaRecor = (List<Avt005Tb>) jdbcTemplate.query(
				"SELECT * FROM AVT005TB", new Object[] {},
				new BeanPropertyRowMapper<Avt005Tb>(Avt005Tb.class));

		for (Avt005Tb dto : listaRecor) {

			service.addDto(dto);
		}

		Avt005Tb dtoSelected = service.listDto().get(0);

		// service.selectRecord(225, "DATRUNBT");

		System.out.println(dtoSelected);

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getBasicDataSource() {
		return basicDataSource;
	}

	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}

	public Avt005TbService getService() {
		return service;
	}

	public void setService(Avt005TbService service) {
		this.service = service;
	}

}
