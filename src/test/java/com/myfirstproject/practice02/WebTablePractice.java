package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePractice extends TestBase {
    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());

        List<WebElement>table01=driver.findElements(By.xpath("//table[@id='table1']//td"));
        for ( WebElement w:table01){
            System.out.println(w.getText());
        }
        System.out.println("****** Print Table Header *****");

        List<WebElement>table03=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        for (WebElement w: table03){
            System.out.println(w.getText());
        }


        System.out.println("============");
    }
    @Test
    public void test02(){
        driver.get("https://the-internet.herokuapp.com/tables");
       List<WebElement >lastElement= driver.findElements(By.xpath("//table[@id='table1']//tr[last()]"));
        for (WebElement w: lastElement ){
            System.out.println(w.getText());
        }






    }

}
