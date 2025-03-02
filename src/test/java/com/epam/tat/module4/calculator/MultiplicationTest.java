package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"100, 500, 50000", "13,4,52", "22,-4,-88"})
    public void testMultiplicationWithLongValues(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.mult(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"100.0, 500.0, 50000.0", "2, 4.6, 9.2", "-4.7,5.4,-25.380000000000003"})
    public void testMultiplicationWithDoubleValues(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.mult(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }
}
