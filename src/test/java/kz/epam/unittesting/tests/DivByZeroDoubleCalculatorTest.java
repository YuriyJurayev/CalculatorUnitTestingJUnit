package kz.epam.unittesting.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroDoubleCalculatorTest extends BaseTest {

    private double a;

    public DivByZeroDoubleCalculatorTest(double a) {
        this.a = a;
    }

    @Test(expected = ArithmeticException.class)
    public void DivByZeroDoubleTest(){
        System.out.println("division: " + a + " / " + 0);
        calc.div(a, 0);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {2.2},
                {30.25},
                {151},
                {-150},
                {22.8006},
                {4.77},
                {0.0},
                {4.2},
                {0.000}
        });
    }
}