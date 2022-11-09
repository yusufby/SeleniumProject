package com.myfirstproject.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class practice extends TestBase {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        //2.Navigate to google homepage
//        driver.get("https://www.google.com/");
//        System.out.println(driver.manage().window().getPosition());
//        System.out.println(driver.manage().window().getSize());
//        System.out.println("iframe number" + driver.findElement(By.tagName("iframe")).getSize());

        String homeDrictory=System.getProperty("user.home");
        String path=homeDrictory+"\\Downloads\\sample.png";
        boolean exist= Files.exists(Paths.get(path));
        System.out.println(exist);
        Assert.assertTrue(exist);

        //file download
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement  chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);
        WebElement upload=driver.findElement(By.id("file-submit"));
        upload.click();
        WebElement uploaded=driver.findElement(By.xpath("//*[text()='File Uploaded!']"));
        Assert.assertEquals("File Uploaded!", uploaded.getText());

    }
}
