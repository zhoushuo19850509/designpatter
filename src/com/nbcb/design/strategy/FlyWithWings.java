package com.nbcb.design.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flying ...");
    }
}
