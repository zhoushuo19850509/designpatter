package com.nbcb.design.proxy.gumballmachine;

/**
 * 报告GumballMachine的各种情况
 */
public class GumballMonitor {

    private GumballMachine gumballMachine ;


    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("reporting gumball machine ...");
        System.out.println("count: " + gumballMachine.getCount());
        System.out.println("location : " + gumballMachine.getLocation());
        System.out.println("status: " + gumballMachine.getStatus());
    }

}
