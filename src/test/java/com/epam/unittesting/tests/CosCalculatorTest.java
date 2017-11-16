package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CosCalculatorTest extends BaseTest {
    private double a;
    private double expected;

    public CosCalculatorTest(double a,  double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void cosTest() {
        double result = calc.cos(Math.toRadians(a));
        System.out.println("cos of " + a + " degree" + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {1, 0.54030230586814},
                {50, 0.96496602849211}
        });
    }
}
