package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.myfirstproject.utilities.TestBase;

public class Day08_Actions2 extends TestBase {

    @Test
    public void hoverOver() {
//        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        When use click on “Account” link
        /*We must move the mouse over to the Account&List
         * so Account link can be visible
         * Account link is currently hidden*/

        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();

//        Clicking on the Account link
        driver.findElement(By.linkText("Account")).click();

//        Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Account"));


    }

    @Test
    public void hoverOver2() throws InterruptedException {
//        Given user is on the https://www.amazon.com/
        driver.get("https://hypnotes.net/login");
        WebElement solutions = driver.findElement(By.xpath("//div[@class='BaseNavbar_pr30__jkM4F BaseNavbar_mainMenubar__ojVYr  d-flex align-items-center']/child::nav/child::a[@class='ant-dropdown-trigger BaseNavbar_navButton__1Pd6f'][2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).perform();
        //driver.findElement(By.linkText("Billing & Invoicing");


    }

}
