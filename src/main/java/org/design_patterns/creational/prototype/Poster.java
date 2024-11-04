package org.design_patterns.creational.prototype;

public class Poster extends MarketingMaterial implements CloneableMarketingMaterial{

    public Poster(String layout, String color, String content) {
        super(layout, color, content);
    }

    public Poster(MarketingMaterial marketingMaterial) {
        super(marketingMaterial);
    }

    @Override
    public Poster clone() {
        return new Poster(this);
    }
}
