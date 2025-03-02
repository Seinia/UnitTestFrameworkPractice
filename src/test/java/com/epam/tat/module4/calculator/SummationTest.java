package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummationTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"100, 500, 600", "7,4,11", "11,-22,-11"})
    public void testSummationWithLongValues(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sum(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"100.0, 500.0, 600.0", "0.77,-0.4,0.37", "22.0,0.77,22.77"})
    public void testSummationWithDoubleValues(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sum(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }
}
