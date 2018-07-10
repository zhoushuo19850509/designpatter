package com.nbcb.design.iterator;

import java.awt.Menu;
import java.util.Iterator;

/**
 * 菜单中某个具体的菜的信息
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    /**
     * 重载了MenuComponent的print()方法
     */
    public void print(){
        System.out.println("  " + getName());
        if(isVegetarian()){
            System.out.print("(v)");

        }
        System.out.println(" ," + getPrice());
        System.out.println(" -- " + getDescription());

    }

    public Iterator createIterator(){
        return new NullIterator();
    }

    /**
     * getters and setters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
