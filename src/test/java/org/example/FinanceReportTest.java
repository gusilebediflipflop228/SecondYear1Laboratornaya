package org.example;

import org.example.money.FinanceReport;
import org.example.money.Payment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FinanceReportTest {
    @Test
    public void getQuantity() {
        Payment notElephant1 = new Payment("Первый Валидатор Незнаювич", 1, 1, 2001, 11111);
        Payment notElephant2 = new Payment("Второй Сисадмин Незнаювич", 1, 1, 2001, 11111);
        Payment notElephant3 = new Payment("Третий Очкиносящий Незнаювич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1, notElephant2, notElephant3}, "Балтийский Дмитрий Директорович", "11.09.2001");
        assertEquals(3,financeReport.getQuantityPayments());
    }

    @Test
    public void setPayment(){
        Payment notElephant1 = new Payment("Первый Валидатор Незнаювич", 1, 1, 2001, 11111);
        Payment notElephant2 = new Payment("второй Сисадмин Незнаювич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1,notElephant2},"Балтискйи Дмитрий Программистович","01.01.2001");
        financeReport.setPayment(notElephant1,1);
        assertEquals(notElephant1,financeReport.getPayment(1));
    }

    @Test
    public void toStringTest(){
        Payment notElephant1 = new Payment("Первый Валидатор Незнаювич", 1, 1, 2001, 13423411);
        Payment notElephant2 = new Payment("Второй Сисадмин Незнаювич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1,notElephant2},"Бальийский Дмитрий Программистович","11.09.2011");
        assertEquals("[Автор: Бальийский Дмитрий Программистович, дата: 11.09.2011. Платежи: [\n" +
                "\tПлатильщик: Первый Валидатор Незнаювич, дата: 1.1.2001 сумма: 134234 руб. 11 коп.\n" +
                "\tПлатильщик: Второй Сисадмин Незнаювич, дата: 1.1.2001 сумма: 111 руб. 11 коп.\n" +
                "]]",financeReport.toString());
        System.out.println(financeReport.toString());
    }

    @Test
    public void financeReportCopy() {
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,5, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 1,11,15, 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2},
                "Юрисаров Тимофей Вениаминович",
                "26.12.24");
        FinanceReport financeReport1 = new FinanceReport(financeReport);
        financeReport.setPayment(new Payment("none", 1,1,1, 0), 0);
        Assert.assertNotEquals(financeReport1, financeReport);
    }

}
