package com.nbcb.design.singleton;

public class ChocolateBoiler {


    /**
     * Singleton v1.0 ���ڶ��̵߳�����
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
     * Singleton v1.1 �����v1.0���̵߳�����
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
     * Singleton v1.2 �����v1.1���ܵ͵ķ���1
     */
//    private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
//
//    public static synchronized ChocolateBoiler getInstance(){
//        return chocolateBoiler;
//    }

    /**
     * Singleton v1.3 �����v1.1���ܵ͵ķ���2
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
