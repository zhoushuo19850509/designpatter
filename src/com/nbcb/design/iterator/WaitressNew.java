package com.nbcb.design.iterator;


/**
 * ���ϵ�Waitress��ȣ��µ�Waitress�ܹ�չʾtree hierachy�Ĳ˵���Ϣ���������
 * ��Ϊ�ϵ�Waitressֻ�ܽ��վ����Menuʵ������չʾ
 *
 * ����ʲô��˼����Ҫͼʾ
 * ��ο���design patter.odt��
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