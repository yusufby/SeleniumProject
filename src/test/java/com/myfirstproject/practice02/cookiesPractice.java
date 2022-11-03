package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class cookiesPractice extends TestBase {

    @Test
    public void cookies(){

        driver.get("https://hypnotes.net/");
        Set<Cookie>cookies=driver.manage().getCookies();
        System.out.println(cookies);
        int cookiesSize=cookies.size();
        System.out.println(cookiesSize);
        for (Cookie x:cookies){
            System.out.println("each cookie"+ x);
            System.out.println("cookie name "+x.getName());
            System.out.println("cookie value "+x.getValue());
            System.out.println("cookie domain "+x.getDomain());
            System.out.println("cookie json "+x.toJson());
        }
        System.out.println("=========");
        System.out.println(driver.manage().getCookieNamed("_gid"));

        driver.manage().deleteAllCookies();

        System.out.println("====");
        System.out.println(driver.manage().getCookies().size());
        Cookie cookie=new Cookie("yusuf", "bayram");
        driver.manage().addCookie(cookie);
        System.out.println(cookie);

    }
}
