package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_RadioButton {
    /* Create a class : RadioButton
 Complete the following task.
Go to https://www.facebook.com/
Click on Create an Account button
Locate the elements of radio buttons
Then click on the radio buttons for your gender if they are not selected*/
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void radio(){
//        Create a class : RadioButton
//        Complete the following task
//        Go to https://www.facebook.com/
//
//        TEST CASE:
//        Click on Create new account
        driver.findElement(By.xpath("//button[@type=\"submit\"][2]")).click();
        driver.findElement(By.linkText("Create New Account")).click();
//        Enter first name
        driver.findElement(By.name("firstname")).sendKeys("test f name");
//        Enter last name
        driver.findElement(By.name("lastname")).sendKeys("test l name");
//        Enter mobile number or email
        driver.findElement(By.name("reg_email__")).sendKeys("7804075355");
//        Enter new password
        driver.findElement(By.name("reg_passwd__")).sendKeys("secretPass!");
//        Enter birthday(LATER)

        //1.locate the dropdown element
        WebElement day01=driver.findElement(By.xpath("//select[@id=\"day\"]"));
        //2.create select object
        Select selectDay=new Select(day01);
        //3.select day
        selectDay.selectByValue("10");

        WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Jan");

        WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("2000");




//        Enter gender
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
//        Click Sign Up
        driver.findElement(By.name("websubmit")).click();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}

