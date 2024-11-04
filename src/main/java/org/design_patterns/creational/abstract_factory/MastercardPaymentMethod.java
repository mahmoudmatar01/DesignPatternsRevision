package org.design_patterns.creational.abstract_factory;

public class MastercardPaymentMethod extends PaymentMethod{
    @Override
    public String getName() {
        return "Mastercard";
    }

    @Override
    public String getProviderInfo() {
        return "Mastercard company";
    }
}
