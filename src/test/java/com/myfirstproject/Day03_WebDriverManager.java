package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day03_WebDriverManager {




    @Test
    public void googleSearch(){
        //search for a porcelain teapot in google search box
        WebDriverManager.chromedriver().setup(); //we no use System.setProperty

        //    Create chrome driver
        WebDriver driver = new ChromeDriver();

        //    Maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getTitle().equals("Google"));



    }
}
