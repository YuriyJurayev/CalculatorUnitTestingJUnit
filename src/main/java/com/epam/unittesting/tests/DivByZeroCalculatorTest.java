package com.epam.unittesting.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroCalculatorTest extends BaseTest {

    private long a;

    public DivByZeroCalculatorTest(long a) {
        this.a = a;
    }

    @Test(expected = NumberFormatException.class)
    public void divByZeroTest(){
        System.out.println("division: " + a + " / " + 0);
        calc.div(a, 0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {160},
                {25},
                {-150},
                {-150},
                {0},
                {4},
                {0}
        });
    }
}
