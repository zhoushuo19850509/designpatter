package com.nbcb.design.decorating;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        // ɶ���϶����ӣ��͵�һ��Expresso
        Beverage beverage1 = new Expresso();
        System.out.println(beverage1);

        // ɶ���϶����ӣ��͵�һ��DarkRoast
        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Milk(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);

        System.out.println(beverage3);

    }
}
