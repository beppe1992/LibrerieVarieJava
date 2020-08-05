package it.prova.guava.staticcostructor;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Guava espone alcuni metodi statici per creare collezioni in modo piu'
 * semplice
 * 
 * @author arx50011
 * 
 */
public class StaticCostructorTest {

	@Test
	public void createCollectionWithStaticMethod() {

		List<String> list = Lists.newArrayList();

		Map<Integer, String> map = Maps.newHashMap();

	}
}
