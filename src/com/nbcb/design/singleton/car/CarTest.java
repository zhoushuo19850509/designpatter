package com.nbcb.design.singleton.car;

public class CarTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = Car.getCarInstance();
//            Car car = new Car();
            System.out.println(car);
        }
    }
}
