package com.nbcb.design.factory.abstractFactory.store;

import com.nbcb.design.factory.abstractFactory.factories.NYPizzaIngredientFactory;
import com.nbcb.design.factory.abstractFactory.factories.PizzaIngredientFactory;
import com.nbcb.design.factory.abstractFactory.pizza.*;
import com.nbcb.design.factory.common.PizzaConsts;

public class NKPizzaStore extends PizzaStore {
    @Override
    protected Pizza cretePizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();


        if(type.equals(PizzaConsts.PIZZA_TYPE_CHEESE)){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setPizzaName("NK style cheese pizza");
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_CLAMS)){
            pizza = new ClamsPizza(pizzaIngredientFactory);
            pizza.setPizzaName("NK style clams pizza");
        }
        return pizza;
    }
}
