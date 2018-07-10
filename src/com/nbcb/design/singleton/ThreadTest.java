package com.nbcb.design.singleton;

/**
 * 这个类主要是用来验证ChocolateBoilder 的单例模式在多线程下会有问题
 */
public class ThreadTest {
    public static void main(String[] args){

        // 启动若干个线程，每个线程都会通过getInstance()方法，获取ChocolateBoiler对象实例
        for(int i = 0 ; i < 5 ; i++){
            StartChoclateBoiler startChoclate = new StartChoclateBoiler();
            startChoclate.start();;
        }

    }
}
