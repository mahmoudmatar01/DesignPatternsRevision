package org.design_patterns.creational.factory;

public class PaypalPaymentMethod extends PaymentMethod{

    public PaypalPaymentMethod(String holderName, String cardNumber, String cvv, String expireDate) {
        super(holderName, cardNumber, cvv, expireDate);
    }

    @Override
    protected void authorizePayment() {
        System.out.println("authorize paypal payment ......");
    }

    @Override
    protected void startMoneyTransfer() {
        System.out.println("start transfer money using paypal .........");
    }

    @Override
    protected void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee using paypal for amount : "+amount);
    }
}
