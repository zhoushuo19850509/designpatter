package com.nbcb.design.factory.abstractFactory;

import com.nbcb.design.factory.abstractFactory.pizza.Pizza;
import com.nbcb.design.factory.abstractFactory.store.NKPizzaStore;
import com.nbcb.design.factory.abstractFactory.store.PizzaStore;
import com.nbcb.design.factory.common.PizzaConsts;

public class PizzaTest {
    public static void main(String[] args) {

        /**
         * 由NKPizzaStore下单的Pizza
         */
        PizzaStore pizzaStore = new NKPizzaStore();

        /**Ω
         * 由ChicagoPizzaStore下单的Pizza
         */
//        PizzaStore pizzaStore = new ChicagoPizzaStore();

        Pizza pizza1  = pizzaStore.orderPizza(PizzaConsts.PIZZA_TYPE_CHEESE);
        System.out.println("finish create pizza: " + pizza1);

        System.out.println();
        Pizza pizza2  = pizzaStore.orderPizza(PizzaConsts.PIZZA_TYPE_CLAMS);
        System.out.println("finish create pizza: " + pizza2);





    }
}
