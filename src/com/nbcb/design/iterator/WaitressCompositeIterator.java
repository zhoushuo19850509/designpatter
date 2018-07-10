package com.nbcb.design.iterator;


import java.util.Iterator;

/**
 * ���waitress��֮ǰ��waitress����һ��
 * ���waitress�ܹ�ͨ��Iterator�ķ�ʽ����tree hierachy�е�MenuComonent
 *
 * tree hierachy�е�MenuComonent�ڵ������MenuNode��Ҳ������MenuItem
 *
 * ʵ�ַ�ʽ��ο�CompositeIterator
 *
 */
public class WaitressCompositeIterator {

    /**
     * the root MenuComponent of the tree hierachy
     */
    private MenuComponent allmenus;

    /**
     * constructor
     */
    public WaitressCompositeIterator(MenuComponent allmenus){
        this.allmenus = allmenus;
    }

    public void printMenu(){
        Iterator iterator = allmenus.createIterator();

        /**
         * ���Ǳ���tree hierachy�е�MenuComonent
         * ������MenuNode����MenuItem��������getName()��getDescription()������
         */
        while(iterator.hasNext()){
            MenuComponent mc = (MenuComponent)iterator.next();
            System.out.println("name:" + mc.getName() + " and desc:" + mc.getDescription());
        }

    }
}
