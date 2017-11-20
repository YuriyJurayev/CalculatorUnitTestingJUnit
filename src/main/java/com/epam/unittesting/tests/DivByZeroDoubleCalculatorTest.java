package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroDoubleCalculatorTest extends BaseTest {

    private double a;
    private double b;

    public DivByZeroDoubleCalculatorTest(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Test(expected = ArithmeticException.class)
    public void DivByZeroDoubleTest(){
        System.out.println("division: " + a + " / " + b);
        calc.div(a, b);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {2.2, 0},
                {30.25, 0},
                {151, 0},
                {-150, 0},
                {22.8006, 0},
                {4.77, 0},
                {0, 0},
                {4.2, 0},
                {0.000, 0}
        });
    }
}