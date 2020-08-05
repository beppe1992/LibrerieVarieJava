package it.spring.approfondimenti.ehcache;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Prova di metodo cached: viene creata la cache di un metodo piu' parametri (Giuseppe e Ciccio)
 * 
 */
public class AppMultiCache {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:cachingConfiguration.xml");
		ctx.refresh();

		IDaoCachedExample classeCached = ctx.getBean(IDaoCachedExample.class);

		System.out.println("Chiamo il metodo la prima volta con Giuseppe (viene chiamato il metodo reale)");
		classeCached.metodoCached("Giuseppe");
		
		System.out.println("Chiamo il metodo la prima volta con Ciccio (viene chiamato il metodo reale)");
		classeCached.metodoCached("Ciccio");

		System.out.println("Chiamo il metodo la seconda volta con Giuseppe (non viene chiamato il metodo reale)");
		classeCached.metodoCached("Giuseppe");
		
		System.out.println("Chiamo il metodo la seconda volta con Ciccio (non viene chiamato il metodo reale)");
		classeCached.metodoCached("Giuseppe");

		System.out
				.println("Chiamo il metodo la terza volta - ma con parametro diverso (viene chiamato il metodo reale)");
		classeCached.metodoCached("Pippo");
	}
}
