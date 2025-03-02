package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"500, 100, 5", "-4,2,-2", "13,4,3"})
    public void testDivisionWithLongValues(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.div(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"500, 0"})
    public void testDivisionByZeroWithLongValues(long firstNumber, long secondNumber){
        assertThrows(NumberFormatException.class, () -> calculator.div(firstNumber, secondNumber));
    }

    @ParameterizedTest
    @CsvSource({"2.5,4.2,0.5952380952380952", "-2.0,0.4,-5.0", "0.0,0.0,NaN", "-4.0,2.0,-2.0"})
    public void testDivisionWithDoubleValues(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.div(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }
}
