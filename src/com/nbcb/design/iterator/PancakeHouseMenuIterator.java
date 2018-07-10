package com.nbcb.design.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MyIterator{


    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items){
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
