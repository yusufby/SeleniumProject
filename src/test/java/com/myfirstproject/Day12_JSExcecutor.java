package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class Day12_JSExcecutor  extends TestBase{
    //js executor is a library in selenium

    /*What is JAVASCRIPT EXECUTOR?*/
    //It is an API that is used to execute javascript comments in Selenium

    /*Why are you learning javascript executor?*/
    //you may need javascript methods to interact with web element, when traditional
    //selenium methods are not enough (such as click, scrolling a specific element,...)

    /*What can we do with JS executor?*/
    //Click (especially good with clicking hidden element),
    // scroll onto specific elements, scroll the all the way down/up/right/left
    //Type in an input
    //Change the value of an element
    // we can hover over
    //Change the color , background color, add border.
    @Test
    public void jsExecutorTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);

//        1.Creating js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        2. use js executor object to add your action

//                                                      //tag[@attrubute='value']
//                                                      * == all, .='TEXT ON THE PAGE'
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        js.executeScript("arguments[0].scrollIntoView(true);",ourRooms);

        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));
        js.executeScript("arguments[0].scrollIntoView(true);",email);

        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("//input[@type='submit']")));
    }
}
