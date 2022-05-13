package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {

    /*	1.Create a new class: VerifyURLTest
        2.Navigate to google homepage
        3.Verify if google homepage url is “www.google.com” */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //2.Navigate to google homepage
        driver.get("https://www.google.com/");

        //Verify if google homepage url is "www.google.com"
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.google.com/";

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }


    }


    // EXPECTED : www.google.com
    /*  * What do you do when a test case fails?*/

    //* 1. Rerun your test  more time
    //* 2. Do manual testing to make sure
    // * 3. Contact with Developer
    // * 4. Contact with BA
    /* *   -Check if this is a document issue(spelling,...)
     *   -If that is a documentation issue, then let BA fix the docs
     *   -And correct your test case*/
    // * 5. If that is actual bug???
    /*   -Raise a bug ticket in JIRA
     *   -Assign is to the dev*/
    // * 6. After dev fix the issue and deploy the code in test environment
    /*    -Retest manually, then run your automation script
     *   -And close the ticket if all good!*/

    // * NOTE: each company has a different culture!

    /* * When you found a bug, do you fix the bug your self?
     *   - Nope. I document and report.*/

}
