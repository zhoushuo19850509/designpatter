package com.nbcb.design.iterator;


/**
 * 和老的Waitress相比，新的Waitress能够展示tree hierachy的菜单信息，更加灵活
 * 因为老的Waitress只能接收具体的Menu实例并且展示
 *
 * 具体什么意思，需要图示
 * 请参考《design patter.odt》
 *
 */
public class WaitressNew {

    private MenuComponent menuComponent;

    /**
     * constructor
     */
    public WaitressNew(MenuComponent allmenus){
        this.menuComponent = allmenus;
    }

    public void print(){
        menuComponent.print();
    }

}