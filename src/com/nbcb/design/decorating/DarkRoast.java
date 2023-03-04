package com.nbcb.design.decorating;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
