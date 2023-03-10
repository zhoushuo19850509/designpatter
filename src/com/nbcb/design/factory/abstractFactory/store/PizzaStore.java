package com.nbcb.design.factory.abstractFactory.store;

import com.nbcb.design.factory.abstractFactory.pizza.Pizza;

/**
 * 抽象列
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza = cretePizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 在抽象类Creator中定义一个抽象方法：createPizza()
     * 将创建Pizza对象的业务逻辑下沉到子类
     * @param type
     * @return
     */
    protected abstract Pizza cretePizza(String type);

}
