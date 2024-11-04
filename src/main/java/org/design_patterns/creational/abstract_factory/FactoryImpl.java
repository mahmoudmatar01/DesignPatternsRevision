package org.design_patterns.creational.abstract_factory;

public class FactoryImpl implements Factory {
    @Override
    public BankProvider getBank(String bankCode) {
        return switch (bankCode) {
            case "12345" -> new BanqueMisr();
            case "11111" -> new BanqueDuCairo();
            default -> null;
        };
    }

    @Override
    public PaymentMethod getPaymentCard(String cardNumber) {
        return switch (cardNumber.charAt(0)) {
            case '1' -> new VisaPaymentMethod();
            case '2' -> new MastercardPaymentMethod();
            default -> null;
        };
    }
}
