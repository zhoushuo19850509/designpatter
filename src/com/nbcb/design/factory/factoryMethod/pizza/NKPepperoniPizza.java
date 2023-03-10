package com.nbcb.design.factory.factoryMethod.pizza;

public class NKPepperoniPizza extends Pizza {
    public NKPepperoniPizza() {
        setPizzaName("NKPepperoniPizza");
        dough = "Thin Crust Dough";  // NY 特别受欢迎的那种薄层pizza
        sauce = "Marinara Souce"; // NY特有的酱汁
        topping.add("NY special Cheese"); // NY特有的佐料
    }
}
