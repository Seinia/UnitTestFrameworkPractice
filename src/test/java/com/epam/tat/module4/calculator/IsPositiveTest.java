package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPositiveTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"22", "14", "2"})
    public void testIsPositiveWithPositiveValue(long number){
        boolean result = calculator.isPositive(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"-22", "-19", "-1"})
    public void testIsPositiveWithNegativeValue(long number){
        boolean result = calculator.isPositive(number);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"0"})
    public void testIsPositiveWithZero(long number){
        boolean result = calculator.isPositive(number);
        assertFalse(result);
    }
}
