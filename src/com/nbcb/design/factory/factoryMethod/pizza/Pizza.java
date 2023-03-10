package com.nbcb.design.factory.factoryMethod.pizza;

import java.util.ArrayList;

public class Pizza {
    // pizza����
    protected String pizzaName;
    // pizza�õ�����
    protected String dough = "default dough"; // ���û������Ҫ�󣬾���Ĭ�ϵ�����
    // pizza�õĽ�֭
    protected String sauce = "default sauce"; // ���û������Ҫ�󣬾���Ĭ�ϵĽ�֭
    // pizza���õ����ϡ����� һ��pizza���ܰ����ܶ�������
    protected ArrayList topping = new ArrayList();

    public void prepare(){
        System.out.println("preparing pizza ..." + pizzaName);
        System.out.println("Tossing dough ..." + this.dough);  // ����
        System.out.println("Adding Sauce..." + this.sauce);  // �Ž�֭
        System.out.println("Adding topping ..."); // �����������
        if(null != this.topping && this.topping.size() > 0){
            for (int i = 0; i < topping.size(); i++) {
                System.out.println("   " + topping.get(i));
            }
        }
    }

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
