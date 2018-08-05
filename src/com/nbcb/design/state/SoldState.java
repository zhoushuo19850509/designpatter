package com.nbcb.design.state;

public class SoldState implements State {

    private GumbalMachineState gumbalMachineState;

    public SoldState(GumbalMachineState gumbalMachineState){
        this.gumbalMachineState = gumbalMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait ,we are already giving you a gumball!");

    }

    @Override
    public void rejectQuarter() {
        System.out.println("Sorry ,you already turned the crank");

    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice would not give you another ball!");

    }

    @Override
    public void dispense() {
        gumbalMachineState.releaseBall();

        if(gumbalMachineState.getCount() == 0){
            System.out.println("Out of gumballs!!");
            gumbalMachineState.setState(gumbalMachineState.getSoldOutState());
        }else{
            gumbalMachineState.setState(gumbalMachineState.getNoQuarterState());
        }

    }
}
