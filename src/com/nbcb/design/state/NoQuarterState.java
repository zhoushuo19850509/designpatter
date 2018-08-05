package com.nbcb.design.state;

public class NoQuarterState implements State{
    private GumbalMachineState gumbalMachineState;

    public NoQuarterState(GumbalMachineState gumbalMachineState){
        this.gumbalMachineState = gumbalMachineState;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You insert aquarter");

        /**
         * update the current state of gumball machine
         */
        gumbalMachineState.setState(gumbalMachineState.getHasQuarterSate());

    }

    @Override
    public void rejectQuarter() {
        System.out.println("You have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first!");
    }
}
