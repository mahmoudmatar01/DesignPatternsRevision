package org.design_patterns.creational.factory;

public class MastercardPaymentMethod extends PaymentMethod{

    public MastercardPaymentMethod(String holderName, String cardNumber, String cvv, String expireDate) {
        super(holderName, cardNumber, cvv, expireDate);
    }

    @Override
    protected void authorizePayment() {
        System.out.println("authorize mastercard payment ......");
    }

    @Override
    protected void startMoneyTransfer() {
        System.out.println("start transfer money using mastercard .........");
    }

    @Override
    protected void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee using mastercard for amount : "+amount);
    }
}
