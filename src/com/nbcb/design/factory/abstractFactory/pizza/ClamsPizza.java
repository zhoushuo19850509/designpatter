package com.nbcb.design.factory.abstractFactory.pizza;

import com.nbcb.design.factory.abstractFactory.factories.PizzaIngredientFactory;

public class ClamsPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamsPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + pizzaName);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClam();
    }
}
