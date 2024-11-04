package org.design_patterns.creational.factory;

public class VisaPaymentMethod extends PaymentMethod{

    public VisaPaymentMethod(String holderName, String cardNumber, String cvv, String expireDate) {
        super(holderName, cardNumber, cvv, expireDate);
    }

    @Override
    protected void authorizePayment() {
        System.out.println("authorize visa payment ......");
    }

    @Override
    protected void startMoneyTransfer() {
        System.out.println("start transfer money using visa .........");
    }

    @Override
    protected void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee using visa for amount : "+amount);
    }
}
