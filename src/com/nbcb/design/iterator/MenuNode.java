package com.nbcb.design.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * ���MenuNode���MenuItem���
 * MenuNode�ǲ˵��������˺ܶ�MenuItem
 * MemuItem��ĳ������Ĳˣ�����hotdog
 *
 * ���MenuNode��֮ǰDinerMenu�Ⱦ����Menu��һ��
 * MenuNode
 */
public class MenuNode extends MenuComponent{

    /**
     * ��ǰMenuNode���ӽڵ㣬��Ȼ
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
     * ����������ʽ��������MenuComponent������ķ���
     * ���ڽ�MenuNode����tree hierachy
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
     * ��ӡ��ǰmenuNode����Ϣ���Լ���menuNode���ӽڵ���Ϣ
     */
    public void print(){

        /**
         * ���ȴ�ӡ��ǰmenuNode����Ϣ
         */
        System.out.print(" \n" + getName());
        System.out.println(", "  + getDescription());
        System.out.println("------------------------");

        /**
         * Ȼ���ӡ��ǰmenuNode���ӽڵ����Ϣ
         */
        Iterator iter = menucomponents.iterator();
        while(iter.hasNext()){
            MenuComponent menu = (MenuComponent) iter.next();
            menu.print();

        }

    }

    /**
     * ���������Ҫͨ��Iterator�ķ�ʽ��������ǰMenuNode�µ�MenuItem
     * ���������Ҫ��ͨ��new һ��CompositeIteratorʵ��������һ��Iterator
     * �����ܸ������Iterator���������MenuNode������tree hierachy���еĽڵ�
     *
     * ��������֮ǰһ��������ֻ�ܱ���MenuNode�µ�MenuItem
     * ����ֻ��Ƕ�׵���print()����
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
