package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class NewWindowTab extends TestBase {

    @Test
    public void test01(){

        driver.get("https://www.google.com/");
        String googleWindow=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.ebay.co.uk/");
        System.out.println(" ebay "+driver.getTitle());
        driver.switchTo().window(googleWindow);
        System.out.println( " google "+driver.getTitle());

    }
}
