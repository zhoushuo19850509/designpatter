package com.nbcb.design.strategy;

public class MallarDuck extends Duck {

    public MallarDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    void quack() {
        getQuackBehavior().quack();
    }

    @Override
    void fly() {
        getFlyBehavior().fly();
    }

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.fly();
        mallarDuck.quack();
    }

}
