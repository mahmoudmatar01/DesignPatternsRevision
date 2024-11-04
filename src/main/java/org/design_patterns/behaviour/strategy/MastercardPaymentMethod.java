package org.design_patterns.behaviour.strategy;

public class MastercardPaymentMethod implements PaymentMethodProcessor{
    @Override
    public void checkout(double price) {
        System.out.println("checkout using mastercard payment method: "+price);
    }
}
