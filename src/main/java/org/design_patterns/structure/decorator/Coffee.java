package org.design_patterns.structure.decorator;

public class Coffee implements Beverage{

    @Override
    public String prepare() {
        return "Preparing coffee with its beans";
    }
}
