package it.spring.approfondimenti.processor;



import it.spring.approfondimenti.dto.Persona;

import java.util.ArrayList;
import java.util.List;

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
@ContextConfiguration(locations = { "classpath:ValidatingItemProcessor.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ValidatingItemProcessorTest {

	private List<Persona> items;

	@Autowired
	private ValidatingItemProcessor<Persona> processor;

	@Before
	public void setUp() throws Exception {
		items = new ArrayList<Persona>();
		Persona persona = new Persona();
		persona.setNome("Pippo");
		persona.setCognome("Pippus");
		persona.setEta(21);
		persona.setSocieta(341);

		items.add(persona);

		persona = new Persona();
		persona.setNome("Pluto");
		persona.setCognome("Plutos");
		persona.setEta(23);
		persona.setSocieta(417);

		items.add(persona);

		persona = new Persona();
		persona.setNome("Paperino");
		persona.setCognome("Paperinik");
		persona.setEta(20);
		persona.setSocieta(700);

		items.add(persona);
	}

	@Test
	public void processFilterTrue() throws Exception {
		// la Valang expression non fa passare la societa' 417, ma il flag
		// filter e' a true quindi il secondo elemento sara'
		// filtrato
		processor.setFilter(true);
		for (Persona persona : items) {
			Persona personaResult = processor.process(persona);
			System.out.println(personaResult != null ? "filtrato NO"
					: "filtrato SI");
		}
	}

	@Test(expected = ValidationException.class)
	public void processFilterFalse() throws Exception {
		// la Valang expression non fa passare la societa' 417, ma il flag
		// filter e' a false quindi sara' "skippato"
		processor.setFilter(false);
		for (Persona persona : items) {
			processor.process(persona);
		}
	}

}
