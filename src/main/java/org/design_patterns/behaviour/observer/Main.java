package org.design_patterns.behaviour.observer;


public class Main {
    public static void main(String[] args) {

        // create a new marketplace
        MarketPlace onlineMarketPlace = new MarketPlace();

        // create a new customers
        Subscriber mahmoud = new Customer("Mahmoud","01128673348");
        Subscriber ahmed = new Customer("Ahmed","01227007298");
        Subscriber mostafa = new Customer("Mostafa","0111161494");
        Subscriber ziad = new Customer("Ziad","0123456789");

        // make customer subscribe in different events
        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT,mahmoud);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,mahmoud);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,ahmed);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,mostafa);
        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT,mostafa);
        onlineMarketPlace.subscribe(EventType.NEW_JOB_OPENING,ziad);

//        // add a new product to our marketplace
        onlineMarketPlace.addProduct(new Product("Apple Watch",9500));  // will send a notify message to mahmoud and mostafa for new product
        onlineMarketPlace.addProduct(new Product("Mac book pro",40500)); // will send a notify message to mahmoud and mostafa for new product

        // add a new offer to our marketplace
        onlineMarketPlace.addOffer(new Offer("Black Friday Offer",20)); // will send a notify message to mahmoud and ahmed and mostafa for new offer

        // add a new jon opening to our marketplace
        onlineMarketPlace.addJobOffer("Junior java developer"); // will notify ziad for a new job position
//
//        // customer unsubscribe from an event
        onlineMarketPlace.unsubscribe(EventType.NEW_JOB_OPENING,ziad);
    }
}