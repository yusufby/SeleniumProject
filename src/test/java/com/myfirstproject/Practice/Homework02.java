package com.myfirstproject.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    /*Create a new class : Homework1
    Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
    Verify if the page URL contains facebook  if not, print the right url.
    Then Navigate to https://www.walmart.com/
    Verify if the walmart page title includes “Walmart.com”
    Navigate back to facebook
    Refresh the page
    Maximize the window
    Close the browser*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualData = driver.getTitle();
        String expectedData = "Facebook";
        if (actualData.contains(expectedData)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.navigate().to("https://www.walmart.com/");
        if (driver.getTitle().contains("Walmart.com")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.navigate().to("https://www.facebook.com/\"");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }


}
