package com.epam.unittesting.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SqrtCalculatorTest extends BaseTest {
    private double a;
    private double expected;

    public SqrtCalculatorTest(double a,  double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void sqrtTest() {
        double result = calc.sqrt(a);
        System.out.println("sqrt of " + a + " is " + result);
        Assert.assertEquals( expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {9, 3},
                {4, 2},
                {49, 7},
                {1.21, 1.1},
                {-49, 7},
                {0, 0}
        });
    }
}