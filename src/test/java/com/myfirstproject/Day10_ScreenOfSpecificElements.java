package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
public class Day10_ScreenOfSpecificElements  extends  TestBase{
    //    screenshot of google image



    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);

//       Save the image to path
        File finalPath = new File("./test-output/elements/googleLogo.jpeg");
        FileUtils.copyFile(logoImage,finalPath);


        // get the screenshot of "sign in " button
        WebElement signInButton=driver.findElement(By.xpath("//*[.='Sign in']"));
        File signInPath= new File("./test-output/elements/signinpath.jpeg");
        File signInImage=signInButton.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(signInImage,signInPath);


    }
}
