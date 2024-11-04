package org.design_patterns.creational.prototype;

public class Main {

    public static void main(String []args){
        // create a new Flyer object
        Flyer flyer = new Flyer("Flyer-A4","Green","Welcome to prototype design pattern");
        // clone my old flyer object and change some configuration
        Flyer flyer2 = flyer.clone();
        flyer2.setContent("Cloned Flyer");
        flyer2.setColor("White");
        System.out.println(flyer.toString());
        System.out.println(flyer2.toString());

        // create a new instance from Poster class
        Poster poster = new Poster("Poster-A3","Red","Welcome to prototype design pattern");
        // clone my old poster object and change some configuration
        Poster poster2 = poster.clone();
        poster2.setColor("Black");
        System.out.println(poster.toString());
        System.out.println(poster2.toString());

    }
}
