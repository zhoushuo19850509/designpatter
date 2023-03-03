package com.nbcb.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者  天气数据
 */
public class WeatherData implements Subject {

    // 观察者列表
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    // 注册观察者
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    // 移出观察者
    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if(index > 0){
            this.observers.remove(index);
        }

    }

    // 更新各个观察者的数据
    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    /**
     * 一旦WeatherData数据发生变动，就调用接口方法notifyObservers()
     * 通知各个观察者及时更新数据
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMesurements(float temp,
                               float humidity,
                               float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
