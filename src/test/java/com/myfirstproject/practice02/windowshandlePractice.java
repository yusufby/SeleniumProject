package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class windowshandlePractice extends TestBase {

    @Test
    public void windowHandle(){
        driver.get("https://hypnotes.net/");
        System.out.println(driver.getTitle());
        String windowHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.co.uk/");
        System.out.println(driver.getTitle());
        String windowHandle2=driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        System.out.println(driver.getTitle());

        driver.switchTo().window(windowHandle2);
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies);
        int size=cookies.size();
        System.out.println(size);



    }

}
