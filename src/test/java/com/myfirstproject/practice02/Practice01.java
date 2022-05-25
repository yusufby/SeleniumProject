package com.myfirstproject.practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.myfirstproject.utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice01 extends TestBase  {
    /*// go to the URL
     https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    // click on the second emoji
    // click all the second emoji elements
    // fill the form,(Fill the form with the texts you want)
    // press the apply button*/

        @Test
        public void animalTest() {
            driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

            WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
            driver.switchTo().frame(iframe);

            // click on the second emoji
            WebElement secondEmoji = driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
            secondEmoji.click();

            // click all the second emoji elements
            List<WebElement> emojees = driver.findElements(By.xpath("//div[@id='nature']/div/img"));
            for (WebElement w: emojees){
                w.click();
            }
            // emojees.stream().forEach(t->t.click());  //we can write the code with lambda as well

            driver.switchTo().defaultContent();

            // fill the form,(Fill the form with the texts you want)
            List<WebElement> textBoxes =  driver.findElements
                    (By.xpath("//div[@class='mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded']"));

            //this -iframe -example looks -very-funny-does-not-?-!
            List<String>words=new ArrayList<>
                    (Arrays.asList("This", "iframe", "example", "looks", "very", "funny", "does", "not", "it", "?", "!"));
            for (int i=0; i<textBoxes.size(); i++){
                textBoxes.get(i).sendKeys(words.get(i));
            }

        }





    }

