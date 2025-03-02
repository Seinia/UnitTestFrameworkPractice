package com.epam.tat.module4.timeout;

import com.epam.tat.module4.Timeout;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected Timeout timeout;

    @BeforeEach
    public void setUp(){
        this.timeout = new Timeout();
    }

}
