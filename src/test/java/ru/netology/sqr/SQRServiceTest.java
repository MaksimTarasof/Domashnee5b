package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRService {

    @Test
    public void getServiceTest() {

        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.calcSQR();

        Assertion.assertEquals(expected, actual);
    }

}



