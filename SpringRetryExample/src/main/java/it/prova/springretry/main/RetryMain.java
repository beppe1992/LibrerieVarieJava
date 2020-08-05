package it.prova.springretry.main;

import it.prova.springretry.service.MioServizio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class RetryMain {

	@Autowired
	private MioServizio mioServizio;

	@Test
	public void testRetryBase() throws Exception {

		mioServizio.simpleRetry();

	}

	@Test
	public void testParameterRetry() throws Exception {

		mioServizio.simpleParameterRetry();

	}

	@Test
	public void testRetryWithRecover() throws Exception {

		mioServizio.simpleRetryWithRecover();

	}
}
