package com.nbcb.design.iterator;


import java.awt.*;


/**
 * ������͵Ĳ˵�
 * organize menus items in Array
 */
public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    /**
     * constructor
     *
     */
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Soup","hot soup",true,89.0);
        addItem("HotDog","fresh bread",true,69.5);
        addItem("apple juice","fresh apple",true,55.0);

    }

    /**
     * new һ���µ�MenuItem,������ӵ�array��ȥ
     * @param name
     * @param desc
     * @param vegetarian
     * @param price
     */
    public void addItem(String name, String desc, boolean vegetarian ,double price){
        MenuItem item = new MenuItem(name,desc,vegetarian,price);

        if(numberOfItems >= MAX_ITEMS){
            System.out.println("NO MORE ITEMS!");
        }else{
            menuItems[numberOfItems++] = item;
        }


    }

    /**
     * �ϵĻ�ȡMenuItems�ķ�ʽ
     * @return
     */
//    public MenuItem[] getMenuItems(){
//        return menuItems;
//    }

    /**
     * �µ�ͨ��Iterator��ʽ����MenuItems
     */
    public MyIterator createMenus(){
        return new DinerMenuIterator(menuItems);
    }

}
