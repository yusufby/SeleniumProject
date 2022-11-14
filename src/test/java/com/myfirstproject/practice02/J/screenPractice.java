package com.myfirstproject.practice02.J;

import com.aventstack.extentreports.utils.FileUtil;
import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class screenPractice extends TestBase {
    @Test
            public void test() throws IOException {
        driver.get("https://hypnotes.net/");
        WebElement picture = driver.findElement(By.cssSelector("div .BaseNavbar_hipaaWrapper__9TlsI"));
        File fileSave = picture.getScreenshotAs(OutputType.FILE);
        File finalPath = new File("./test-output/elements/yusuf.png");
        FileUtils.copyFile(fileSave, finalPath);


    }

    @Test
    public void test2() throws IOException {
        driver.get("https://hypnotes.net/");
        WebElement element=driver.findElement(By.cssSelector(".BaseNavbar_hyp__DmE2e"));
        File file=element.getScreenshotAs(OutputType.FILE);

        File finalOne=new File("./test-output/elements/ali.png");
        FileUtils.copyFile(file,finalOne);

    }
}
