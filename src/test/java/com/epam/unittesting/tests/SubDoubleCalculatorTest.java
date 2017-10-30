package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubDoubleCalculatorTest extends BaseTest {
    private double a;
    private double b;
    private double expected;

    public SubDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test()
    public void subDoubleTest(){
        double result = calc.sub(a, b);
        System.out.println("subtraction: " + a + " - " + b + " = " + result);
        Assert.assertEquals(expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {214.5, 305.5, -91},
                {25.9, 14.7, 11.2},
                {75.45, 25.34, 50.11},
                {100.01, 64, 36.01}, // bug
                {100.1, 64.0, 36.1}, // bug
                {100.4, 64.0, 36.4}, // bug
                {100.6, 64.0, 36.6}, // bug
                {100.9, 64.0, 36.9}, // bug
                // bug with decimal after floating point of the results like *.9 and *.6 and *.4 and *.1
        });
    }
}

