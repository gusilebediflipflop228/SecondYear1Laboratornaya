package org.example.money;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] payments;
    private String fio;
    private String Date;


    public FinanceReport(Payment[] payments, String fio, String Date) {
        this.Date = Date;
        this.fio = fio;
        this.payments = payments;
    }

    public FinanceReport() {
        this.payments = new Payment[]{};
        this.fio = "none";
        this.Date = "01.01.01";
    }


    public int getQuantityPayments() {
        return payments.length;
    }

    public Payment getPayment(int n) {
        return payments[n];
    }

    public void setPayment(Payment payment, int n) {
        payments[n] = payment;
    }

    @Override
    public String toString() {
        StringBuilder pay = new StringBuilder();
        for (Payment payment : payments) {
            if (payment == null) break;
            pay.append("\t").append(payment).append("\n");
        }
        return String.format("[Автор: %s, дата: %s. Платежи: [\n%s]]", fio, Date, pay);
    }

    public String getFio() {
        return fio;
    }

    public String getDate() {
        return Date;
    }

    public FinanceReport(FinanceReport financeReport) {
        this.fio = financeReport.fio;
        this.Date = financeReport.Date;
        this.payments = new Payment[financeReport.payments.length];
        for (int i = 0; i < financeReport.getQuantityPayments(); ++i) {
            payments[i] = new Payment(
                    financeReport.getPayment(i).getFio(),
                    financeReport.getPayment(i).getDay(),
                    financeReport.getPayment(i).getMonth(),
                    financeReport.getPayment(i).getYear(),
                    financeReport.getPayment(i).getSumPay());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return Arrays.equals(payments, that.payments) && Objects.equals(fio, that.fio) && Objects.equals(Date, that.Date);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fio, Date);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }


}
