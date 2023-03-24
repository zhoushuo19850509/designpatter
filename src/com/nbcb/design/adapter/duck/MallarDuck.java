package com.nbcb.design.adapter.duck;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallarDuck quacking ...");
    }

    @Override
    public void fly() {
        System.out.println("MallarDuck flying ...");

    }
}
