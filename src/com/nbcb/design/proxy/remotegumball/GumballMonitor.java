package com.nbcb.design.proxy.remotegumball;

import java.rmi.RemoteException;

/**
 * 定义一个新的GumballMonitor
 * 这个monitor通过Remote接口(GumballMachineRemote)
 * 访问远程GumballMachine的信息
 */
public class GumballMonitor {
    private GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() throws RemoteException {
        System.out.println("reporting gumball machine from remote ...");
        System.out.println("count: " + gumballMachineRemote.getCount());
        System.out.println("location : " + gumballMachineRemote.getLocation());
        System.out.println("status: " + gumballMachineRemote.getStatus());
    }
}
