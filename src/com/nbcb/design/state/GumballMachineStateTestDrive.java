package com.nbcb.design.state;

/**
 * ≤‚ ‘¿‡
 */
public class GumballMachineStateTestDrive {
    public static void main(String[] args){

        GumbalMachineState machine = new GumbalMachineState(50);

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Starting : >>>>>>>>>" + i);
            machine.insertQuarter();
            machine.turnCrank();
            System.out.println("current ball: " + machine.getCount());
        }

        System.out.println("balls left: " + machine.getCount());

    }
}
