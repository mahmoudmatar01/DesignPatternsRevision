package org.design_patterns.structure.facade;

public class PaypalPaymentMethod implements PaymentMethod {
    @Override
    public void handlePaymentProcessing(double amount) {
        System.out.println("handling pay "+amount+" with paypal card");
    }
}
