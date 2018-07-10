package com.nbcb.design.templatemethod;

public class Tea extends CoffeineBeverage{


    public void brew(){
        System.out.println("Steeping the tea");
    }


    public void addCondiments(){
        System.out.println("Add Lemon!");
    }

}
