package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsNegativeTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"22", "14", "2"})
    public void testIsNegativeWithPositiveValue(long number){
        boolean result = calculator.isNegative(number);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"-22", "-19", "-1"})
    public void testIsNegativeWithNegativeValue(long number){
        boolean result = calculator.isNegative(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"0"})
    public void testIsNegativeWithZero(long number){
        boolean result = calculator.isNegative(number);
        assertFalse(result);
    }
}
