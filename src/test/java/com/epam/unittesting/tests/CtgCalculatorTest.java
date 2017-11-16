package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CtgCalculatorTest extends BaseTest {
    private double a;
    private double expected;

    public CtgCalculatorTest(double a,  double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void ctgTest() {
        double result = calc.ctg(Math.toRadians(a));
        System.out.println("ctangent of " + a + " degree " + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {30.0, 1.732},
                {45, 1},
                {60.0, 0.577}
        });
    }
}