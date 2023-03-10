package com.nbcb.design.factory.abstractFactory.factories;

import com.nbcb.design.factory.abstractFactory.ingredient.*;


public class NYPizzaIngredientFactory implements  PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
