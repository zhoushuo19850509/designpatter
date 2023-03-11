package com.nbcb.design.singleton.car;

public class Car {
    /**
     * 唯一的Car实例
     * 这里的volatile的意思是，当car对象在初始化的时候，
     * 如果有并发线程在访问，能够保证car对象实例的唯一性
     * 如果不加这个关键字，在多并发场景下可能会创建多个car实例
     */
    private volatile static Car car;

    private static int counter = 0;

    private final int id = counter++; // 汽车编号
    private String name; //
    private String brand; // 汽车品牌
    private int price; // 车价

    /**
     * constructor of Car
     * 这里private意味着只有Car类本身
     * 才能够通过new Car()的方式创建Car对象
     */
    private Car() {
        this.name = "default car";
        this.brand = "Tesla";
        this.price = 300000;
    }

    public static Car getCarInstance(){

        if(null == car){
            synchronized (Car.class){
                car = new Car();
            }
        }
        return car;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
