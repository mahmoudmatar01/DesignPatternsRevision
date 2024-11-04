package org.design_patterns.behaviour.strategy;

public class Main {
    public static void main(String[] args) {

        // Create new products with different membership pricing strategies
        Product wallet = new Product("Wallet", 300, new RegularMembership());
        Product mobile = new Product("Mobile12", 20000, new GoldMembership());
        Product mac = new Product("Macbook Pro", 45000, new PremiumMembership());

        // Calculate product prices based on membership
        double walletPrice = wallet.getPrice();
        double mobilePrice = mobile.getPrice();
        double macPrice = mac.getPrice();

        // Process checkout with different payment methods
        CheckOut checkoutVisa = new CheckOut(new VisaPaymentMethod());
        CheckOut checkoutPayPal = new CheckOut(new PaypalPaymentMethod());
        CheckOut checkoutBankTransfer = new CheckOut(new MastercardPaymentMethod());

        checkoutVisa.checkoutProduct(walletPrice);
        checkoutPayPal.checkoutProduct(mobilePrice);
        checkoutBankTransfer.checkoutProduct(macPrice);
    }
}
