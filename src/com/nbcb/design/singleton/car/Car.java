package com.nbcb.design.singleton.car;

public class Car {
    /**
     * Ψһ��Carʵ��
     * �����volatile����˼�ǣ���car�����ڳ�ʼ����ʱ��
     * ����в����߳��ڷ��ʣ��ܹ���֤car����ʵ����Ψһ��
     * �����������ؼ��֣��ڶಢ�������¿��ܻᴴ�����carʵ��
     */
    private volatile static Car car;

    private static int counter = 0;

    private final int id = counter++; // �������
    private String name; //
    private String brand; // ����Ʒ��
    private int price; // ����

    /**
     * constructor of Car
     * ����private��ζ��ֻ��Car�౾��
     * ���ܹ�ͨ��new Car()�ķ�ʽ����Car����
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
