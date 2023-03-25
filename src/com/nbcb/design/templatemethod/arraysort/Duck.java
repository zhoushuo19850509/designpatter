package com.nbcb.design.templatemethod.arraysort;

import com.nbcb.design.command.remotecontrol.Command;

public class Duck implements Comparable {


    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getWeight() > ((Duck)o).getWeight()){
            return 1;
        }else if(this.getWeight() < ((Duck)o).getWeight()){
            return -1;
        }else{
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }
}
