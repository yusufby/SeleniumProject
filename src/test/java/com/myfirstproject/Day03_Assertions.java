package com.myfirstproject;

import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {
    @Test
    public void assertions() {
        /*
         * *****ASSERTIONS(VERIFICATIONS)*****
         * if expected = actual
         * if assertion fails we see red error
         * if assertion pass we see green checkmark
         *
         * */
//       1.assertEquals("MESSAGE WHEN FAILS", "EXPECTED", "ACTUAL")
        Assert.assertEquals("TEST CASE IS FAILEd!!!", "java", "java");
//        org.junit.ComparisonFailure: TEST CASE IS FAILEd!!!
//        Expected :java
//        Actual   :javascript
        Assert.assertEquals(5, 5);
        //2. assertTrue(BOOLEAN)
        Assert.assertTrue("JAVA".contains("E"));
//        java.lang.AssertionError
        Assert.assertTrue("SELENIUM".contains("E"));//PASS
        //3. assertFalse(BOOLEAN)
        Assert.assertFalse("JAVA".contains("E"));//PASS
        Assert.assertFalse("SELENIUM".contains("E"));//FAIL
        System.out.println("===============================");
        Assert.assertEquals("JAVA", "JAVA");
    }

        /*What is the difference between assertion and verification */
        //When assertion fails, test stops execution Assertion means Hard Assert
        //Verification means, test continue to execute even after verification   fails .
        /*in testNG , THERE IS SoftAssert/ it means verification */
        //in verification, we can mark more than one result as failed or passed



}
