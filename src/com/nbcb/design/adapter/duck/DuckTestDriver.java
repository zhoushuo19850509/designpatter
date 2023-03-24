package com.nbcb.design.adapter.duck;

public class DuckTestDriver {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new DuckAdapter(turkey);

        System.out.println("turkey start ...");
        turkey.gobble();
        turkey.gobble();

        System.out.println("duck start ...");
        duck.fly();
        duck.quack();
    }
}
