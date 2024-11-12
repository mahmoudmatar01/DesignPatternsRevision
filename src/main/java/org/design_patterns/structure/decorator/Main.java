package org.design_patterns.structure.decorator;

public class Main {

    public static void main(String[] args) {

        Beverage tea = new Tea();
        System.out.println(tea.prepare());

        Beverage coffee = new Coffee();
        System.out.println(coffee.prepare());

        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.prepare());

        Beverage teaWithSugarAndMint = new SugarDecorator(new MintDecorator(tea));
        System.out.println(teaWithSugarAndMint.prepare());

    }
}
