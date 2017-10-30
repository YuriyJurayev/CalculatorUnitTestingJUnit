package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivCalculatorTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public DivCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void divTest(){
        long result;
        try{
            result = calc.div(a, b);
            System.out.println("division: " + a + " / " + b + " = " + result);
            Assert.assertEquals(expected, result);
        }catch (NumberFormatException e){
            System.out.println("division by zero: " + a + " / " + b + " is strongly prohibited!");
        }
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {160, 10, 16},
                {25, 5, 5},
                {-150, 15, -10},
                {-150, -15, 10},
                {0, 4, 0},
                {4, 0, 0},
                {0, 0, 0}
        });
    }
}

