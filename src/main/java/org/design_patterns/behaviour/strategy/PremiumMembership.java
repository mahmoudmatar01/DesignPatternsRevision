package org.design_patterns.behaviour.strategy;

public class PremiumMembership implements MembershipPriceCalculator {
    @Override
    public double calculateProductPrice(double price) {
        return price * 0.6;
    }
}
