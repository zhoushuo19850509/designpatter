package com.nbcb.design.proxy.rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl
        extends UnicastRemoteObject
        implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    /**
     * 接口方法1
     * @return
     * @throws RemoteException
     */
    @Override
    public String sayHello() throws RemoteException{

        String userId = "123";
        if(userId.length() > 0){
            return "Hello Hello from MyRemote ...";
        }

        throw new RemoteException("say nothing from server...");

    }

    /**
     * 接口方法2
     * @return
     * @throws RemoteException
     */
    @Override
    public Message getMessage() throws RemoteException {

        String userId = "123";
        if(userId.length() > 0){
            return new Message(0,"succ","hahaha...");
        }
        throw new RemoteException("no message from server...");
    }


}
