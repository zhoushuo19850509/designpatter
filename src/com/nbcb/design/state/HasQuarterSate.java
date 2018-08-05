package com.nbcb.design.state;

import java.util.HashMap;
import java.util.Random;

public class HasQuarterSate implements State {

    /**
     * ������������������winner״̬��
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
         * ��1/10�ĸ��ʽ���winner״̬
         */
        int winner = randomWinner.nextInt(10);

        /**
         * ԭ����ֱ�ӽ���Sold״̬��
         * ������һ���ļ��ʽ���winner״̬
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
