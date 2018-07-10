package com.nbcb.design.iterator;

public class DinerMenuIterator implements MyIterator{

    MenuItem[] items;
    int positions = 0 ;

    public DinerMenuIterator(MenuItem[] items1){
        this.items = items1;
    }

    /**
     * ������������ʵ����Iterator�ӿ�
     * @return
     */
    @Override
    public boolean hasNext() {
        if(positions >= items.length || items[positions] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        return items[positions++];
    }
}
