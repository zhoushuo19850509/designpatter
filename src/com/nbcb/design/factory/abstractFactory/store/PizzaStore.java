package com.nbcb.design.factory.abstractFactory.store;

import com.nbcb.design.factory.abstractFactory.pizza.Pizza;

/**
 * ������
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
     * �ڳ�����Creator�ж���һ�����󷽷���createPizza()
     * ������Pizza�����ҵ���߼��³�������
     * @param type
     * @return
     */
    protected abstract Pizza cretePizza(String type);

}
