package com.myfirstproject;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Day08_FileExist {
    @Test
    public void isExistTest(){
//        Pick a file on your desktop
//        My file: logo.jpeg on the desktop
//        I will check if the file exist
        String homeDirectory = System.getProperty("user.home");

        System.out.println(homeDirectory);
//        WINDOWS EXAMPLE : C:\Users\Acer
//        MAC EXAMPLE : /Users/techproed

//     Path of the image
        //String pathOfFile = homeDirectory+"/Desktop/logo.jpeg";
       String pathOfFile = homeDirectory+"\\Desktop\\selenium.png";   //Windows

        System.out.println(pathOfFile);///Users/techproed/Desktop/logo.jpeg

//        And verify if that file exists on your computer or not
        boolean isFileExist = Files.exists(Paths.get(pathOfFile));//(files come from java nio library )
        Assert.assertTrue(isFileExist);//Pass is exist, Fail is not exist

    }

    @Test
    public void secondWay(){
        String filePath ="C:\\Users\\user\\Desktop\\selenium.png";
//        Is there is a file whose name is logo.jpeg on Desktop, then this pass; or else this fails
        boolean isFileExist = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isFileExist);
    }
    /*Why reusable methods are important for an automation?*/
    //save time
    //clean test cases
    //avoid repeating
    //reducing mistakes
    //focusing on test cases rather than coding carefully
    //once we have a good reusable code, then we should always use that code
    //easy debug
    //easy  maintenance
    @Test
    public void check(){

     String homeDirectory="user.home";
     String path=homeDirectory+"\\Desktop\\buyuk tesbihat.jpec";

    boolean existssss=Files.exists(Paths.get(path));
    Assert.assertTrue(existssss);
    }
}
