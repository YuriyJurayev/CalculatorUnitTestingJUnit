package kz.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SumCalculatorTest extends BaseTest {
    private long a;
    private long b;
    private long expected;

    public SumCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test()
    public void testSum() {
        long result = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + result);
        Assert.assertEquals("Expected and actual results aren't equal",expected, result);

    }

    @Parameterized.Parameters
    public static Collection data1(){
        return Arrays.asList(new Object[][]{
                {2, 3, 5},
                {2, 2, 4},
                {1, 0, 1}
        });
    }
}