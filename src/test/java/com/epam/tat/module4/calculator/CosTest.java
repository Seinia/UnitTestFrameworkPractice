package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"0.99, 0.5486898605815875", "-2.0,-0.4161468365471424", "12.0,0.8438539587324921"})
    public void testCos(double number, double expectedResult){
        double result = calculator.cos(number);
        assertEquals(expectedResult, result);
    }
}
