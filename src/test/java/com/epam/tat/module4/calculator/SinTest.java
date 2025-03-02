package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"17, -0.9613974918795568"})
    public void testSin(double number, double expectedResult){
        double result = calculator.sin(number);
        assertEquals(expectedResult, result);
    }
}
