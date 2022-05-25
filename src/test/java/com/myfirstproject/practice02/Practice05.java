package com.myfirstproject.practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.myfirstproject.utilities.TestBase;

public class Practice05 extends TestBase {
    /*//Signup For Facebook by using Actions class
    //Go to Facebook
    //Click on Create New Account
    //fill all the boxes by using keyboard actions*/

    @Test
    public void test() {
        driver.get("https://m.facebook.com/");
        driver.findElement(By.xpath("//button[@id='u_0_o_lW']")).click();

        driver.findElement(By.xpath("Create New Account")).click();

        //fill the all boxes by using keyboard actions
        WebElement nameBox = driver.findElement(By.xpath("//input[@name='firstname']"));


        Actions actions = new Actions(driver);
        actions.click(nameBox).sendKeys("Ali").
                sendKeys(Keys.TAB).
                sendKeys("Can").
                sendKeys(Keys.TAB).
                sendKeys("alican@gmail.com")
                .sendKeys(Keys.TAB).
                sendKeys("alican@gmail.com").
                sendKeys(Keys.TAB)
                .sendKeys("alican").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys()
                .sendKeys("15").
                sendKeys(Keys.TAB).
                sendKeys("Jan").
                sendKeys(Keys.TAB)
                .sendKeys("2022").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();


    }


}
