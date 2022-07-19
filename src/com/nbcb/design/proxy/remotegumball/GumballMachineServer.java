package com.nbcb.design.proxy.remotegumball;

import com.nbcb.design.proxy.rmi.MyRemote;
import com.nbcb.design.proxy.rmi.MyRemoteImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 定义个RMI server
 * 客户端能够访问这个server，获取GumballMachine信息
 */
public class GumballMachineServer {

    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachineRemote =
                    new GumballMachine("ningbo",12);

            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/getGumballInfo",gumballMachineRemote);
            System.out.println("start rmi server , port is : 1900");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
