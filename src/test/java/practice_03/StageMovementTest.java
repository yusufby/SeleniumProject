package practice_03;

import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class StageMovementTest extends TestBase {

    @Test
    public void testCase(){
        driver.get("http://automationpractice.com/index.php");
        WebElement image1=driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));
        scrollIntoViewByJS(image1);

        //hover over the product
        Actions actions=new Actions(driver);
        actions.moveToElement(image1).perform();







    }

}
