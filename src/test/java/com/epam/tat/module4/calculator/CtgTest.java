package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CtgTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"0.7, 1.1872418321266796", "0.33,2.9194960564791734", "-6.0,3.436353004180128"})
    public void testCtg(double number, double expectedResult){
        double result = calculator.ctg(number);
        assertEquals(expectedResult, result);
    }
}
