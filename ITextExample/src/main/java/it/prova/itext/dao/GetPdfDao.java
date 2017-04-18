package it.prova.itext.dao;

import it.prova.itext.dto.PdfDto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GetPdfDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly = true)
	public List<PdfDto> findAll() {
		return jdbcTemplate
				.query("   select * from STAMPE_BATCH_DETT_BLOB, STAMPE_BATCH_DETT where "
						+ "   STAMPE_BATCH_DETT_BLOB.KEY_DETT = STAMPE_BATCH_DETT.KEY_DETT"
						+ "   and"
						+ "   fase_stampa in( 'DFFQUIET') "
						+ "   and to_char(dt_elab,'dd/mm/yyyy') = '28/01/2017' "
						+ "   and ID_KEY_OUTS = 4259 "
						+ "   ORDER BY FASE_STAMPA, FORM, CAP_SPEDIZIONE",
						new BeanPropertyRowMapper(PdfDto.class));
	}
}
