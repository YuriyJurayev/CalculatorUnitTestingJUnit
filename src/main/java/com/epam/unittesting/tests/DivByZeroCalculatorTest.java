package com.epam.unittesting.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroCalculatorTest extends BaseTest {

    private long a;
    private long b;

    public DivByZeroCalculatorTest(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Test(expected = NumberFormatException.class)
    public void divByZeroTest(){
        System.out.println("division: " + a + " / " + b);
        calc.div(a, b);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {160, 0},
                {25, 0},
                {-150, 0},
                {-150, 0},
                {0, 0},
                {4, 0},
                {0, 0}
        });
    }
}
