package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TgCalculatorTest extends BaseTest {
    private double a;
    private double expected;

    public TgCalculatorTest(double a,  double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void tgTest() {
        double result = calc.tg(Math.toRadians(a));
        System.out.println("tangent of " + a + " degree " + " = " + result);
        Assert.assertEquals(expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {30.0, 0.5774},
                {45, 1},
                {60.0, 1.7321}
                //// implementation of tg method is incorrect. suppose to be like  {return StrictMath.tan(a); // default impl. delegates to StrictMath}
                ///method cos returns sin which is the bug for standalone cos method as well // always returns 1
        });
    }
}