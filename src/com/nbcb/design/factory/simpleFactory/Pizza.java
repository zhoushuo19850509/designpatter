package com.nbcb.design.factory.simpleFactory;

public class Pizza {
    private String pizzaName;

    public void prepare(){
        System.out.println("preparing pizza ..." + pizzaName);
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
