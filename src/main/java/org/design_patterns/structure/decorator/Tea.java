package org.design_patterns.structure.decorator;

public class Tea implements Beverage{

    @Override
    public String prepare() {
        return "Preparing tea with tea leaves";
    }
}
