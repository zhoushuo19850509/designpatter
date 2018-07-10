package com.nbcb.design.templatemethod;

public class Duck implements Comparable{
    private int weight;
    private String name;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int compareTo(Object o) {

        Duck otherDuck = (Duck)o;
        if(this.weight < otherDuck.weight){
            return -1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else{
            return 1;
        }
    }

    public String toString(){
        return this.name + " weights: " + this.weight;
    }
}
