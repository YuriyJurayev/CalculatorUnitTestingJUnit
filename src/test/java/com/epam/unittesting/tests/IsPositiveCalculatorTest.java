package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsPositiveCalculatorTest extends BaseTest {
    private long a;

    public IsPositiveCalculatorTest(long a) {
        this.a = a;
    }

    @Test()
    public void isPositiveTest() {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + " = " + result);
        if(a > 0){
            Assert.assertTrue("Result is negative",result);
        }else {
            Assert.assertFalse("Result is positive",result);
        }
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {3440},
                {111},
                {11},
                {1},
                {0},
                {-1},
                {-3440},
                {-111},
                {-11},
        });
    }
}