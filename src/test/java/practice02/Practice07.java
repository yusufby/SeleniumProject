package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.TreeMap;

public class Practice07 extends TestBase {
    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the username  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     * Choose price low to high and verify

     */
    @Test
    public void test01() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(4000);
        WebElement dropDown=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
        Select select =new Select(dropDown);
        Thread.sleep(4000);
        select.selectByVisibleText("Price (low to high)");
        Thread.sleep(4000);

        String expected="PRICE (LOW TO HIGH)";
        String actual=driver.findElement(By.className("active_option")).getText();

        Assert.assertEquals(expected, actual);

    }


}
