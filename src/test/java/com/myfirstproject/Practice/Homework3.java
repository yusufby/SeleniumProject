package com.myfirstproject.Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String source= driver.getTitle();

        //explicit wait from java not selenium
        Thread.sleep(5000);

        System.out.println(source);
    // source check icin
        if (source.contains("Google")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
// url check icin
        String expectedUrl="https://www.google.com/";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("url passed");
        }else{
            System.out.println("failed");
        }

        driver.quit();
        Assert.assertTrue("JAVA".contains("e"));
    }

    }
