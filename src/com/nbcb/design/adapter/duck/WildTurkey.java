package com.nbcb.design.adapter.duck;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobbling ...");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey flying ... ");
    }
}
