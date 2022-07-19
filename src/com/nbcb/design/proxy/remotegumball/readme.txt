这个package把RMI和gumballmachine的例子结合起来
实现了跨JVM调用


为了实现跨JVM访问GumballMachine信息的目标，我们要做哪些事情呢？
我们记录一下步骤：
1.定义RMI Remote接口类
GumballMachineRemote

2.我们原来的GumballMachine类要改造一下，实现
新定义的Remote接口：GumballMachineRemote

GumballMachine
        extends UnicastRemoteObject
        implements GumballMachineRemote {
           ...
        }

3.创建RMI Server
参考：GumballMachineServer.java
这个Server的功能就是把我们新创建的RMI Remote接口类发布出去

4.创建RMI Client
参考：
GumballMachineClient.java
GumballMonitor.java

整理总结一下
我们看到，要实现某个对象的远程访问，
必须通过一个定义好的RMI Remote接口
无论是RMI服务端还是RMI客户端，都通过这个RMI Remote接口进行交互

