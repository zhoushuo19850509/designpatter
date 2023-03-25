package com.nbcb.design.templatemethod.coffeine;

public class CaffeineBeverageDrive {
    public static void main(String[] args) {

        System.out.println(">>>>>>start preparing coffee ...");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();


        System.out.println("\n>>>>>>start preparing tea ...");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
