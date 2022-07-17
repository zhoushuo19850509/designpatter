package com.nbcb.design.proxy.gumballmachine;

/**
 * 测试GumballMachine/GumballMonitor的功能
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMonitor gumballMonitor =
                new GumballMonitor(new GumballMachine("beilun",10));
        gumballMonitor.report();
    }
}
