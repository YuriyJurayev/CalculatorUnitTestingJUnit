package com.epam.unittesting.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumDoubleCalculatorTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public SumDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test()
    public void sumDoubleTest(){
        double result = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {214.5, 305.5, 520},
                {10.1, 10.3, 20.4},
                {44.0, 16, 60},
                {44.9, 16.1, 61},
                {44.7, 16, 60.7},
                {-16.0, -44.1, -60.1},
                {-16.0, 44.9, 28.9},
                {16.0, -44.9, -28.9},
                {16.0, -44.7, -28.7},
                {16.0, -44.8, -28.8},
                {16.0, -44.6, -28.6},
                {16.0, -44.5, -28.5},
                {16.0, -44.4, -28.4},
                {16.0, -44.3, -28.3},
                {16.0, -44.2, -28.2},
                {16.0, -44.7, -28.1}
        });
    }
}
