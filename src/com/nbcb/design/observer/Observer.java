package com.nbcb.design.observer;

/**
 * 观察者 抽象接口
 */
public interface Observer {

    /**
     * 抽象方法1 更新
     * 更新参数包括温度、湿度、压强
     */
    public void update(float temp,
                       float humidity,
                       float pressure);
}
