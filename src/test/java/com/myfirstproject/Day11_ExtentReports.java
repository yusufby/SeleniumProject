package com.myfirstproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11_ExtentReports  extends TestBase {

    /*Extent report
1.extent report is used for generating custom HTML REPORTS
2.We can add company or project specific information in the report configuration

SET UP
1.Add Extent report dependency on a maven project from maven website*/

    protected ExtentReports extentReports;
    protected ExtentTest extentTest;
    protected ExtentHtmlReporter extentHtmlReporter;
    @Test
    public void extentReportTest(){

        //REPORT PATH
        //Report PATH= creates the html report right under test-output
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/"+currentDate+"extent_report.html";

//      Create html reporter using the path
        extentHtmlReporter = new ExtentHtmlReporter(path);

//        Create extent report
        extentReports = new ExtentReports();

//        Add custom information
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","TechProEd");
        extentReports.setSystemInfo("SQA","John");
        extentHtmlReporter.config().setDocumentTitle("TechProEd BlueCar");
        extentHtmlReporter.config().setReportName("TechProEd Extent Report");

//        Attach html and extent reports
        extentReports.attachReporter(extentHtmlReporter);

//        Report is complete. Now we just need to create test using extentTest object
        extentTest = extentReports.
                createTest("My Project Extent Report","This is for smoke test report");


//        Done with configuration ......

        //logging the test steps in the report
        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");

    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
    extentTest.info("User search for cybertruck release date");
    driver.findElement(By.xpath("//input[@name='q']")).
            sendKeys("Tesla Cybertruck release date"+ Keys.ENTER);


   //Ending the report
   extentReports.flush();



    }
}
