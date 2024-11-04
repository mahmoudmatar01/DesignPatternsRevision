package org.design_patterns.behaviour.strategy;

public class Product {
    private String name;
    private double price;
    private final MembershipPriceCalculator membershipPriceCalculator;

    public Product(String name, double price, MembershipPriceCalculator membershipPriceCalculator) {
        this.name = name;
        this.price = price;
        this.membershipPriceCalculator = membershipPriceCalculator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return membershipPriceCalculator.calculateProductPrice(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
