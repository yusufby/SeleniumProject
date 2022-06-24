package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownload extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("logo.png")).click();
        Thread.sleep(4000);

        String path=System.getProperty("user.home")+"/Downloads/logo.png";

        boolean downloadCheck= Files.exists(Paths.get(path));
        Assert.assertTrue(downloadCheck);



    }

}
