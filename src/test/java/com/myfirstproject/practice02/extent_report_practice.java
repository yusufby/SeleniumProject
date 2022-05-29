package com.myfirstproject.practice02;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class extent_report_practice extends TestBase {
    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;



    @Test
    public void extentReport(){
        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path =System.getProperty("user.dir")+"/test-output/"+currentDate+"extent2_report.html"; ;

        extentHtmlReporter=new ExtentHtmlReporter(path);

        extentReports=new ExtentReports();

        extentReports.setSystemInfo("Environment", "Test environment1");
        extentReports.setSystemInfo("Browser", "Firefox");
        extentReports.setSystemInfo("Application", "Yusuf_yakup_fatma company");
        extentHtmlReporter.config().setDocumentTitle("Everthing is going to be okay");
        extentHtmlReporter.config().setReportName("Hi there");

        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest("My PROJECT", "THIS IS A TRIAL NOW");

        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        extentTest.info("User search for cybertruck release date");
        driver.findElement(By.xpath("//input[@name='q']")).
                sendKeys("Hi everyone"+ Keys.ENTER);

        extentReports.flush();


    }

}
