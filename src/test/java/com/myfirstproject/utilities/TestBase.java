package com.myfirstproject.utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase {

    /*
     * What is TestBase?
     * TestBase is a class that has repeated pre condition and post condiditon
     * We have @Before and @After methods
     *
     * TestBase should be an abstract class.We just want to implement the methods in TestBase
     * We don't want to create an object od TestBase class
     *
     * */
    protected static WebDriver driver;
    Faker faker = new Faker();


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {
        driver.quit();
    }


    //    Create a reusable method for clicking checkbox
//    * @param checkboxElement : WebElement of the checkbox
//    * @param checked : boolean of the checkbox element
//
//            * Example: if you want to click when checkbox is checked then checked = true
//            *         if you want to click when checkbox is not checked then checked = false
//            *
//            *         selectCheckBox(checkbox1, true); make sure the checkbox1 is checked
//    *         selectCheckBox(checkbox1, false); make sure the checkbox1 is unchecked
//    */
    public static void selectCheckBox(WebElement checkboxElement, boolean checked) {
        if (checked) {
            if (!checkboxElement.isSelected()) {
                checkboxElement.click();
            }
        } else {
            if (checkboxElement.isSelected()) {
                checkboxElement.click();
            }
        }
    }

    /*
    Accepts windowHandle as parameter
    And switches to that window
    * */

    public static void switchToTargetWindow(String targetTitle) {
        for (String handle : driver.getWindowHandles()) {
            String title = driver.switchTo().window(handle).getTitle();
            if (title.equals(targetTitle)) {
                System.out.println("Page found : " + driver.getTitle());
                return;
            }
        }
    }

    public void takeScreenShot() throws IOException {
        //Taking screenshot using getScreenShotAs
        File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        /*Alternatively */
        //TakesScreenshot ts=(TakesScreenshot)driver;
        // File image2=ts.getScreenshotAs(OutputType.FILE);

        String currentDate = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        System.out.println(currentDate);

        //2. we will save the image in this path
        String path = System.getProperty
                ("user.dir") + "/test-output/Screenshots/" + currentDate + "test-image.png";
        File finalPath = new File(path);
        FileUtils.copyFile(image, finalPath);
    }


    @Test
    public void scrollIntoViewByJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", element);

    }

    @Test
    public void scrollAllDownByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

    @Test
    public void scrollAllUpByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    @Test
    public void clickByJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    //Set the value of input using js executor
    //this method changes the value attribute of an element

    public void setValueByJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //get the value of an input. param idOfElement
    public void getValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
       String value= js.executeScript("return document.getElementById('"+idOfElement+"').value").toString();
        System.out.println(value);
    }


}
