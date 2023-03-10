package com.nbcb.design.factory.factoryMethod.pizza;

import java.util.ArrayList;

public class Pizza {
    // pizza名称
    protected String pizzaName;
    // pizza用的面团
    protected String dough = "default dough"; // 如果没有特殊要求，就用默认的面团
    // pizza用的酱汁
    protected String sauce = "default sauce"; // 如果没有特殊要求，就用默认的酱汁
    // pizza上用的配料、佐料 一种pizza可能包含很多种佐料
    protected ArrayList topping = new ArrayList();

    public void prepare(){
        System.out.println("preparing pizza ..." + pizzaName);
        System.out.println("Tossing dough ..." + this.dough);  // 揉面
        System.out.println("Adding Sauce..." + this.sauce);  // 放酱汁
        System.out.println("Adding topping ..."); // 按次序放佐料
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
