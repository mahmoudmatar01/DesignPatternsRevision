package org.design_patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketPlace {

    private Map<EventType, List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;

    public MarketPlace() {
        this.subscribers = new HashMap<>();
        initEventSubscriber();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    private void initEventSubscriber() {
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_JOB_OPENING, new ArrayList<>());
    }

    public void subscribe(EventType eventType, Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);
    }

    public void unsubscribe(EventType eventType, Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

    public void addProduct(Product product) {
        products.add(product);
        subscribers.get(EventType.NEW_PRODUCT).forEach(
                subscriber -> subscriber.notifySubscriber("new product with name " + product.getName() + "added")
        );
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        subscribers.get(EventType.NEW_OFFER).forEach(
                subscriber -> subscriber.notifySubscriber("new offer with name " + offer.getTitle() + "added")
        );
    }

    public void addJobOffer(String jobDescription) {
        subscribers.get(EventType.NEW_JOB_OPENING).forEach(
                subscriber -> subscriber.notifySubscriber("new job added with description" + jobDescription));
    }

}
