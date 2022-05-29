package com.myfirstproject.utilities;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

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
