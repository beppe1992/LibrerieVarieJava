package it.prova.guava.charmatcher;

import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;

/**
 * La classe CharMatcher è utile ad estrarre/sostituire/rimuovere da una stringa
 * solamente i caratteri che rispettano determinati standard
 * 
 * @author arx50011
 * 
 */
public class CharMatcherTest {

	/**
	 * Esempi di utilizzo della classe CharMatcher
	 * 
	 * @param args
	 */
	@Test
	public void charMatcherTest() {

		System.out.println("------------------ ESTRAZIONE ------------------");
		// estrarre
		// estrae dalla stringa XdsXfas solo i caratteri X
		System.out.println(CharMatcher.is('X').retainFrom("XdsXfas"));

		// estrae dalla stringa solo i caratteri che non sono _
		System.out.println(CharMatcher.isNot('_').retainFrom("prima_dopo"));

		// estrae dalla stringa solo i caratteri alfabeticamente compresi tra a
		// e b
		System.out.println(CharMatcher.inRange('a', 'b')
				.or(CharMatcher.inRange('A', 'B')).retainFrom("afasfz"));

		System.out.println("------------------ REPLACE ------------------");

		// sostituire
		// sostituisce dalla stringa XdsXfas i caratteri X con A
		System.out.println(CharMatcher.is('X').replaceFrom("XdsXfas", "A"));

		// sostituisce dalla stringa prima_dopo i caratteri diversi da _ con B
		System.out.println(CharMatcher.isNot('_')
				.replaceFrom("prima_dopo", "B"));

		// sostituisce dalla stringa afasfz i caratteri compresi tra a e b con C
		System.out.println(CharMatcher.inRange('a', 'b')
				.or(CharMatcher.inRange('A', 'B')).replaceFrom("afasfz", "C"));

		System.out.println("------------------ RIMUOVERE ------------------");

		// rimuovere
		// rimuovere dalla stringa XdsXfas i caratteri X
		System.out.println(CharMatcher.is('X').removeFrom("XdsXfas"));

		// rimuovere dalla stringa prima_dopo i caratteri diversi da _
		System.out.println(CharMatcher.isNot('_').removeFrom("prima_dopo"));

		// rimuovere dalla stringa afasfz i caratteri compresi tra a e b
		System.out.println(CharMatcher.inRange('a', 'b')
				.or(CharMatcher.inRange('A', 'B')).removeFrom("afasfz"));


	}
}
