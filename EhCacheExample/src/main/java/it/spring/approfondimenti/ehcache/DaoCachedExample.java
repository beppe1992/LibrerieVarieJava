 package it.spring.approfondimenti.ehcache;



/**
 * Dao contenente il metodo cached
 * 
 * @author arx50011
 * 
 */

public class DaoCachedExample implements IDaoCachedExample {

	
	@Override
	public String metodoCached(String nome) {
		System.out.println("Chiamato metodo reale con nome = " + nome);
		return nome.toUpperCase();
	}

	
}
