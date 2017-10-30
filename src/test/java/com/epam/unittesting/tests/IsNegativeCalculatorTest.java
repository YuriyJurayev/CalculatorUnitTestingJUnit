package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsNegativeCalculatorTest extends BaseTest {
    private long a;

    public IsNegativeCalculatorTest(long a) {
        this.a = a;
    }

    @Test()
    public void isNegativeTest(){
        boolean result = calc.isNegative(a);
        System.out.println("is " + a + " the negative number " + "= "+ result);
        Assert.assertTrue(result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{ // only the 3rd test should be passed
                {11},
                {0},
                {-1}
        });
    }
}