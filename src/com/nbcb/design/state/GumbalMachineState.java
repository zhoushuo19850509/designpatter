package com.nbcb.design.state;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * ��֮ǰ��GumballMachine.java��������
 * GumbalMachineState.java����״̬(state)Ϊ����
 *
 * ��֮ǰ��GumbalMachine.java��ͬ���ǣ�
 * �������ÿ��Ҫ��������ʱ�򣬲���Ҫ�жϵ�ǰ״̬�ˡ�
 * Ϊʲô�أ���Ϊ������һ��������state
 * �����������ľ��ǵ�ǰ��״̬��
 *
 * �����ʵ�ֵ�˼·�ǣ��ڵ�ǰ״̬�£����Ҫ��ĳ���������ᷢ��ʲô��
 * ���ڲ�ͬ״̬��,��ĳ����������Ҫ��ʲô�ǣ��߼������ڸ���״̬��ʵ�����С�
 */
public class GumbalMachineState {

    // private elements: states
    private State hasQuarterSate;
    private State noQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;


    private State state; // current state
    private int count;   // the number of current gumball

    /**
     * constructor
     * @param count
     */
    public GumbalMachineState(int count){
        /**
         * initialize the states
         */
        hasQuarterSate = new HasQuarterSate(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        /**
         * the initial number of gumballs
         */
        this.count = count;

        /**
         * the initial state of the gumball machine
         */
        if(count > 0 ){
            this.state = noQuarterState;
        }


    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void rejectQuarter(){
        state.rejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out of the slot!");
        if(count != 0){
            count = count - 1;
        }

    }



    /**
     * getters and setters of the states
     * @return
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getHasQuarterSate() {
        return hasQuarterSate;
    }

    public void setHasQuarterSate(State hasQuarterSate) {
        this.hasQuarterSate = hasQuarterSate;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }




}
