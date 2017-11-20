package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivDoubleCalculatorTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public DivDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void divTest(){
        double result = calc.div(a, b);
        System.out.println("division: " + a + " / " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {2.2, 2, 1.1},
                {30.25, 5.5, 5.5},
                {151, -15.1, -10},
                {-150, -15, 10},
                {22.8006, 4.78, 4.77},
                {4.77, 1, 4.77}
        });
    }
}

