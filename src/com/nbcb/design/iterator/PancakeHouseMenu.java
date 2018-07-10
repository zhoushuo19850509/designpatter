package com.nbcb.design.iterator;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于甜品的菜单
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
     * 老的获取MenuItems的方式
     * @return
     */
//    public ArrayList getMenuItems(){
//        return menuItems;
//    }


    /**
     * 新的通过Iterator方式获取MenuItems
     */
    public MyIterator createMenus(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
