package org.design_patterns.creational.factory;

public abstract class PaymentMethod {

    private String holderName;
    private String cardNumber;
    private String cvv;
    private String expireDate;

    public PaymentMethod(String holderName, String cardNumber, String cvv, String expireDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    public void transferMoney(double amount){
        authorizePayment();
        startMoneyTransfer();
        calculatePaymentFee(amount);
    }

    protected abstract void authorizePayment(); // For verifying the payment.
    protected abstract void startMoneyTransfer(); // For initiating the transaction.
    protected abstract void calculatePaymentFee(double amount); // For calculating transaction fees.
}
