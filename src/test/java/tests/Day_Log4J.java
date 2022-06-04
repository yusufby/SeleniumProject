package tests;

import com.myfirstproject.Day13_Log4J;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/*testNG is an advanced framework of jUnit*
n means new
g meaning generation/
 */



public class Day_Log4J {

    private static Logger logger = LogManager.getLogger(Day13_Log4J.class.getName());

    @Test
    public void log4JDemo() {
        logger.info("Info log");
        logger.debug("Debug Log");
        logger.fatal("Fatal Log");
        logger.error("Error Log");
        logger.warn("Warn log");
        /*Trace means log everything */
        //1.CHANGE the level to trace to see ALL LOGS

        //2.lOG the information on a file

        //3.Do all there for the tests package ONLY




    }
}
