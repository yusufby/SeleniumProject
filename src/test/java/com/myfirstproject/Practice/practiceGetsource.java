package com.myfirstproject.Practice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceGetsource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");
        String getPageSource=driver.getPageSource();
        Assert.assertTrue(getPageSource.contains("Hello"));

        String title=driver.getTitle();
        System.out.println(title);

        String url=driver.getCurrentUrl();
        System.out.println(url);


    }
}
