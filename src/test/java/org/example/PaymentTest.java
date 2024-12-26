package org.example;

import org.example.money.Payment;
import org.junit.Assert;
import org.junit.Test;


public class PaymentTest {
    @Test
    public void SetOrGetInformation(){
        Payment payment = new Payment("Зубенко Михаил Петрович",19,3,2024,7952);
        Assert.assertEquals("Зубенко Михаил Петрович", payment.getFio());
        payment.setSumPay(895095587);
        Assert.assertEquals(895095587,payment.getSumPay());
        Assert.assertEquals(3,payment.getMonth());
        Assert.assertEquals(2024,payment.getYear());
    }
    @Test
    public void equals(){
        Payment p1 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Payment p2 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Assert.assertEquals(p1,p2);
    }
    @Test
    public void notEquals(){
        Payment p1 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Payment p2 = new Payment("Балтийский Дмитрий Тиньковович",1,2,2004,132);
        Assert.assertNotEquals(p1,p2);
    }

    @Test
    public void toStringTest(){
        Payment payment2= new Payment("Балтийский Дмитрий Программистович",1,2,2004,7952);
        Assert.assertEquals("Палтильщик: Балтийский Дмитрий Программистович, дата: 1.2.2004 сумма: 79 руб. 52 коп.",payment2.toString());
    }



}
