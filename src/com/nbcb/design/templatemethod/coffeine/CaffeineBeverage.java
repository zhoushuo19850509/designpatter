package com.nbcb.design.templatemethod.coffeine;

public abstract class CaffeineBeverage {


    public void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }


    public void boilWater(){
        System.out.println("Beverage boilWater ...");
    }

    public void pourInCup(){
        System.out.println("Beverage pourInCup ...");
    }

    public abstract void brew();
    public abstract void addCondiments();

}
