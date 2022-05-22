package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework07 {
    /* user goes to http://a.testaddressbook.com/sign_in
    Locating username, password, and button using xpath*/
     /*1. Location username, password, and button using cssSelector
        There is no // 2. There is no @ symbol in cssSelector*/
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }
    @Test
    public void test01(){
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.cssSelector("input[id='session_email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[id='session_password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }

}
