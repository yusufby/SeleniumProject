package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Absolute xpath:you go from parent to child one by one (we do not use this.it is long)
*Relative xpath:  you go target element. that's why we use this xpath.*/



public class Day04_xpath_css {
    WebDriver driver;
    @Before
    public void setUp(){
//        Prerequisites
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
    }
    @Test
    public void xpath_css(){
        /*Locating username, password, and button using xpath*/
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234!");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test
    public void css(){
        /*1. Location username, password, and button using cssSelector
        There is no // 2. There is no @ symbol in cssSelector*/
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");

        //Alternative cssLocator for email:input#session_email OR  #session_email
        //Alternative ccsLocator for email :input.form-control  OR  .form-control
        /*NOTE: # =id  and .=class
        */
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
        //Functional testing :smoke test, regression test and security testing
        /*Selenium can be used to test UI, API and Database testing */


        //we can copy the relative xpath using chrome dev tool.it is not recommended
        /*because chrome can give the combination of ABSOLUTE and RELATIVE*/
        // * means any

