package com.nbcb.design.templatemethod.coffeine;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea ... ");
    }

    @Override
    public void addCondiments() {
        System.out.println("add lemon into tea ...");
    }
}
