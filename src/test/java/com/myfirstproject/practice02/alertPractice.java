package com.myfirstproject.practice02;


import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class alertPractice extends TestBase {

    @Test
    public void Test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        String message=driver.switchTo().alert().getText();
        Thread.sleep(5000);
        String expectedAlertText = "I am a JS Alert";
        Assert.assertEquals(expectedAlertText,message);
        driver.switchTo().alert().accept();
        String aftermesage="You successfully clicked an alert";
        String actualmesasge=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(aftermesage,actualmesasge);
    }
    @Test
    public void Test2() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("hi everyone");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        String expectedAlertText = "You entered: hi everyone";
        Thread.sleep(3000);
        String actual=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expectedAlertText,actual);
    }

    @Test
    public void iframeTest() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
       // driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("hi everyone . how is it going?");
        Thread.sleep(3000);
        driver.switchTo().parentFrame(); /*get 1 upper level using parentFrame */
        driver.switchTo().defaultContent(); /*Gets all the way to the root level */

        WebElement elementSelenium = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(elementSelenium.isDisplayed());
       List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
       int i=1;
        if (i<=iframe.size()){
            i++;

        }
        System.out.println(i);
    }

}
