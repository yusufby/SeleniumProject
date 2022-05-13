package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        //2.Navigate to google homepage
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //test if amazon contains "Registry" on the homepage
        /*how to go to view page source*/
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        if (pageSource.contains("Registry")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.quit();
    }

}
