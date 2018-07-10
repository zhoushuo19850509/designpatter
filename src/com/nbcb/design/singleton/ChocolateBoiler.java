package com.nbcb.design.singleton;

public class ChocolateBoiler {


    /**
     * Singleton v1.0 存在多线程的问题
     */
    // static unique instance
//    private static ChocolateBoiler chocolateBoiler;
//
//    // static getInstance()
//    public static synchronized ChocolateBoiler getInstance(){
//        if(chocolateBoiler == null){
//            System.out.println("Initializing ChocolateBoiler!");
//            chocolateBoiler = new ChocolateBoiler();
//        }
//        return chocolateBoiler;
//    }

    /**
     * Singleton v1.1 解决了v1.0多线程的问题
     */
    // static unique instance
//    private static ChocolateBoiler chocolateBoiler;
//
//    // static getInstance()
//    public static synchronized ChocolateBoiler getInstance(){
//        if(chocolateBoiler == null){
//            System.out.println("Initializing ChocolateBoiler!");
//            chocolateBoiler = new ChocolateBoiler();
//        }
//        return chocolateBoiler;
//    }

    /**
     * Singleton v1.2 解决了v1.1性能低的方案1
     */
//    private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
//
//    public static synchronized ChocolateBoiler getInstance(){
//        return chocolateBoiler;
//    }

    /**
     * Singleton v1.3 解决了v1.1性能低的方案2
      */
    private volatile static ChocolateBoiler chocolateBoiler;

    // static getInstance()
    public static  ChocolateBoiler getInstance(){
        if(chocolateBoiler == null){

            synchronized (ChocolateBoiler.class){
                if(chocolateBoiler == null){
                    System.out.println("Initializing ChocolateBoiler!");
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    private boolean boiled;
    private boolean empty;

    public boolean isBoiled(){
        return boiled;
    }

    public boolean isEmpty(){
        return empty;
    }

    public ChocolateBoiler(){
        System.out.println("constructor of ChocolateBoiler");
        boiled = false;
        empty = false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }

    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public static void main(String[] args){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }


}
