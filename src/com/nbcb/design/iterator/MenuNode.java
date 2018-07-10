package com.nbcb.design.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * 这个MenuNode类和MenuItem相对
 * MenuNode是菜单，包括了很多MenuItem
 * MemuItem是某个具体的菜，比如hotdog
 *
 * 这个MenuNode和之前DinerMenu等具体的Menu不一样
 * MenuNode
 */
public class MenuNode extends MenuComponent{

    /**
     * 当前MenuNode的子节点，当然
     */
    ArrayList menucomponents = new ArrayList();

    private String name;
    private String description;

    /**
     * constructor
     * @param name
     * @param description
     */
    public MenuNode(String name, String description){
        this.name = name;
        this.description = description;

    }
    /**
     * 以下三个方式是重载了MenuComponent抽象类的方法
     * 用于将MenuNode纳入tree hierachy
     */
    public void add(MenuComponent menuComponent){
        menucomponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menucomponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menucomponents.get(i);
    }


    /**
     * 打印当前menuNode的信息，以及该menuNode的子节点信息
     */
    public void print(){

        /**
         * 首先打印当前menuNode的信息
         */
        System.out.print(" \n" + getName());
        System.out.println(", "  + getDescription());
        System.out.println("------------------------");

        /**
         * 然后打印当前menuNode下子节点的信息
         */
        Iterator iter = menucomponents.iterator();
        while(iter.hasNext()){
            MenuComponent menu = (MenuComponent) iter.next();
            menu.print();

        }

    }

    /**
     * 这个方法主要通过Iterator的方式，遍历当前MenuNode下的MenuItem
     * 这个方法主要是通过new 一个CompositeIterator实例，返回一个Iterator
     * 我们能根据这个Iterator，遍历这个MenuNode下整个tree hierachy所有的节点
     *
     * 而不是像之前一样，仅仅只能遍历MenuNode下的MenuItem
     * 或者只是嵌套调用print()方法
     * @return
     */
    public Iterator createIterator(){
        return new CompositeIterator(menucomponents.iterator());
    }


    /**
     * getter and setters
     * @return
     */
    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }
}
