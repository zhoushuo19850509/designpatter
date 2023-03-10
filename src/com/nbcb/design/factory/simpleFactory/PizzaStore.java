package com.nbcb.design.factory.simpleFactory;

public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
