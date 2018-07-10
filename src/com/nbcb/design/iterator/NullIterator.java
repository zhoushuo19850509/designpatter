package com.nbcb.design.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
