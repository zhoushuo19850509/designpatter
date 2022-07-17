package com.nbcb.design.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 自定义一个Remote interface
 *
 * 备注：
 * 在MyRemote中定义的接口方法，必须throws RemoteException
 * 否则启动RmiServer的时候会抛错：
 * java.rmi.server.ExportException: remote object implements illegal
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
    Message getMessage()  throws RemoteException;
}
