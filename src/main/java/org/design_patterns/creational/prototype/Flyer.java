package org.design_patterns.creational.prototype;

public class Flyer extends MarketingMaterial implements CloneableMarketingMaterial{

    public Flyer(String layout, String color, String content) {
        super(layout, color, content);
    }

    public Flyer(MarketingMaterial marketingMaterial) {
        super(marketingMaterial);
    }

    @Override
    public Flyer clone() {
        return new Flyer(this);
    }
}
