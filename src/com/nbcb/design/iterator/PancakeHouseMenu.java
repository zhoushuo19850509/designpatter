package com.nbcb.design.iterator;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ������Ʒ�Ĳ˵�
 * organize menus items in List
 */
public class PancakeHouseMenu implements Menu{

    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("Cake","sweet cake",false,10.0);
        addItem("Coffe","black coffe",false,15.0);
        addItem("Coconut juice","fresh juice",true,25.5);
        addItem("Waffles","fresh baked",true,36.0);

    }

    public void addItem(String name, String desc, boolean vegetarian ,double price){
        MenuItem item = new MenuItem(name,desc,vegetarian,price);
        menuItems.add(item);
    }

    /**
     * �ϵĻ�ȡMenuItems�ķ�ʽ
     * @return
     */
//    public ArrayList getMenuItems(){
//        return menuItems;
//    }


    /**
     * �µ�ͨ��Iterator��ʽ��ȡMenuItems
     */
    public MyIterator createMenus(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
