package com.nbcb.design.iterator;

import java.util.Iterator;

public class MenuTestDriveNew {

    public static void main(String[] args){

        /**
         * �ȳ�ʼ��4��menuNode
         */
        MenuComponent dinerMenu = new MenuNode("diner menu","for lunch");
        MenuComponent pancakeMenu = new MenuNode("pancake menu","for breakfast");
        MenuComponent cafeMenu = new MenuNode("cafe menu","for lunch");
        MenuComponent dessertMenu = new MenuNode("dessert menu","dessert of course");
        MenuComponent pizzaMenu = new MenuNode("pizza menu","decious pizza");

        /**
         * �ٳ�ʼ����Ŀ¼ root menuNode
         */
        MenuComponent allMenus = new MenuNode("all menus","root menunode");

        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
        allMenus.add(cafeMenu);

        /**
         * ����ȥ��Ҫ�ڸ���MenuNode�£����ø��Եľ���MenuItem
         */
        dinerMenu.add(new MenuItem("Soup","hot soup",true,30.9));
        dinerMenu.add(new MenuItem("HotDog","fresh bread",false,40.9));
        dinerMenu.add(new MenuItem("apple juice","fresh apple",true,90.9));

        /**
         * ����ȽϹؼ���������menuNode�£�����Ƕ�����menuNode��ʵ������tree hierachy�ļܹ�
         */
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("apple pie1","fresh apple pie1",true,11.0));


        cafeMenu.add(new MenuItem("black coffe","pure black",false,15.0));


//        pancakeMenu.add(pizzaMenu);
//        pizzaMenu.add(new MenuItem("thin pizza","very thin!",false,20.5));
        pancakeMenu.add(new MenuItem("cake","cream cake",false,120.3));








        /**
         * WaitressNew.java����print()������ӡ����MenuCompnent
         */
//        WaitressNew waitressNew = new WaitressNew(allMenus);
//        waitressNew.print();

        /**
         * ʹ�����µ�composite iterator��Ϸ�ʽ����ӡ����MenuComponent
         * @param root MenuNode
         */
//        testComositeIterator(allMenus);
        WaitressCompositeIterator waitress = new WaitressCompositeIterator(allMenus);
        waitress.printMenu();


    }

    /**
     * ʹ�����µ�composite iterator��Ϸ�ʽ�����ʸ���MenuComponent
     * ��������ܹ���������MenuComponent�ڵ��µ�tree hierachy
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
