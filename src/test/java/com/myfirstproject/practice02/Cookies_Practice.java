package com.myfirstproject.practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies_Practice {
    protected WebDriver driver;

    @Test
    public void cookies(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies.size());

        for(Cookie w: cookies){
            System.out.println(w);
            System.out.println(w.getName());
            System.out.println(w.getValue());
        }

        Cookie cookie2=new Cookie("I love ", "Red");
        driver.manage().addCookie(cookie2);
        System.out.println(cookie2);
        driver.manage().deleteAllCookies();



    }


}
