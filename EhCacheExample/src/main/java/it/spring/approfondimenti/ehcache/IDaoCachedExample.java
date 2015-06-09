package it.spring.approfondimenti.ehcache;

import org.springframework.cache.annotation.Cacheable;

public interface IDaoCachedExample {

	@Cacheable("METODO_CACHED")
	public String metodoCached(String nome);
}
