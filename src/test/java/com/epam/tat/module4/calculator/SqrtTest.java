package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"16.0, 4.0", "22.0,4.69041575982343", "17.44,4.17612260356422"})
    public void testSqrt(double number, double expectedResult){
        double result = calculator.sqrt(number);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"-9, NaN", "-2, NaN"})
    public void testSqrtWithNegativeValue(double number, double expectedResult){
        double result = calculator.sqrt(number);
        assertEquals(expectedResult, result);
    }
}
