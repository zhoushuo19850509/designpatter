package com.nbcb.design.state;

import java.util.HashMap;
import java.util.Random;

public class HasQuarterSate implements State {

    /**
     * 随机数，用来随机产生winner状态的
     */
    Random randomWinner = new Random(System.currentTimeMillis());

    private GumbalMachineState gumbalMachineState;

    public HasQuarterSate(GumbalMachineState gumbalMachineState){
        this.gumbalMachineState = gumbalMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");

    }

    @Override
    public void rejectQuarter() {
        System.out.println("Quarter returned");
        gumbalMachineState.setState(gumbalMachineState.getNoQuarterState());

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned!");

        /**
         * 有1/10的概率进入winner状态
         */
        int winner = randomWinner.nextInt(10);

        /**
         * 原来是直接进入Sold状态，
         * 现在有一定的几率进入winner状态
         */
        if( (winner == 0) && (gumbalMachineState.getCount() > 1) ){
            gumbalMachineState.setState(gumbalMachineState.getWinnerState());
        }else{
            gumbalMachineState.setState(gumbalMachineState.getSoldState());
        }


    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
