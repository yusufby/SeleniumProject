package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day10_Screenshots extends TestBase {
    //in testing , reporting is very essential
    //documentation of the test results
    //reports
    /**SHOULD HAVE TEST STEPS
     * SCREENSHOTS
     * TEST RESULT(PASSES OR FAILED)
        * if a test case fails then we should take screenshot for raising the bug
        *if a test case pass, then we should take screenshot as a proof
     *
    * */
    /*
     * In Testing, Screenshot is very essential
     * Documentation of test results
     * Test Reports should have test cases(test steps), test result(fails, passes), screenshots
     * If our test fails, we need screenshot to raise a bug ticket.
     * If our test passes, we should get a screenshot as a proof.
     * With Selenium 3 & 4 we can get screenshot by using TakeScreenshot class and getScreenshotAs()
     * to be able to get screenshot of a webpage
     * With Selenium 4, we can take screenshot of a specific element
     * */

    public void takeScreenShot() throws IOException {
        //Taking screenshot using getScreenShotAs
       File image= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       /*Alternatively */
        //TakesScreenshot ts=(TakesScreenshot)driver;
        // File image2=ts.getScreenshotAs(OutputType.FILE);

        String currentDate=new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        System.out.println(currentDate);

        //2. we will save the image in this path
        String path =System.getProperty
                ("user.dir")+"/test-output/Screenshots/" +currentDate + "test-image.png";
        File finalPath=new File(path);
        FileUtils.copyFile(image, finalPath);
    }


    @Test
    public void screenShotTest() throws IOException {


        driver.get("https://www.google.com");
       takeScreenShot();

      driver.findElement(By.name("q")).sendKeys("Adana kebap" + Keys.ENTER);
        takeScreenShot();
        //getScreenshotAs

    }
    /*
     * How do you capture screenshot in your automation framework?
     * how do you get screenshot in selenium ?
     * I can use getScreenshotAs() method to capture the screenshot
     * Actually we will have reusable methods for screenshots.
     * */




}
