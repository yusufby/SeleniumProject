package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice03 {
    /*// ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the lastname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button*/
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @Test
    public void test01(){
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();
        driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("YUSUF");

        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Bayram");

        driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"exp-6\"]")).click();
                driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("01-01-1989");
                driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();
                driver.findElement(By.xpath(" //*[@id=\"continents\"]")).sendKeys("Europe");
                driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
