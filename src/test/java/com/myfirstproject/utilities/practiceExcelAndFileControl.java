package com.myfirstproject.utilities;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;

public class practiceExcelAndFileControl extends TestBase {
    public static void main(String[] args) {
        String path=System.getProperty("user.home");
        String pathway=path+"\\Downloads\\sample.png";
        System.out.println(pathway);
        boolean isExist= Files.exists(Paths.get(pathway));
        Assert.assertTrue(isExist);

    }
    @Test
    public void download(){
        driver.get("https://the-internet.herokuapp.com/download");
        scrollIntoViewByJS(driver.findElement(By.cssSelector("a[href='download/kylie.png']")));
        driver.findElement(By.cssSelector("a[href='download/kylie.png']")).click();
        String path = System.getProperty("user.home") + "/Downloads/kylie.png";
        boolean exist =Files.exists(Paths.get(path));
        Assert.assertTrue(exist);
    }

    @Test
    public void upload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        String path=System.getProperty("user.home");
        String file=path+"\\Downloads\\sample.png";
        System.out.println(file);
        WebElement upload=driver.findElement(By.id("file-submit"));
        chooseFile.sendKeys(file);
        upload.click();






    }
}
