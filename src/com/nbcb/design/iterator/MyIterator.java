package com.nbcb.design.iterator;

/**
 * 自定义的Iterator接口
 * 和java.util.Iterator区别开来
 */
public interface MyIterator {
    boolean hasNext();
    Object next();
}
