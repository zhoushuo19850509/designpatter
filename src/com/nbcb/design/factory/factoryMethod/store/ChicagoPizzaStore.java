package com.nbcb.design.factory.factoryMethod.store;

import com.nbcb.design.factory.common.PizzaConsts;
import com.nbcb.design.factory.factoryMethod.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza cretePizza(String type) {
        if(type.equals(PizzaConsts.PIZZA_TYPE_CHEESE)){
            return new ChicagoCheesePizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_PEPPERONI)){
            return new ChicagoPepperoniPizza();
        }else if(type.equals(PizzaConsts.PIZZA_TYPE_GREEK)){
            return new ChicagoGreekPizza();
        }
        return null;
    }
}
