package practice04;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class extentReport extends TestBase {

   protected static ExtentReports extentReports;
   protected static ExtentHtmlReporter extentHtmlReporter;
   protected static ExtentTest extentTest;



   @Test
           public void test(){
        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        System.out.println(currentDate);
        String path=System.getProperty("user.dir")+"/test-output/"+ currentDate+"extentReport.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);
        extentReports=new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest("hi guys", "this is a temparary test");

       //logging the test steps in the report
       extentTest.info("User goes to google home page");
       extentTest.pass("User goes to google home page");
       extentTest.fail("User goes to google home page");
       extentTest.skip("User goes to google home page");
       extentTest.warning("User goes to google home page");

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        extentTest.info("User search for cybertruck release date");
        driver.findElement(By.xpath("//input[@name='q']")).
                sendKeys("Tesla Cybertruck release date"+ Keys.ENTER);
        extentReports.flush();

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);


        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", ourRooms);



    }
}
