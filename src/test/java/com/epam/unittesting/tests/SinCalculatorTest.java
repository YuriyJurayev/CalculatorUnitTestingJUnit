package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinCalculatorTest extends BaseTest {
    private double a;
    private double expected;

    public SinCalculatorTest(double a,  double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void sinTest() {
        double result = calc.sin(Math.toRadians(a));
        System.out.println("sin of " + a + " degree" + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {45, 0.7071067811865475},
                {60, 0.8660254037844386},
                {90, 1}
        });
    }
}