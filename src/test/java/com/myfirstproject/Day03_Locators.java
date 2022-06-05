package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
//        Then verify that the expected user id testtechproed@gmail.com
//        (USE getText() method to get the text from the page)
        WebElement idElement = driver.findElement(By.className("navbar-text"));
        System.out.println(idElement.getText());//testtechproed@gmail.com
        String idElementText=idElement.getText();
        Assert.assertEquals("testtechproed@gmail.com",idElementText);

        /*ALTERNATIVELY. But this below code is not so clear. So we should write understandable codes.*/
        //Assert.assertEquals("testtechproed@gmail.com",driver.findElement(By.className("navbar-text")).getText());



//        Verify the Addresses and Sign Out texts are displayed
       /* Addresses is a link. So I can use linkText or partialLinkText only for links*/
        WebElement addresses=driver.findElement(By.linkText("Addresses"));

        //isDisplayed() is used to verify is an element is displayed on the page.
        // it returns true, if it exists, if it returns false, it does not exist on the page
        Assert.assertTrue(addresses.isDisplayed());

        /*
         * What is the difference between linkText and partialLinkText?
         *
         * Similarities : both accept the full text of a name of link
         * They both should be used only links
         *
         * Differences: linkText looks for EXACT text
         * partialLinkText looks for PART OF A text
         *
         * Note: When using partialLinkText, BE CAREFUL!!!!
         * if there is other partial matches, it returns the first partial link
         * Best practice is use linkText
         * If you use partialLinkText, use enough words
         *
         * When is partialLinkText is useful?
         * - if link text is too long
         * - if there is a space before or after the text
         * * *** isDisplayed() is used to verify is an element is displayed on the page
         * It returns true if element exists, it returns false if element is not exist on the page
         * */


//        driver.findElement(By.partialLinkText("Addresses"));
//        driver.findElement(By.partialLinkText("Addresse"));
//        driver.findElement(By.partialLinkText("resses"));
//        driver.findElement(By.partialLinkText("Add"));

//        Find the number of total link on the page
//        number of link = number of a tag
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//returns all elements whose tag is "a"
        int numberOfLinks=allLinks.size();
        System.out.println("Number of links : "+numberOfLinks);
        System.out.println("=====================");

//      Verify sign out texts are displayed
        WebElement signOut=driver.findElement(By.partialLinkText("Sign out"));
        Assert.assertTrue(signOut.isDisplayed());


//        Sign out from the page
        driver.findElement(By.linkText("Sign out")).click();


        //after sign out we must do verification to make sure you sign out successfully
        boolean isSignOut=driver.getCurrentUrl().equals("http://a.testaddressbook.com/sign_in");
        Assert.assertTrue(isSignOut);

        //  Alternatively, we can use a unique element on the sign in page
        boolean isSignOut1=driver.findElement(By.name("commit")).isDisplayed();
        Assert.assertTrue(isSignOut1);





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
