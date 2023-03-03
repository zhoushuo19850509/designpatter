package com.nbcb.design.observer;

/**
 * 观察者具体实现类：
 * CurrenctConditionDisplay(实时气象展示者)
 * 备注： CurrenctConditionDisplay只关心气温和湿度
 */
public class CurrenctConditionDisplay
        implements Observer,DisplayElement{

    private Subject weatherData;
    private float temp;
    private float humidity;

    /**
     * constructor
     * 指定当前观察者要观察的对象：
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
