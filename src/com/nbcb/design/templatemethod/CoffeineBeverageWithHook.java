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
     * 子类可以重新实现，也可以不实现，直接用父类的就行。
     * @return
     */
    public boolean customerWantsCondiments(){
        return true;
    }
}
