package org.design_patterns.creational.abstract_factory;

public class VisaPaymentMethod extends PaymentMethod{
    @Override
    public String getName() {
        return "Visa Card";
    }

    @Override
    public String getProviderInfo() {
        return "Visa Company";
    }
}
