package org.design_patterns.behaviour.observer;

public class Offer {

    private String title;
    private double offerRate;

    public Offer(String title, double offerRate) {
        this.title = title;
        this.offerRate = offerRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getOfferRate() {
        return offerRate;
    }

    public void setOfferRate(double offerRate) {
        this.offerRate = offerRate;
    }
}
