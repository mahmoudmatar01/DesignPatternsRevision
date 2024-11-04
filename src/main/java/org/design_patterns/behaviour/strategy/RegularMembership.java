package org.design_patterns.behaviour.strategy;

public class RegularMembership implements MembershipPriceCalculator {
    @Override
    public double calculateProductPrice(double price) {
        return price;
    }
}
