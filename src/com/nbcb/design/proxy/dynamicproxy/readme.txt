这个package介绍如何使用java自带的动态代理功能

0.定义原始类(真正要访问的类)
PersonBean.java
PersonBeanImpl.java

1.创建Invocation Handler

Handler1:OwnInvocationHandler
Handler2:NonOwnInvocationHandler

2.创建Dynamic Proxy class

3.通过动态代理访问原始类

