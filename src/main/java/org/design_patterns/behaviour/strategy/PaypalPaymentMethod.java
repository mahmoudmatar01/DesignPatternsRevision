package org.design_patterns.behaviour.strategy;

public class PaypalPaymentMethod implements PaymentMethodProcessor{
    @Override
    public void checkout(double price) {
        System.out.println("checkout using paypal payment method: "+price);
    }
}
