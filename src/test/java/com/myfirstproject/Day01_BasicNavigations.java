package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//selenium is an API OR library to use create a driver to test an application
public class Day01_BasicNavigations {


    //    Create a new class under : BasicNavigations

    //    Create main method
    public static void main(String[] args) {

        //    Set Path  use WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");//windows

        //    Create chrome driver
        WebDriver driver = new ChromeDriver();

        //    Maximize the window
        driver.manage().window().maximize();


        //    Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");



        //    On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //    Navigate back to google
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();


        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.close();

        /*2.way of closing*/
       // driver.quit();//stronger than quit

        /*What is the difference between quit and close ?*/
        //first both closes the driver(browser)
        //close()==closes ONLY the current active driver
        //quit()==> closes ALL browsers that  open during that test run



        //There are 2 ways to go to a page
        /*
         * 1. get("URL")
         * 2. navigate().to("URL")
         *
         * What is the difference between get and navigate?

         * get() is easier to use. it is shorter
         * get() is a little faster
         * get() takes only string parameter

         * navigate().to() accept string or URL as parameter
         * navigate has more options : go back, forward, refresh
         * */
        //test folder is used for automation framework

        //developers do unit testing

        /*target folder*/
        //target has compiled files
        //it will be reports

        /*Pom.eml is the most important file on the maven project.
        this file is used to manage projects.
        this may have
        dependencies
        plugins
        profiles
        */

        //External libraries:when we add dependencies , it will import to external library


        //when you write pwd it shows the files path in terminal

    }

}
