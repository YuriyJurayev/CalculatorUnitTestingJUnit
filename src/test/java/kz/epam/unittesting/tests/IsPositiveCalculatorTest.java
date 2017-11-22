package kz.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsPositiveCalculatorTest extends BaseTest {
    private long a;
    private boolean expected;

    public IsPositiveCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void isPositiveTest() {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + "= "+ result);
        Assert.assertEquals("The number isn't positive!", expected, result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {3440, true},
                {111, true},
                {11, true},
                {1, true},
                {0, false},
                {-1, false},
                {-3440, false},
                {-111, false},
                {-11, false},
        });
    }
}