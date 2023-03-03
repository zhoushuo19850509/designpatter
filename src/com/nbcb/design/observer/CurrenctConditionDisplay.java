package com.nbcb.design.observer;

/**
 * �۲��߾���ʵ���ࣺ
 * CurrenctConditionDisplay(ʵʱ����չʾ��)
 * ��ע�� CurrenctConditionDisplayֻ�������º�ʪ��
 */
public class CurrenctConditionDisplay
        implements Observer,DisplayElement{

    private Subject weatherData;
    private float temp;
    private float humidity;

    /**
     * constructor
     * ָ����ǰ�۲���Ҫ�۲�Ķ���
     * @param weatherData
     */
    public CurrenctConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CurrenctConditionDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
