package it.prova.guava.preconditions;

import com.google.common.base.Preconditions;

/**
 * La classe Precondition è utile a verificare i parametri in input ad un metodo
 * e rilanciare eccezzioni nel caso in cui non rispettino le validazioni da noi
 * indicate
 * 
 * @author arx50011
 * 
 */
public class PreconditionExample {

	/**
	 * Verifica che siano non nulli e positivi e fa la somma
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sumPositiveNumber(Integer a, Integer b) {

		Preconditions.checkNotNull(a, b);

		Preconditions.checkArgument(a >= 0 && b >= 0,
				"Le variabili non sono positive", a, b);

		return a + b;

	}
}
