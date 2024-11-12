package org.design_patterns.structure.facade;

import static org.design_patterns.structure.facade.PaymentMethodFactory.createPaymentMethod;

public class PaymentProcessor {
    public void paymentProcess(double amount, PaymentMethodType paymentMethodType) {
        System.out.println("Payment processing started");
        PaymentMethod paymentMethod = createPaymentMethod(paymentMethodType);
        paymentMethod.handlePaymentProcessing(amount);
    }
}
