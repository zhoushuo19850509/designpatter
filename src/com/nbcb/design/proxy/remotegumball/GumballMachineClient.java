package com.nbcb.design.proxy.remotegumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 仿照RMI client，建设一个GumballMachineClient
 * 这个client能够通过Remote接口(GumballMachineRemote)
 * 访问我们的RMI Server(GumballMachineServer)
 *
 */
public class GumballMachineClient {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        try {
            gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://localhost:1900/getGumballInfo");
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachineRemote);

            gumballMonitor.report();

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }




    }
}
