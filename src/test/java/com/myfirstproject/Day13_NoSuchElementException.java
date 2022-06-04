package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import com.myfirstproject.utilities.TestBase;

/*Tell me 5 exceptions*/
//NoSuchElementException :locator is wrong. element is not on the page.element is hidden.
/*NoSuchElementException  : make sure locator is correct.do manual testing.
 * if locator is correct, if we used correct switch then apply wait
 * try using explicit wait. if it does not work then use threadSleep as a last resort */
//TimeOutException
//NullPointerException
//InvalidSelectorException
//JavascriptException
//InvalidArgumentException
//WebDriver exception

/*What type of exceptions do you get in selenium?*/
//NoSuchElementException
//NullPointerException
//WebDriverException
//TimeOutException
//StaleElementReference Exception


/*What is your solution? */
//read the error message and know what is the error and where it is
//in general, because of timing issue, wrong locator, or iframe/windows/alerts
//each error has specific solutions but in general,
// I debug code and do some research then execute the code one more time after the fix

/*What type waits do you use ?*/
//I use implicit and explicit wait .

/*What wait do you prefer?*/
//Explicit wait works better in some cases.when I use explicit wait,
// and still see timeout exception, then there can be other issues such as incorrect locator

/*What do you prefer that wait?*/
//I prefer explicit wait when I need to use an expected condition such
// as element is not visible, then explicit wait handles/

/*How do you resolve synchronization issue?*/
//I use implicit and explicit wait. in my driver class, I already have implicit wait ,
// then handles most of the wait issues, but when it is not enough then i use explicit wait.


public class Day13_NoSuchElementException extends TestBase {

    @Test
    public void noSuchElementExceptionTest() {
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.linkText("navLogon")).click();//Wrong locator.
        // linkText should be id.NoSuchElementException
    }

    @Test
    public void noSuchElementExceptionTest2() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        String helloWorld = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
        Assert.assertEquals("Hello World!", helloWorld);//ComparisonFailure.
        // This is not same as no such element exception
    }

    @Test
    public void noSuchElementExceptionTest3() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//button[@type='button'])")).click();
        String goneMessage = driver.findElement(By.xpath("//p[@id='message']")).getText();
        Assert.assertEquals("It's gone!", goneMessage);//NoSuchElementException.
        // The element loads in about 5 second, but driver is so fast
//        SOLUTION:
//        Use explicit wait.
//        Use implicit wait
        // load and time issues are the same
    }
}
