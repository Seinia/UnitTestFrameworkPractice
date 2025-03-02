package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"2.0, 4.0, 16.0", "2.0, 4.6, 24.251465064166364", "2.0,-7.0,0.0078125"})
    public void testPow(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.pow(firstNumber, secondNumber);
        assertEquals(expectedResult, result);
    }
}
