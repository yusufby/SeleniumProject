package com.myfirstproject.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class Practice01 {
            // ...Exercise1...
        // Create a new class under Q1
        // Set Path
        // Create chrome driver
        // Maximize the window
        // Open google home page https://www.google.com/.
        // On the same class, Navigate to amazon home page https://www.amazon.com/
    // Navigate back to google
        // Navigate forward to amazon
        // Refresh the page
        // Close/Quit the browser
        // And last step : print "all ok" on console

    WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test
    public void test01() throws InterruptedException {
    driver.get("https://www.google.com/");
    Thread.sleep(4000);
    driver.navigate().to("https://www.amazon.com/");
    driver.navigate().back();
        Thread.sleep(4000);
    driver.navigate().forward();
        Thread.sleep(4000);
    driver.navigate().refresh();



    }
    @After
    public void tearDown(){
        driver.quit();
    }




}
