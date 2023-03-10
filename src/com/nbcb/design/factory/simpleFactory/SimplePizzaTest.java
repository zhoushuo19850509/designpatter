package com.nbcb.design.factory.simpleFactory;

import com.nbcb.design.factory.common.PizzaConsts;

public class SimplePizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
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
