package org.design_patterns.behaviour.strategy;

public class CheckOut {

    private final PaymentMethodProcessor paymentMethodProcessor;

    public CheckOut(PaymentMethodProcessor paymentMethodProcessor) {
        this.paymentMethodProcessor = paymentMethodProcessor;
    }

    public void checkoutProduct(double price){
        paymentMethodProcessor.checkout(price);

    }
}
