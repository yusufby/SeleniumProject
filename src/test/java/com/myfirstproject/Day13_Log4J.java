package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

/*Log4j is an external API to log information in the console OR in a file */
// We use Log4j for printing information

/*How to set up?*/
//1.)log4j-api
//2.)log4j-core

public class Day13_Log4J  extends TestBase {
    //Create an object
    private static Logger logger = LogManager.getLogger(Day13_Log4J.class.getName());
    @Test
    public void log4JTest(){
        logger.info("Opening the URL");
        driver.get("https://www.carettahotel.com/");
        logger.info("Clicking on Login Button");
        driver.findElement(By.linkText("Log in")).click();
        logger.fatal("Fatal Log");//PRINTS by default with no configuration
        logger.error("Error Log");//ERROR by default with no configuration
        logger.debug("Debug Log");

    }
}
