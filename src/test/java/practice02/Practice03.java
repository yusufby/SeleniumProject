package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practice03 extends TestBase {
    /*// go to amazon homepage
// hover mouse over the hello,signIn element at the top right
// Click on the new list link in the menu that opens
// and verify that title is equal to "Your List"*/

    @Test
    public void test01(){
        // go to amazon homepage
        driver.get("https://www.amazon.co.uk/");

        //hover mouse over the hello,signIn element at the top right

        Actions actions =new Actions(driver);



        // Click on create list link in the menu that opens
        WebElement listElement=driver.findElement(By.xpath("//span[@class='nav-text']"));
        actions.click(listElement).perform();

        // and verify that title is equal to "Your List"
        Assert.assertEquals("Your List", driver.getTitle());

    }


}
