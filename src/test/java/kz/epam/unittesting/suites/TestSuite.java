package kz.epam.unittesting.suites;

import kz.epam.unittesting.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SumCalculatorTest.class,
        SumDoubleCalculatorTest.class,
        SubCalculatorTest.class,
        SubDoubleCalculatorTest.class,
        MultCalculatorTest.class,
        MultDoubleCalculatorTest.class,
        DivCalculatorTest.class,
        DivByZeroCalculatorTest.class,
        DivDoubleCalculatorTest.class,
        DivByZeroDoubleCalculatorTest.class,
        PowCalculatorTest.class,
        SqrtCalculatorTest.class,
        TgCalculatorTest.class,
        CtgCalculatorTest.class,
        CosCalculatorTest.class,
        SinCalculatorTest.class,
        IsPositiveCalculatorTest.class,
        IsNegativeCalculatorTest.class
})
public class TestSuite {

}
