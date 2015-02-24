package it.spring.approfondimenti.spel;



import it.spring.approfondimenti.dto.Persona;
import it.spring.approfondimenti.dto.spel.SpelValidator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test ValangValidator e ValidatingItemProcessor
 * 
 */
@ContextConfiguration(locations = { "classpath:SpelExample.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpelValidationTest {

	@Autowired
	private SpelValidator spelValidator;

	
	@Test
	public void passSpelTrue() throws Exception {

		Persona persona = new Persona();
		persona.setNome("Pippo");
		persona.setCognome("Pippus");
		persona.setEta(21);
		persona.setSocieta(341);

		Assert.assertTrue(spelValidator.passSpell(persona));
	}

	@Test
	public void passSpelFalse() throws Exception {

		Persona persona = new Persona();
		persona.setNome("Pippo");
		persona.setCognome("Pippus");
		persona.setEta(21);
		persona.setSocieta(417);

		Assert.assertFalse(spelValidator.passSpell(persona));
	}
}
