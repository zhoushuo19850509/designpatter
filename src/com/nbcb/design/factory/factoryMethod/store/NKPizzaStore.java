package com.nbcb.design.factory.factoryMethod.store;

import com.nbcb.design.factory.common.PizzaConsts;
import com.nbcb.design.factory.factoryMethod.pizza.NKPepperoniPizza;
import com.nbcb.design.factory.factoryMethod.pizza.NYCheesePizza;
import com.nbcb.design.factory.factoryMethod.pizza.NYGreekPizza;
import com.nbcb.design.factory.factoryMethod.pizza.Pizza;

public class NKPizzaStore extends PizzaStore {
    @Override
    protected Pizza cretePizza(String type) {
        if(type.equals(PizzaConsts.PIZZA_TYPE_CHEESE)){
            return new NYCheesePizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_PEPPERONI)){
            return new NKPepperoniPizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_GREEK)){
            return new NYGreekPizza();
        }
        return null;
    }
}
