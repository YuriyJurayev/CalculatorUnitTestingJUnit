package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultCalculatorTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public MultCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void multTest(){
        long result = calc.mult(a, b);
        System.out.println("multiplication: " + a + " * " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected,result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {16, 10, 160},
                {5, 5, 25},
                {10, -15, -150},
                {-10, -15, 150},
                {4, 0, 0}
        });
    }
}
