package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

       WebElement target=driver.findElement(By.cssSelector("div[id='draggable']"));
       WebElement drop=driver.findElement(By.cssSelector("div[id='droppable']"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(target, drop).perform();


    }

}
