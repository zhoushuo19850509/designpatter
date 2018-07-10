package com.nbcb.design.templatemethod;


/**
 * 作为Coffee.java和Tea.java 的父类
 * 提取了这两个类的通用方法: boilWater() and pourInCup()
 * 至于这两个类中特色的类，定义在子类中，父类中只有抽象方法： brew() and addCondiments()
 */
public abstract class CoffeineBeverage{

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();


    public void boilWater(){
        System.out.println("Boiling Water!!");
    }


    public void pourInCup(){
        System.out.println("Pouring into cup!!");
    }



}
