package com.nbcb.design.singleton;

public class StartChoclateBoiler extends Thread{

    public void run(){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
