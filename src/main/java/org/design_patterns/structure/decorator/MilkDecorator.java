package org.design_patterns.structure.decorator;

public class MilkDecorator extends CondimentDecorator implements Beverage{

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {
        return super.prepare()+" with milk ";
    }
}
