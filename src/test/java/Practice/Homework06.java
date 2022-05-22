package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework06 {
    /* Create test method and complete the following task.
//        Go to https://the-internet.herokuapp.com/checkboxes
//        Locate the elements of checkboxes
*/
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement click01=driver.findElement(By.xpath("//*[@type=\"checkbox\"][1]"));
        WebElement click02=driver.findElement(By.xpath("//*[@type=\"checkbox\"][2]"));

        if (!click01.isSelected()){
            click01.click();
        }
        if (!click02.isSelected()){
            click02.click();
        }
        Assert.assertTrue(click01.isDisplayed());
        Assert.assertTrue(click01.isSelected());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
