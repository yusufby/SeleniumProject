package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {

    /*	1.Create a new class: VerifyTitleTest
        2.Navigate to google homepage
        3.Verify if google title is “Google”  */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //2.Navigate to google homepage
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        //3.Verify if google title is “Google”
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        //Verify if expected equals actual

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
            System.out.println("Expected " + expectedTitle);
            System.out.println("Actual " + actualTitle);
        }else{
            System.out.println("FAILED");
            System.out.println("Expected " + expectedTitle);
            System.out.println("Actual " + actualTitle);
        }

}}
