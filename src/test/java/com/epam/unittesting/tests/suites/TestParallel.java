package com.epam.unittesting.tests.suites;

import com.epam.unittesting.tests.*;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class TestParallel {

    @Test
    public void test(){
        Class[] parallel = { SumCalculatorTest.class,
                SumDoubleCalculatorTest.class,
                SubCalculatorTest.class,
                SubDoubleCalculatorTest.class,
                MultCalculatorTest.class,
                MultDoubleCalculatorTest.class,
                DivCalculatorTest.class,
                DivDoubleCalculatorTest.class,
                PowCalculatorTest.class,
                SqrtCalculatorTest.class,
                TgCalculatorTest.class,
                CtgCalculatorTest.class,
                CosCalculatorTest.class,
                SinCalculatorTest.class,
                IsPositiveCalculatorTest.class,
                IsNegativeCalculatorTest.class};

        JUnitCore.runClasses(ParallelComputer.classes(), parallel);

        JUnitCore.runClasses(ParallelComputer.methods(), parallel);

        JUnitCore.runClasses(new ParallelComputer(true, true), parallel);

    }
}
