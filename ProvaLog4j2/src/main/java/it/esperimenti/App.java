package it.esperimenti;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Questa classe usa la configurazione log4j2.xml
 * 
 */
public class App
{

    // Usa il RootLogger
    private static Logger logRoot = LogManager.getRootLogger();

    public static void main(String[] args)
    {

        // Richiamo il logger specifico
        Logger log = LogManager.getLogger("provaLogger");

        log.warn("DDDDDDDDDDDDDDD");
        log.warn("prova Log4j2");
        String s = "il messaggio.";
        log.warn("queste stringhe verranno concatenate solo se viene loggato {}", s);

        logRoot.trace("TRACE");
        logRoot.debug("debug");
        logRoot.info("INFO");
        logRoot.warn("warn");
        logRoot.error("ERROR");
        logRoot.fatal("FATAL");

        System.out.println();
        ;
    }
}
