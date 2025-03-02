package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({"500, 100, 400", "12,-21,33", "7,4,3"})
    public void testSubtractionWithLongValues(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sub(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"500.0, 100.0, 400.0", "2.0,-7.0,9.0", "13.334,21.5213,-8.1873"})
    public void testSubtractionWithDoubleValues(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sub(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }
}
