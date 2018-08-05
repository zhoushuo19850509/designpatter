package com.nbcb.design.state;

public class SoldOutState implements State {

    private GumbalMachineState gumbalMachineState;

    public SoldOutState(GumbalMachineState gumbalMachineState){
        this.gumbalMachineState = gumbalMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the gumball is sold out");

    }

    @Override
    public void rejectQuarter() {
        System.out.println("You can't reject ,you have not inserted a quarter");

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's no gumballs");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
