package com.myfirstproject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import com.myfirstproject.utilities.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day06_TestBaseDemo  {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();}

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();}

        //setUp==> test1==> tearDown
        //setUp==> test2==> tearDown

    }
