package it.esperimenti;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.junit.InitialLoggerContext;
import org.junit.Rule;
import org.junit.Test;

/**
 * Usa il file log4j2-Console.xml per provare l'Appender Console
 * 
 */
public class Console
{
    @Rule
    public InitialLoggerContext init = new InitialLoggerContext("log4j2-Console.xml");

    @Test
    public void rollingFile()
    {
        final Logger logger = init.getLogger("loggerConsole");
        logger.warn(Testo.STRINGA_DIVINA_COMMEDIA);
    }

}
