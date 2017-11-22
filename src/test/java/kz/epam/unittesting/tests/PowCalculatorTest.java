package kz.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowCalculatorTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public PowCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void powTest() {
        double result = calc.pow(a, b);
        System.out.println("exponentiation: number " + a + " in " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result, 0.0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {3, 2, 9},
                {5, 2, 25},
                {2, 3, 8},
                {2, 0, 1},
                {2.2, 1.1, 2.2},
                {-2.2, 1.1, -2.2},
                {0, 3, 0}
        });
    }
}




