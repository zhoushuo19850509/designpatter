package com.nbcb.design.iterator;

import java.util.Iterator;

public abstract class MenuComponent {

    /**
     * �������������� add()/remove()/getChild()
     * ����Ϊ��ʵ��ͳһ��tree hierachy����Ҫ����componentʵ�ֵķ���
     * ���ڽڵ����/ɾ��/��ȡ
     * ��ˣ�������MenuItem����Menu�ڵ㣬����Ҫʵ��
     */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * ����4��getter()��������MenuItem�ڵ�ר�е�
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }


    public String getDescription() {
        throw new UnsupportedOperationException();
    }

     public boolean isVegetarian() {
         throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * ���print()����Ҳ��MenuComponent�����ģ���ҪĿ���Ǵ�ӡÿ���ڵ����Ϣ
     * MenuItem��MenuNode��Ҫʵ���������
     */
    public void print(){
        throw new UnsupportedOperationException();
    }


    /**
     * ���createIterator��MenuComponent�����ģ�
     * ��ҪĿ����ͨ��Iterator�ķ�ʽ��������ǰMenuNode�µ�MenuItem
     *
     * MenuNode���Կ���ʵ��һ�����������
     * MenuItem������ʵ����������ˣ���ΪMenuItem�Ѿ���Ҷ�ӽڵ��ˣ�û���ӽڵ���Ա�����
     * @return
     */
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }


}
