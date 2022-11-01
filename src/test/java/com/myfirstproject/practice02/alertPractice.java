package com.myfirstproject.practice02;


import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

}
