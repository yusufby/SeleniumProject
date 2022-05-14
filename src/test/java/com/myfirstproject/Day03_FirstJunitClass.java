package com.myfirstproject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class Day03_FirstJunitClass {
    /*
     * *****JUNIT*****
     * Junit is a testing framework
             * Testers can use Junit for creating automation framework
             * Devs can use Junit for creating Unit test framework
     *
     * *****ANNOTATIONS******
     * There are 7 annotations
     * 1. @Test -> marks a method as a TEST CASE
             * All test methods are VOID
             * B/C we create test cases for assertion, not to return a value
             * We no longer need main method for Creating or Running test cases
             * We can run test methods form the method level or class level

     * 2. @Before : Runs before EACH @Test annotation
     * 3. @After : Runs after EACH @Test annotation
     * 4. @BeforeClass : Runs before each class only once
     * 5. @AfterClass : Runs after each class only once
     * 6. @Ignore : Skipping a test case

      */
         // testNG FRAMEWORK which is advanced version of JUnit
    @Before
    @Test  //it is used creating a test case
    public void test1(){
        System.out.println("BEFORE METHOD");
    }
    @After
    @Test
    public void test2(){
        System.out.println("AFTER METHOD");
    }
    @Test
    public void test3(){
        System.out.println("This is Test 3");
    }
    @Ignore
    @Test
    public void test4(){
        System.out.println("This is Test 4");
    }

    @Test
    public void test05(){
        System.out.println("this is Test 5");
    }


}
