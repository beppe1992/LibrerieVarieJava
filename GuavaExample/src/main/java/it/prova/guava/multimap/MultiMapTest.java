package it.prova.guava.multimap;

import java.util.Collections;

import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

/**
 * La classe MultiMap è una Map che permette di avere oggetti con la stessa
 * chiave. Una HashMap Java base invece non lo permette
 * 
 * @author arx50011
 * 
 */
public class MultiMapTest {

	@Test
	public void multiMapExample() {
		Multimap<String, Integer> scores = HashMultimap.create();
		scores.put("Bob", 20);
		scores.put("Bob", 10);
		scores.put("Bob", 15);

		// Restituisce una collection Java di tutti gli oggetti aventi chiave
		// Bob
		System.out.println(scores.get("Bob"));

		// La collection Java permette di recuperare il massimo, il minimo etc
		System.out.println(Collections.max(scores.get("Bob")));

	}
}
