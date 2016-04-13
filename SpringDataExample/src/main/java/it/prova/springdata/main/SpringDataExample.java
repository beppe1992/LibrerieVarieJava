package it.prova.springdata.main;

import java.util.Date;

import it.prova.springdata.dao.IRisultatiDao;
import it.prova.springdata.dao.RisultatiDao;
import it.prova.springdata.dto.RisultatiDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

/**
 * Hello world!
 * 
 */
public class SpringDataExample extends SpringBeanAutowiringInterceptor {

	@Autowired
	private static IRisultatiDao risultatiDao;

	public static void main(String[] args) {
		RisultatiDto dto = new RisultatiDto();
		dto.setSquadra1("Milan");
		dto.setSquadra2("Juve");
		dto.setRisultato("1-2");
		dto.setData(new Date());

		risultatiDao.salvaRisultato(dto);
	}
}
