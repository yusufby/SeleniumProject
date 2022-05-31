package com.myfirstproject.utilities;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;


/*What is javascript executor?*/
//js executor is an API to execute javascript comments in selenium

/*When did you use it ? */
//when we can not interact with some webElements with a traditional selenium methods
//for example, when we can not click, scroll, get text...then we can use js executor

/*How do you scroll with selenium?*/
//There are ways: action class, js executor
//Actually I am using js executor ,since it is better
//for example: with js executor ,I can scroll to a specific element(scrollIntoView) or
// right, left all the way bottom ... we have a reusable method that i can call to scroll
// on a specific element

/*How do you get the text in an input ?*/
//I use getText method for getting the text on a page. However, we need to use
// jsExecutor to get the input value. I have a reusable method to get the value from an input

/*What would you do if your selenium click does not work? */
//I can use javascript executor click. I can  get the element and click using javascript

public class Day12_JSExcecutor02 extends TestBase {

    @Test
    public void jsExecutorTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
//        scroll to Our Room
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        scrollIntoViewByJS(ourRooms);
    }

    @Test
    public void scrollAllDownByJSTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
//        scrolling all the way down
        scrollAllDownByJS();
        Thread.sleep(3000);
//        scrolling all the way up
        scrollAllUpByJS();
    }

    @Test
    public void clickByJSTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
//click on check availability
        WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(checkAvailability);

//click on search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(searchButton);
    }

    @Test
    public void setValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);

        WebElement checkOutDate = driver.findElement(By.id("checkout_date"));
//        Updating the text of checkout date

        checkOutDate.clear();

        checkOutDate.sendKeys("6/25/2022");// Traditional selenium type
       //  setValueByJS(checkOutDate, "6/25/2022");//js type

    }

    @Test
    public void getValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
        WebElement checkOutDate = driver.findElement(By.id("checkout_date"));
//        System.out.println(checkOutDate.getText());//returns empty string
        getValueByJS("checkout_date");//5/29/2022
    }


    @Test
    public void changeBackgroundColorByJSTest() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);

        WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(3000);
        changeBackgroundColorByJS(checkAvailability, "orange");
        Thread.sleep(3000);
        takeScreenShot();
    }

    @Test
    public void addBorderWithJSTest() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//a[.='Log in']"));
        Thread.sleep(3000);

        addBorderWithJS(loginButton, "3px solid red");
        Thread.sleep(3000);
        takeScreenShot();
    }
    //How can you get the value of an input box ?
    /*we can js executor*/
    //How?
    /*I can get the element using js executor and get the value of the element
    * For example:I can get the element by id, and use value attribute to get the value of in ana input */
    //I have to do this, because getText in this case does not return the text in an input




}
