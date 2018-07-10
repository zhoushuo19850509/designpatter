package com.nbcb.design.templatemethod;

public class Test {
    public static void main(String[] args){
//        Tea tea = new Tea();
//        tea.prepareRecipe();
//
//        System.out.println("aaaaaaaa");
//
//        Coffee coffee = new Coffee();
//        coffee.prepareRecipe();

//        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
//        coffeeWithHook.prepareRecipe();

        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();


    }
}
