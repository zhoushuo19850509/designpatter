package com.nbcb.design.state;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * 和之前的GumballMachine.java的区别是
 * GumbalMachineState.java是以状态(state)为核心
 *
 * 和之前的GumbalMachine.java不同的是，
 * 这次我们每次要做动作的时候，不需要判断当前状态了。
 * 为什么呢？因为我们有一个变量：state
 * 这个变量保存的就是当前的状态。
 *
 * 这个类实现的思路是：在当前状态下，如果要做某个动作，会发生什么。
 * 至于不同状态下,做某个动作，需要做什么是，逻辑都放在各个状态的实现类中。
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
