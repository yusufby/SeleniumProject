package com.myfirstproject.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.IFactoryAnnotation;

public class Homework01 {
    /*Create a new class : Review1
Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
Verify if the page URL contains youtube if not, print the right url.
Then Navigate to https://www.amazon.com/
Navigate back to youtube
Refresh the page
Navigate forward to amazon
Maximize the window
Then verify if page title includes “Amazon”, If not, print the correct title.
Verify if the page URL is https://www.amazon.com/, if not print the correct url
Quit the browser*/
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String actualData = driver.getTitle();
        String expectedData = "YouTube";
        if (actualData.contains(expectedData)) {
            System.out.println("It passed");
        } else {
            System.out.println("It failed");
        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String actualDataAmazon = driver.getTitle();
        String expectedDataAmazon = "amazon";
        if (actualDataAmazon.contains(expectedDataAmazon)) {
            System.out.println("It passed");
        } else {
            System.out.println("it failed");
        }
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if (actualURL.equals(expectedURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.quit();


    }

}
