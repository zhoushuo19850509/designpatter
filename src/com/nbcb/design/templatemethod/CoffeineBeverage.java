package com.nbcb.design.templatemethod;


/**
 * ��ΪCoffee.java��Tea.java �ĸ���
 * ��ȡ�����������ͨ�÷���: boilWater() and pourInCup()
 * ����������������ɫ���࣬�����������У�������ֻ�г��󷽷��� brew() and addCondiments()
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
