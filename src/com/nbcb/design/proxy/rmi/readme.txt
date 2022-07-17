这个package的代码说明，如何通过RMI进行java代码通讯

RMI功能说明
所谓的RMI，其实就是java提供的一种远程方法调用的方式
能够跨JVM，甚至跨服务器，调用远程的java方法。



我们整理一下java RMI通讯的整体步骤：

服务端：
1.定义一个RMI接口：
interface MyRemote extends Remote { ... }
其中定义的接口方法，供客户端调用

2.定义RMI实现类：
public class MyRemoteImpl
        extends UnicastRemoteObject
        implements MyRemote { ... }

3.定义RMI Server
比如:
LocateRegistry.createRegistry(1900);
Naming.rebind("rmi://localhost:1900/remoteSayHello",myRemote);


客户端：
MyRemote myRemote  = (MyRemote)Naming.lookup("rmi://localhost:1900/remoteSayHello");
myRemote.sayHello()

特别备注：
1.RMI接口中定义的接口方法，必须throws RemoteException
否则启动RmiServer的时候会抛错：

2.如果RMI Server和client之间需要传递对象，这个对象必须实现Serializable接口
用于序列化、反序列化
参考：Message.java

总结一下
