package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultDoubleCalculatorTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public MultDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void multTest(){
        double result = calc.mult(a, b);
        System.out.println("multiplication: " + a + " * " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {1.1, 2, 2.2},
                {5.5, 5.5, 30.25},
                {10, -15.1, -151},
                {-10, -15, 150},
                {4.77, 4.78, 22.8006},
                {4.77, 1, 4.77},
                {4.1, 0, 0},
                {0, 4.1, 0}
        });
    }
}
