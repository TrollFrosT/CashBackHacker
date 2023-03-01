package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(actual, expected);


    }

    @Test
    public void ifAmount999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assertions.assertEquals(actual, expected);


    }

    @Test
    public void ifAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assertions.assertEquals(actual, expected);


    }

}