package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class PracticeWindowHandle2 extends TestBase {

    @Test
    public void getWindow(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box=driver.findElement(By.id("hot-spot"));

        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();

        String text=driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu", text);

        driver.switchTo().alert().accept();


    }
    @Test
    public void getWindow2(){
        driver.get("https://www.amazon.com/");
        Actions actions=new Actions(driver);
        WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(accountlist).perform();
        driver.findElement(By.linkText("Orders")).click();
        String url=driver.getTitle();
        System.out.println(url);
        Assert.assertEquals("Amazon Sign-In", url);
    }
    @Test
    public void windowshandle3()
    {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement from=driver.findElement(By.id("draggable"));
        WebElement to=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from,to).perform();

    }
}
