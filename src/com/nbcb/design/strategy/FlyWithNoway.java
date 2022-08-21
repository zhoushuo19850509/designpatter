package com.nbcb.design.strategy;

public class FlyWithNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly at all ...");
    }
}
