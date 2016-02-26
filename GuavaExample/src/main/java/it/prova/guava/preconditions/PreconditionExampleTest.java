package it.prova.guava.preconditions;

import org.junit.Test;

import com.google.common.base.Preconditions;

/**
 * La classe Precondition è utile a verificare i parametri in input ad un metodo
 * e rilanciare eccezzioni nel caso in cui non rispettino le validazioni da noi
 * indicate
 * 
 * @author arx50011
 * 
 */
public class PreconditionExampleTest {

	/**
	 * Chiamo il metodo sum con entrambi i valori positivi
	 * 
	 * @param args
	 */
	@Test
	public void nullNumber() {
		System.out.println(PreconditionExample.sumPositiveNumber(null, null));
	}

	/**
	 * Chiamo il metodo sum con entrambi i valori positivi
	 * 
	 * @param args
	 */
	@Test
	public void positiveNumber() {
		System.out.println(PreconditionExample.sumPositiveNumber(1, 1));
	}

	/**
	 * Chiamo il metodo sum con un valore negativo
	 * 
	 * @param args
	 */
	@Test
	public void negativeNumber() {
		System.out.println(PreconditionExample.sumPositiveNumber(-1, 1));
	}

}
