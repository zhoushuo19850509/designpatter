package com.nbcb.design.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();

            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/remoteSayHello",myRemote);
            System.out.println("start rmi server , port is : 1900");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
