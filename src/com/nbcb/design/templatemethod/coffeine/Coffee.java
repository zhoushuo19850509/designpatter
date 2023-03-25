package com.nbcb.design.templatemethod.coffeine;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter... ");
    }

    @Override
    public void addCondiments() {
        System.out.println("add milk and sugar into coffee ...");
    }
}
