package com.myfirstproject.Practice;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePractice  extends TestBase {

    @Test
    public void printTable(){
        driver.get("https://the-internet.herokuapp.com/tables");
       WebElement allElement= driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(allElement.getText());
        System.out.println("=====");


        List<WebElement> row=driver.findElements(By.xpath("//table[@id='table1']//th"));
        for(WebElement each:row){
            System.out.println(each.getText());
        }

        System.out.println(driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(1024, 768));
    }

}
