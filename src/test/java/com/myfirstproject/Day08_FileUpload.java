package com.myfirstproject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.myfirstproject.utilities.TestBase;

public class Day08_FileUpload extends TestBase {
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
//        locate Choose file input button
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

//        find the path of the file that you want to upload
        String filePath ="C:\\Users\\user\\Desktop\\selenium.png";

//        sendKeys(path);
        chooseFile.sendKeys(filePath);

//        click on Upload button
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();


//        Verify the upload message
        String uploadedMessage = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",uploadedMessage);
        /* AUTOMATION STEPS :
         * 1. Do Manual Testing first to understand the functionality
         *   -click on choose file
         *           - locate choose file input
         *   -select a file
         *           - use sendKeys(pathOfFile)
         *   -click upload
         *           -locate upload element and click on it
         *   -verify message : File Uploaded!
         *           -get the text of the message and do assertion
         * */

    }
}
/*Maven build life cycle */
//validate:make sure project is correct and necessary information is available
//compile:it will compile the actual source code
//Test:Testing the source code which means unit tests
//Package: it will take compiled source code in its format of distribution
//Verify: check the results of your integrated tests
//Install: install in local repository
//Deploy:install in remote repository
