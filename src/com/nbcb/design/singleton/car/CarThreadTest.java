package com.nbcb.design.singleton.car;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 验证单例模式的并发性能
 */
public class CarThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        Car car = Car.getCarInstance();
                        System.out.println(car);
                    }
                }
            });
        }

    }
}
