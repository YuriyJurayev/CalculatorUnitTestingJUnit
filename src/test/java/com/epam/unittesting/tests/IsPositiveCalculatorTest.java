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
        Assert.assertTrue(result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{  // only the 1st test should be passed
                {1},
                {0},
                {-1}
        });
    }
}