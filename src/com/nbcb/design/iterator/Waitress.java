package com.nbcb.design.iterator;


/**
 * ���ղ˵�������չʾ�˵�
 */
public class Waitress {


    Menu pancakeHouseMenu;
    Menu dinerMenu;

    /**
     * constructor
     * ����Waitress����ʱ����Ҫ�������Ĳ˵�ʵ��
     * @param pancakeHouseMenu
     * @param dinerMenu
     */
    public Waitress(Menu pancakeHouseMenu ,Menu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }


    /**
     * �ֱ��ӡ�����˵�ʵ��
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
     * ͳһ�Ĵ�ӡ���
     * @param iterator
     */
    public void printMenu(MyIterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + "," + item.getPrice() + "--" + item.getDescription());
        }

    }

}
