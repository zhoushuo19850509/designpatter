package com.nbcb.design.iterator.iterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
    private List<MenuItem> menuItems = null;
    private int index;

    /**
     * constructor
     * @param menuItems
     */
    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {

        if(this.index >= this.menuItems.size()
                || null == this.menuItems.get(index)){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        return this.menuItems.get(index++);
    }
}
