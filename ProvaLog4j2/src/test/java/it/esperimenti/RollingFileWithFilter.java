package it.esperimenti;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.junit.InitialLoggerContext;
import org.junit.Rule;
import org.junit.Test;

/**
 * Usa il file log4j2-RollingFileWithFilter.xml per provare il filtro
 * 
 * 
 */
public class RollingFileWithFilter {
	@Rule
	public InitialLoggerContext init = new InitialLoggerContext(
			"log4j2-RollingFileWithFilter.xml");

	@Test
	public void rollingFile() {
		final Logger logger = init.getLogger("loggerRollingFileWithFilter");

		// Risparmio di risorse in quanto se non e' necessario loggare (perche'
		// magari il livello e' INFO) log4j2 nemmeno
		// concatena le stringhe
		logger.debug("Provaaaa {}", Testo.STRINGA_DIVINA_COMMEDIA);

		logger.info("aa info1");
		logger.info("aa info2");
		logger.info("info3");
		logger.info("aa info4");
		logger.warn("aa warn");
		logger.error("aa error");
		logger.fatal("aa fatal");
	}

}
