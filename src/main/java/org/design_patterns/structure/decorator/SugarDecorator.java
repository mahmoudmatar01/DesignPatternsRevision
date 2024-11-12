package org.design_patterns.structure.decorator;

public class SugarDecorator extends CondimentDecorator implements Beverage{

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {
        return super.prepare() + "with sugar";
    }
}
