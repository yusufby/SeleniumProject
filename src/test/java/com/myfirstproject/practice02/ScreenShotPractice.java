package com.myfirstproject.practice02;
import org.apache.commons.io.FileUtils;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotPractice extends TestBase {


    public  void screenShot() throws IOException {
        TakesScreenshot image=(TakesScreenshot)driver;
        File file=image.getScreenshotAs(OutputType.FILE);

        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path=System.
                getProperty("user.dir")+"/test-output/Screenshots/" + currentDate+ "hi.png";

        File finalPath=new File(path);
        FileUtils.copyFile(file,finalPath);
    }
    @Test
    public void test01() throws IOException {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]")).click();
        screenShot();
        driver.findElement(By.name("q")).sendKeys("Adana kebap" + Keys.ENTER);
        screenShot();





    }


}
