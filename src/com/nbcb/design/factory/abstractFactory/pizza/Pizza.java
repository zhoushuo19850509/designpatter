package com.nbcb.design.factory.abstractFactory.pizza;

import com.nbcb.design.factory.abstractFactory.ingredient.Cheese;
import com.nbcb.design.factory.abstractFactory.ingredient.Clams;
import com.nbcb.design.factory.abstractFactory.ingredient.Dough;
import com.nbcb.design.factory.abstractFactory.ingredient.Sauce;

import java.util.ArrayList;

/**
 * ԭ�������Pizza�࣬��Ϊ������
 */
public abstract class Pizza {
    // pizza����
    protected String pizzaName;
    // pizza�õ�����
    protected Dough dough;
    // pizza�õĽ�֭
    protected Sauce sauce;
    // pizza���õ����ϡ����� һ��pizza���ܰ����ܶ�������
    protected ArrayList topping = new ArrayList();
    // ֧��
    protected Cheese cheese;
    protected Clams clams;


    /**
     * prepare()���󷽷�������(CheesePizza��Щ)����ȥʵ��
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
