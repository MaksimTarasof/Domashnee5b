package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void getServiceTest() {

        SQRService service = new SQRService();

        int min = 10;
        int max = 99;
        int expected = 0;

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getServiceTest1() {

        SQRService service = new SQRService();

        int min = 500;
        int max = 600;
        int expected = 2;

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getServiceTest2() {

        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getServiceTest3() {

        SQRService service = new SQRService();

        int min = 10;
        int max = 100;
        int expected = 1;

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

}



