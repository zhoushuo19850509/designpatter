package com.nbcb.design.singleton;

public class Singleton {
    private static Singleton mySingleton;

    private String name;

    public String getName(){
        return name;
    }

    public Singleton(String name){
        this.name = name;
    }


    public static Singleton getInstance(){
        if(mySingleton == null){
            mySingleton = new Singleton("defaultName");
        }
        return mySingleton;
    }


    public static void main(String[] args){
        Singleton single = Singleton.getInstance();
        System.out.println(single.getName());

    }

}
