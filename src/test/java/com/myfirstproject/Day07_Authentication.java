package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import com.myfirstproject.utilities.TestBase;


public class Day07_Authentication extends TestBase {

    //Authentication means : Verifying the identity of a user

    @Test
    public void basicAuthentication(){
//        driver.get("https://USERNAME:PASSWORD@URL");
//        below will type admin for username and password on the link the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//        Verify teh congratulations message
        String message = driver.findElement(By.xpath("//p")).getText();

//        Assertion
        Assert.assertTrue(message.contains("Congratulations"));
    }


}
