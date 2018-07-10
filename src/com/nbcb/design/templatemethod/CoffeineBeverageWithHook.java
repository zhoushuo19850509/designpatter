package com.nbcb.design.templatemethod;



public abstract class CoffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    abstract void brew();
    abstract void addCondiments();


    public void boilWater(){
        System.out.println("Boiling Water!!");
    }


    public void pourInCup(){
        System.out.println("Pouring into cup!!");
    }

    /**
     * hook function define in the super class
     * �����������ʵ�֣�Ҳ���Բ�ʵ�֣�ֱ���ø���ľ��С�
     * @return
     */
    public boolean customerWantsCondiments(){
        return true;
    }
}
