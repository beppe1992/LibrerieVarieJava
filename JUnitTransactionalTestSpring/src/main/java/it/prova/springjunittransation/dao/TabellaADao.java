package it.prova.springjunittransation.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TabellaADao implements ITabellaADao {

	private JdbcTemplate jdbcTemplate;

	public TabellaA select() {

		return jdbcTemplate.queryForObject(SELECT_TABLE_A, new Object[] {},
				new BeanPropertyRowMapper<TabellaA>(TabellaA.class));
	}

	public void insert(TabellaA record) {
		jdbcTemplate.update(INSERT_TABLE_A, new Object[] { record.getCodice(),
				record.getDescrizione() });

	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
