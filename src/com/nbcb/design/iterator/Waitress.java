package com.nbcb.design.iterator;


/**
 * 接收菜单，并且展示菜单
 */
public class Waitress {


    Menu pancakeHouseMenu;
    Menu dinerMenu;

    /**
     * constructor
     * 创建Waitress对象时，需要传入具体的菜单实例
     * @param pancakeHouseMenu
     * @param dinerMenu
     */
    public Waitress(Menu pancakeHouseMenu ,Menu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }


    /**
     * 分别打印各个菜单实例
     */
    public void printMenu(){
        MyIterator pancakeHouseIterator = pancakeHouseMenu.createMenus();
        MyIterator dinerIterator =dinerMenu.createMenus();
        System.out.println("start print pancake menu:");
        printMenu(pancakeHouseIterator);
        System.out.println("start print diner menu:");
        printMenu(dinerIterator);

    }

    /**
     * 统一的打印入口
     * @param iterator
     */
    public void printMenu(MyIterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + "," + item.getPrice() + "--" + item.getDescription());
        }

    }

}
