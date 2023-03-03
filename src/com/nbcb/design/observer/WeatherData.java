package com.nbcb.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲���  ��������
 */
public class WeatherData implements Subject {

    // �۲����б�
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    // ע��۲���
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    // �Ƴ��۲���
    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if(index > 0){
            this.observers.remove(index);
        }

    }

    // ���¸����۲��ߵ�����
    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    /**
     * һ��WeatherData���ݷ����䶯���͵��ýӿڷ���notifyObservers()
     * ֪ͨ�����۲��߼�ʱ��������
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
