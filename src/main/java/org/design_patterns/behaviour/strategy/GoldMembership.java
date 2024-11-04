package org.design_patterns.behaviour.strategy;

public class GoldMembership implements MembershipPriceCalculator{
    @Override
    public double calculateProductPrice(double price) {
        return price * 0.8;
    }
}
