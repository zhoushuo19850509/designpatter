package com.nbcb.design.factory.factoryMethod;

import com.nbcb.design.factory.common.PizzaConsts;
import com.nbcb.design.factory.factoryMethod.pizza.Pizza;
import com.nbcb.design.factory.factoryMethod.store.ChicagoPizzaStore;
import com.nbcb.design.factory.factoryMethod.store.NKPizzaStore;
import com.nbcb.design.factory.factoryMethod.store.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {

        /**
         * 由NKPizzaStore下单的Pizza
         */
        PizzaStore pizzaStore = new NKPizzaStore();

        /**
         * 由ChicagoPizzaStore下单的Pizza
         */
//        PizzaStore pizzaStore = new ChicagoPizzaStore();

        Pizza pizza1  = pizzaStore.orderPizza(PizzaConsts.PIZZA_TYPE_CHEESE);
        System.out.println("finish create pizza: " + pizza1);

        System.out.println();
        Pizza pizza2  = pizzaStore.orderPizza(PizzaConsts.PIZZA_TYPE_PEPPERONI);
        System.out.println("finish create pizza: " + pizza2);

        System.out.println();
        Pizza pizza3 = pizzaStore.orderPizza(PizzaConsts.PIZZA_TYPE_GREEK);
        System.out.println("finish create pizza: " + pizza3);




    }
}
