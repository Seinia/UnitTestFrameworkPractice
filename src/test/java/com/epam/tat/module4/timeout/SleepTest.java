package com.epam.tat.module4.timeout;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static com.epam.tat.module4.Timeout.sleep;

public class SleepTest extends BaseTest{

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    public void testSleep(){
        sleep(4);
    }
}
