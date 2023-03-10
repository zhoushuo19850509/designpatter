package com.nbcb.design.factory.simpleFactory;

import com.nbcb.design.factory.common.PizzaConsts;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){

        if(type.equals(PizzaConsts.PIZZA_TYPE_CHEESE)){
            return new CheesePizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_PEPPERONI)){
            return new PepperoniPizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_GREEK)){
            return new GreekPizza();
        }
        return null;
    }
}
