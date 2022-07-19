package com.nbcb.design.proxy.remotegumball;

import com.nbcb.design.proxy.rmi.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    String getLocation() throws RemoteException;
    int getCount()  throws RemoteException;
    String getStatus() throws RemoteException;
}
