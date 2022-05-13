package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ThreadSleep {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        //WAIT FOR 5 SECOND=5000 MILLISECOND
        Thread.sleep(5000);

        driver.get("https://www.amazon.com/");

        //WAIT FOR 10 SECONDS
        Thread.sleep(10000);

        driver.quit();

        /*
         * Thread.sleep is a JAVA WAIT*/
        // It is not coming from selenium
        /*It is a HARD WAIT */
        // It means driver will wait for 5 seconds no matter what.
        /** If driver do not need any wait, it will still wait exactly 5 seconds*/
        // We will learn selenium implicit and explicit waits in the upcoming classes
        /*This wait throws acceptation so add exception to method signature or use try catch*/
        //Testers should avoid using Thread.sleep cause it puts unnecessary waits

    }
}
