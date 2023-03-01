package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test


    public void ifAmount1000() {

        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void ifAmount999() {

        int expected = 1;
        int actual = service.remain(999);

        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void ifAmount1001() {

        int expected = 999;
        int actual = service.remain(1001);

        Assertions.assertEquals(expected, actual);
    }

}