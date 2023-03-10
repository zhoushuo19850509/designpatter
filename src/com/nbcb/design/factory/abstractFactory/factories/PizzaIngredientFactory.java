package com.nbcb.design.factory.abstractFactory.factories;

import com.nbcb.design.factory.abstractFactory.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Clams createClam();
}
