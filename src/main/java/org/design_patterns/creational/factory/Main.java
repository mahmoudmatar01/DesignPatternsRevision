package org.design_patterns.creational.factory;

public class Main {
    public static void main(String []args){

        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentMethodFactory());
        paymentProcessor.transferMoney(CardType.VISA,"mahmoud matar","232324234232","12/3","123",1200);
        paymentProcessor.transferMoney(CardType.MASTERCARD,"Ahmed matar","232324234232","12/3","123",234);
        paymentProcessor.transferMoney(CardType.PAYPAL,"Mostafa matar","232324234232","12/3","123",20932);

    }
}
