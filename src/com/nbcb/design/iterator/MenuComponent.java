package com.nbcb.design.iterator;

import java.util.Iterator;

public abstract class MenuComponent {

    /**
     * 以下三个方法： add()/remove()/getChild()
     * 都是为了实现统一的tree hierachy，需要各个component实现的方法
     * 用于节点添加/删除/获取
     * 因此，无论是MenuItem还是Menu节点，都需要实现
     */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * 以下4个getter()方法，是MenuItem节点专有的
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }


    public String getDescription() {
        throw new UnsupportedOperationException();
    }

     public boolean isVegetarian() {
         throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * 这个print()方法也是MenuComponent新增的，主要目的是打印每个节点的信息
     * MenuItem和MenuNode都要实现这个方法
     */
    public void print(){
        throw new UnsupportedOperationException();
    }


    /**
     * 这个createIterator是MenuComponent新增的，
     * 主要目的是通过Iterator的方式，遍历当前MenuNode下的MenuItem
     *
     * MenuNode可以考虑实现一下这个方法，
     * MenuItem就无需实现这个方法了，因为MenuItem已经是叶子节点了，没有子节点可以遍历了
     * @return
     */
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }


}
