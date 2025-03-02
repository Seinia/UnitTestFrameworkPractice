package com.epam.tat.module4.calculator;


import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected Calculator calculator;

    @BeforeEach
    public void setUp(){
        this.calculator = new Calculator();
    }

}
