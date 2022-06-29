package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*Hard wait: Thread.sleep(millisecond)*/
//Java wait
//waits for given time. no more no less
//we should avoid using this wait. Avoid especially putting too many hard wait.
//this will make the test execution time longer.

/*Implicit wait: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30))*/
//Selenium wait
//waits up to given time
//we should use this DYNAMIC WAIT(IMPLICIT WAIT)
//Global wait.when you use implicit wait once, then whenever driver is called,
// then implicit wait applies

/*Explicit wait :*/
//Selenium wait:DYNAMIC WAIT
//Wait up tp tht given time
//we should use dynamic wait
//local wait. we will apply the wait on to the specific elements
//we must create a WebDriverWait object
//This sometimes handles wait issue better than implicit wait
        //Element is not visible
        //Element no clickable
        //Text not displayed......


/*Fluent wait : this is a type of Explicit wait.
We can put polling number.
we can ignore exception*/




public class Day12_Synchronization1 extends TestBase{

    //Synchronization is very important for UI automation testing

    @Test
    public void synchronization1() throws InterruptedException {

//        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

//        When user clicks on the Start button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();

//        Using explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


//        //div[@id='finish']//h4 is the xpath of the Hello World! element
//        1. Waits for teh element DYNAMICALLY
//        2. returns the element. So no need to use findElement with explicit wait
        WebElement helloWord = wait.until
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
        Assert.assertEquals("Hello World!",helloWord.getText());






//        Thread.sleep(5000);//works but this is not recommended
//        Then verify the ‘Hello World!’ Shows up on the screen
//        String helloWorld = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
//        Assert.assertEquals("Hello World!",helloWorld);
//        Implicit wait is not enough to handle the load issue

    }
    /*What are the selenium waits?*/
    //Implicit wait
    //Explicit wait
    //Fluent wait

    /*Which one do you prefer?*/
    //It depends on the test case. But explicit wait works better in some cases.
    // So I prefer explicit wait in some cases. For example: when i work with
    // dynamically loaded elements, then explicit wait works better for waiting
    // and locating the elements.S

    /*What might be the reason of the case failure? */
    //wrong locator-typo-wrong values
    //Not synchronized timing issue
            //page is too slow, internet is slow or database is slow, hosting problem...
    //element may not be visible
    //iframe
    //multiple window
    //Alert, pop ups , cookies
    //Captcha code

    /*What do you do when your test case fails?*/
    //read error message on the console.I see the error message and line of the error. then
    // I can read which part of the code falls. Error messages give me which class which line and error.
    //check the locators, time issue, element visibility , iframe and pops up.......
    //manual testing again to see my automation logic is correct. Also check the functional is working


    /*Can you use implicit wait and explicit wait together?*/
    //yes . implicit wait is in driver class. When implicit does not work,
    // then i can use explicit wait. i have reusable methods for explicit waits


    /*What is the difference between implicit and explicit wait ?*/
    //Implicit is global(applies wait to the driver whenever driver is used)
    // , explicit is local (have to call explicit wait every time for new element ).
    // We have to create WebDriverWait object. has more options such as visibility....
}
