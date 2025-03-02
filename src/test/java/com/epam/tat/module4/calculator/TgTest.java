package com.epam.tat.module4.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TgTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"0.7, 0.8422883804630793" , "17.44,-6.148079227343593", "-2.3,1.1192136417341325"})
    public void testTg(double number, double expectedResult){
        double result = calculator.tg(number);
        assertEquals(expectedResult, result);
    }
}
