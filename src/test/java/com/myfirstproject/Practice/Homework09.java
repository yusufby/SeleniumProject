package com.myfirstproject.Practice;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.myfirstproject.utilities.TestBase;

public class Homework09 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(4);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(4);



    }
}
