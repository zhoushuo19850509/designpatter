package com.nbcb.design.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrenctConditionDisplay currenctConditionDisplay
                = new CurrenctConditionDisplay(weatherData);

        weatherData.setMesurements(30,85,30.5f);
        weatherData.setMesurements(40,95,31.5f);
        weatherData.setMesurements(50,97,32.5f);
    }
}
