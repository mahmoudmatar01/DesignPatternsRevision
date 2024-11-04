package org.design_patterns.behaviour.strategy;

public class VisaPaymentMethod implements PaymentMethodProcessor{
    @Override
    public void checkout(double price) {
        System.out.println("checkout using visa payment method : "+price);
    }
}
