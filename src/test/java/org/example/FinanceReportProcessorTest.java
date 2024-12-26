package org.example;

import org.example.money.FinanceReport;
import org.example.money.FinanceReportProcessor;
import org.example.money.Payment;
import org.junit.Assert;
import org.junit.Test;


public class FinanceReportProcessorTest {
    @Test
    public void getPaymentsSecondName() {
        Payment payment1 = new Payment("Програмистов Дмитрий Универович", 1, 2, 2003, 1000);
        Payment payment2 = new Payment("Валидатор Максим Универович", 9, 10, 2005, 1234);
        Payment payment3 = new Payment("Сисадминов Вадим Универович", 2, 12, 2003, 5678);
        Payment payment4 = new Payment("Сисадминов Вадим Универович", 2, 12, 2003, 5678);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2, payment3, payment4},
                "Балтийский Дмитрий Директорович",
                "26.11.24");
        FinanceReport financeReport2 = new FinanceReport(new Payment[]{payment2},
                "Балтийский Дмитрий Директорович",
                "26.11.24");
        Assert.assertEquals(financeReport2, FinanceReportProcessor.getSecondNamesForFirstChar(financeReport, 'В'));
    }


    @Test
    public void getPaymentsForSumPay() {
        Payment payment1 = new Payment("Програмистов Дмитрий Универович", 1, 2, 2003, 1000);
        Payment payment2 = new Payment("Валидатор Максим Универович", 9, 10, 2005, 1234);
        Payment payment3 = new Payment("Сисадминов Вадим Универович", 2, 12, 2003, 5678);
        Payment payment4 = new Payment("Сисадминов Вадим Универович", 2, 12, 2003, 5678);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2, payment3, payment4},
                "Балтийский Дмитрий Директорович",
                "26.11.24");
        FinanceReport financeReport2 = new FinanceReport(new Payment[]{payment1,payment2},
                "Балтийский Дмитрий Директорович",
                "26.11.24");
        Assert.assertEquals(financeReport2, FinanceReportProcessor.paymentsLessThanASpecifiedNumber(financeReport, 2000));
    }

}