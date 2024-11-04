package org.design_patterns.creational.prototype;

public class Brochure extends MarketingMaterial implements CloneableMarketingMaterial{

    public Brochure(String layout, String color, String content) {
        super(layout, color, content);
    }

    public Brochure(MarketingMaterial marketingMaterial) {
        super(marketingMaterial);
    }

    @Override
    public Brochure clone() {
        return new Brochure(this);
    }
}
