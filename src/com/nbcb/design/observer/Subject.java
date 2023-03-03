package com.nbcb.design.observer;

/**
 * 被观察者 抽象接口
 */
public interface Subject {
    /**
     * 接口方法1 注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObservers();
}
