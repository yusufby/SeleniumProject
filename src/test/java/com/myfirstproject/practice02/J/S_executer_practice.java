package com.myfirstproject.practice02.J;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class S_executer_practice extends TestBase {

    @Test
    public void jsExecuterTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);
        WebElement ourRooms=driver.findElement(By.xpath("//*[.='Alannah Ibarra']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)",ourRooms);
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true)", ourRooms);

    }
}
