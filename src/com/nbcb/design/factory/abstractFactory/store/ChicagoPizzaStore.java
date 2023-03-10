package com.nbcb.design.factory.abstractFactory.store;

import com.nbcb.design.factory.abstractFactory.factories.ChicagoPizzaIngredientFactory;
import com.nbcb.design.factory.abstractFactory.factories.PizzaIngredientFactory;
import com.nbcb.design.factory.abstractFactory.pizza.CheesePizza;
import com.nbcb.design.factory.abstractFactory.pizza.ClamsPizza;
import com.nbcb.design.factory.abstractFactory.pizza.Pizza;
import com.nbcb.design.factory.common.PizzaConsts;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza cretePizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
                new ChicagoPizzaIngredientFactory();

        if(type.equals(PizzaConsts.PIZZA_TYPE_CHEESE)){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setPizzaName("Chicago style cheese pizza");
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_CLAMS)){
            pizza = new ClamsPizza(pizzaIngredientFactory);
            pizza.setPizzaName("Chicago style clams pizza");
        }
        return pizza;
    }
}
