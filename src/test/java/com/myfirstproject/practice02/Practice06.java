package com.myfirstproject.practice02;

import org.junit.Assert;
import org.junit.Test;
import com.myfirstproject.utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Practice06 extends TestBase {
    /*/*
     //verify that we have pom.xml file in out project
     */
    @Test
    public void verification(){
         String homeDirectory=System.getProperty("user.home");

         String filePath=homeDirectory + "\\IdeaProjects\\myseleniumproject01\\pom.xml";
         String absolutePath="C:\\Users\\user\\IdeaProjects\\myseleniumproject01\\pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
    }
}
