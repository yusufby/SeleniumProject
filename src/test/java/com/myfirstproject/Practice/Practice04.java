package com.myfirstproject.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice04 {
    /*// ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
// Type any number in the first input
// Type any number in the second input
// Click on Calculate
// Get the result
// Print the result*/
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//*[@id=\"calculatetest\"]")).click();

        WebElement firstBox=driver.findElement(By.xpath("//input[@id=\"number1\"]"));
        WebElement secondBox=driver.findElement(By.xpath("//input[@id=\"number2\"]"));
        firstBox.sendKeys("25");
        secondBox.sendKeys("14");
        driver.findElement(By.xpath("//input[@id=\"calculate\"]")).click();

        String result= driver.findElement(By.xpath("//span[@id='answer']")).getText();

       Assert.assertEquals("39", result);
        Thread.sleep(5000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}