package com.nbcb.design.factory.factoryMethod.pizza;

public class NKPepperoniPizza extends Pizza {
    public NKPepperoniPizza() {
        setPizzaName("NKPepperoniPizza");
        dough = "Thin Crust Dough";  // NY �ر��ܻ�ӭ�����ֱ���pizza
        sauce = "Marinara Souce"; // NY���еĽ�֭
        topping.add("NY special Cheese"); // NY���е�����
    }
}
