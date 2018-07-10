package com.nbcb.design.iterator;


import java.util.Iterator;

/**
 * 这个waitress和之前的waitress都不一样
 * 这个waitress能够通过Iterator的方式遍历tree hierachy中的MenuComonent
 *
 * tree hierachy中的MenuComonent节点可以是MenuNode，也可以是MenuItem
 *
 * 实现方式请参考CompositeIterator
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
         * 我们遍历tree hierachy中的MenuComonent
         * 无论是MenuNode还是MenuItem，都是有getName()和getDescription()方法的
         */
        while(iterator.hasNext()){
            MenuComponent mc = (MenuComponent)iterator.next();
            System.out.println("name:" + mc.getName() + " and desc:" + mc.getDescription());
        }

    }
}
