package org.design_patterns.creational.abstract_factory;

public interface Factory {
    BankProvider getBank(String bankCode);
    PaymentMethod getPaymentCard(String cardNumber);
}
