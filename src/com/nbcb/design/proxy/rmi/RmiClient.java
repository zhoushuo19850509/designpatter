package com.nbcb.design.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {

    public static void main(String[] args) {
        try {
            MyRemote myRemote  = (MyRemote)Naming.lookup("rmi://localhost:1900/remoteSayHello");
            System.out.println(myRemote.sayHello());
            System.out.println(myRemote.getMessage());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
