package com.myfirstproject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*Web driver exception? */
//when you close the browser , but still want to use that in correctly
//when the versions of the driver and browsers are not compatible it will give webDriver exception
/*Solutions*/
//your design should be good. we should use singleton  Driver to prevent this exception
//keep drivers up to date that is compatible with the browser version

public class Day13_TimeOutException {
        WebDriver driver;
        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        @Test
        public void timeOutExceptionTest(){
            driver.get("https://www.carettahotel.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("navLogon")));
//        Even tough the problem may not be specifically time out issue, we still get TimeoutException when we use explicit wait
//        In this case, out locator is wrong and we put 5 seconds wait, and got timeoutException
//        Reason for timeoutExceptions:
//        wrong locator + explicit wait,
//        actual timing problem. for example, the load happens in 10 seconds, but explicit wait is 5 seconds
        }
        //40 percent you will debug trying to understand the issues

    
}
