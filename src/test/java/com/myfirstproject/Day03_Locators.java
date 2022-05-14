package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Locators {

    /*Create a class : LocatorsIntro
    Create test method locators
    user goes to http://a.testaddressbook.com/sign_in
    Locate the elements of email textbox, password textbox, and signin button
    Enter below username and password then click sign in button
    Username :  testtechproed@gmail.com
    Password : Test1234!
    Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out  texts are displayed
    Find the number of total link on the page
    Sign out from the page*/
    @Test
    public void locators() {
//        Prerequisites
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
//        Locate the elements of email textbox, password textbox, and signin button
//        Email
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
//        Password
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
//        click on sign in button
      /*  driver.findElement(By.name("commit")).click();*/
//        ALTERNATIVELY we can first locate the element then click
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();
//        Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
//        Verify the Addresses and Sign Out texts are displayed
//        Find the number of total link on the page
//        Sign out from the page
    }

    /*How many operators are there in Selenium?  8 */
    // id, name, className,tagName, linkText, partialLinkText, xpath,css

    /*What is findElement() method? */
    //we use findElement to locate the elements

    /*What is the return type of findElement? */
    //Return type is webElement

    /*Which locator do you prefer? */
    // i prefer id. because
    //id is unique
    //easy to locate
    // a little faster than xpath and css
    /*if there is no id , then i use other unique elements such as name, class,....*/
    //if no appropriate locator is there , then i write dynamic xpath

}
