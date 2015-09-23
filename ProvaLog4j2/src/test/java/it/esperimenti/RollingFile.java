package it.esperimenti;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.junit.InitialLoggerContext;
import org.junit.Rule;
import org.junit.Test;

/**
 * Usa il file log4j2-RollingFile.xml per provare l'Appender RollingFile
 * 
 */
public class RollingFile
{
    @Rule
    public InitialLoggerContext init = new InitialLoggerContext("log4j2-RollingFile.xml");

    @Test
    public void rollingFile()
    {
        final Logger logger = init.getLogger("loggerRollingFile");
       
        logger.warn("XXXX");
        
        logger.warn(Testo.STRINGA_DIVINA_COMMEDIA);
    }

}

