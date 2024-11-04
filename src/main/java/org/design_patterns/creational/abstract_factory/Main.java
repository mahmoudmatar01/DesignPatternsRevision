package org.design_patterns.creational.abstract_factory;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner input=new Scanner(System.in);
        System.out.println("please, Enter your Card Number :");
        String cardNumber=input.next();
        String bankCode =cardNumber.substring(0,5);

        Factory bankFactory=new FactoryImpl();
        BankProvider bank =bankFactory.getBank(bankCode); // if bankCode is start with 12345 => banque misr OrElse banque du cairo
        PaymentMethod payment= bankFactory.getPaymentCard(cardNumber);

        System.out.println(bank.withdraw());
        System.out.println(payment.getProviderInfo()); // if card number end with 1 => visa company orElse Mastercard
    }
}
