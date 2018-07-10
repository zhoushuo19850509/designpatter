package com.nbcb.design.iterator;

import java.util.Iterator;

public class MenuTestDriveNew {

    public static void main(String[] args){

        /**
         * 先初始化4个menuNode
         */
        MenuComponent dinerMenu = new MenuNode("diner menu","for lunch");
        MenuComponent pancakeMenu = new MenuNode("pancake menu","for breakfast");
        MenuComponent cafeMenu = new MenuNode("cafe menu","for lunch");
        MenuComponent dessertMenu = new MenuNode("dessert menu","dessert of course");
        MenuComponent pizzaMenu = new MenuNode("pizza menu","decious pizza");

        /**
         * 再初始化根目录 root menuNode
         */
        MenuComponent allMenus = new MenuNode("all menus","root menunode");

        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
        allMenus.add(cafeMenu);

        /**
         * 接下去，要在各个MenuNode下，设置各自的具体MenuItem
         */
        dinerMenu.add(new MenuItem("Soup","hot soup",true,30.9));
        dinerMenu.add(new MenuItem("HotDog","fresh bread",false,40.9));
        dinerMenu.add(new MenuItem("apple juice","fresh apple",true,90.9));

        /**
         * 这个比较关键，我们在menuNode下，还能嵌套添加menuNode，实现我们tree hierachy的架构
         */
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("apple pie1","fresh apple pie1",true,11.0));


        cafeMenu.add(new MenuItem("black coffe","pure black",false,15.0));


//        pancakeMenu.add(pizzaMenu);
//        pizzaMenu.add(new MenuItem("thin pizza","very thin!",false,20.5));
        pancakeMenu.add(new MenuItem("cake","cream cake",false,120.3));








        /**
         * WaitressNew.java调用print()方法打印各个MenuCompnent
         */
//        WaitressNew waitressNew = new WaitressNew(allMenus);
//        waitressNew.print();

        /**
         * 使用最新的composite iterator组合方式，打印各个MenuComponent
         * @param root MenuNode
         */
//        testComositeIterator(allMenus);
        WaitressCompositeIterator waitress = new WaitressCompositeIterator(allMenus);
        waitress.printMenu();


    }

    /**
     * 使用最新的composite iterator组合方式，访问各个MenuComponent
     * 这个方法能够访问任意MenuComponent节点下的tree hierachy
     * @param menuComponent
     */
    public static void testComositeIterator(MenuComponent menuComponent){
        CompositeIterator iterator = (CompositeIterator)menuComponent.createIterator();


        while(iterator.hasNext()){
            MenuComponent mc = (MenuComponent)iterator.next();
            System.out.println("name:" + mc.getName() + " and desc:" + mc.getDescription());
        }

    }


}
