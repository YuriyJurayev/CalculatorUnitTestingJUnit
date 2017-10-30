package com.epam.unittesting.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest {

    protected static Calculator calc;

    @BeforeClass
    public static void setUp(){
        System.out.println("Prepare instance of Calculator");
        calc = new Calculator();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Calculation is done\n-------------------------------------"  );
    }
}
