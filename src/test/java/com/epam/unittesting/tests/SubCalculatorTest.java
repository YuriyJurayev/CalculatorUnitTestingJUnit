package com.epam.unittesting.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubCalculatorTest extends BaseTest {
    private long a;
    private long b;
    private long expected;

    public SubCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test()
    public void subTest(){
        long result = calc.sub(a, b);
        System.out.println("subtraction: " + a + " - " + b + " = " + result);
        Assert.assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {16, 15, 1},
                {15, 15, 0},
                {10, -15, 25},
                {-10, -15, 5},
                {-10, 15, -25}
        });
    }
}
