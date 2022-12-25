package ru.netology.sqr;

import org.example.SQRService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestBorderRangeTwoHundredThreeHundred() {

        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    public void calcTestBorderRangeZeroNinety() {

        SQRService service = new SQRService();
        int actual = service.calc(0, 90);
        int expected = 1;// спецом "роняю" тест и делаю анализ "SQRServiceTest.calcTest2:26 expected: <1> but was: <0>"
        assertEquals(expected, actual);


    }

    @Test
    public void calcTestBorderOneHundredTenThousand() {

        SQRService service = new SQRService();
        int actual = service.calc(100, 10000);
        int expected = 89;
        assertEquals(expected, actual);


    }


}
