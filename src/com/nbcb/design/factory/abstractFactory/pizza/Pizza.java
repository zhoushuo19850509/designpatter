package com.nbcb.design.factory.abstractFactory.pizza;

import com.nbcb.design.factory.abstractFactory.ingredient.Cheese;
import com.nbcb.design.factory.abstractFactory.ingredient.Clams;
import com.nbcb.design.factory.abstractFactory.ingredient.Dough;
import com.nbcb.design.factory.abstractFactory.ingredient.Sauce;

import java.util.ArrayList;

/**
 * 原来具体的Pizza类，改为抽象类
 */
public abstract class Pizza {
    // pizza名称
    protected String pizzaName;
    // pizza用的面团
    protected Dough dough;
    // pizza用的酱汁
    protected Sauce sauce;
    // pizza上用的配料、佐料 一种pizza可能包含很多种佐料
    protected ArrayList topping = new ArrayList();
    // 支持
    protected Cheese cheese;
    protected Clams clams;


    /**
     * prepare()抽象方法，交给(CheesePizza这些)子类去实现
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("baking pizza ..." + pizzaName);
    }

    public void cut(){
        System.out.println("cutting pizza ..." + pizzaName);
    }

    public void box(){
        System.out.println("boxing pizza ..." + pizzaName);
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                '}';
    }
}
