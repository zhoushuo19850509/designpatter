package com.nbcb.design.decorating;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        // 啥调料都不加，就点一杯Expresso
        Beverage beverage1 = new Expresso();
        System.out.println(beverage1);

        // 啥调料都不加，就点一杯DarkRoast
        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Milk(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);

        System.out.println(beverage3);

    }
}
