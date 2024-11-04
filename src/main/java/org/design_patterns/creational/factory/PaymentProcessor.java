package org.design_patterns.creational.factory;

public class PaymentProcessor {

    private final PaymentMethodFactory factory;

    public PaymentProcessor(PaymentMethodFactory factory) {
        this.factory = factory;
    }

    public void transferMoney(CardType cardType, String cardHolder, String cardNumber, String expiryDate, String cvv,double amount){
        PaymentMethod paymentMethod = factory.createPaymentMethod(cardType,cardHolder,cardNumber,expiryDate,cvv);
        paymentMethod.transferMoney(amount);
    }
}
