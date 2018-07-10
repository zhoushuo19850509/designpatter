package com.nbcb.design.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * 这个Iterator有什么功能呢？
 * 主要是将Iterator和Composite结合起来，能够实现对tree hierachy中各个节点的遍历
 *
 * 我们看到CompositeIterator实现了java.util.Iterator接口
 * 那么CompositeIterator必然是可遍历的
 *
 * 使用方式如下：
 *
 *
 * 如何实现功能呢？
 * 首先，说到遍历，必然涉及hasNext()和next()两个方法
 * CompositeIterator也不例外，必然也是实现了这两个方法。
 *
 * 然后，我们说起tree hierachy，要遍历这个架构下的各个节点，就需要嵌套访问。
 *
 */
public class CompositeIterator implements Iterator {

    /**
     * 这个stack是全局的，一旦new 了一个CompositeIterator实例
     * stack在这个实例中就是唯一的。
     *
     */
    Stack stack = new Stack();


    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }


    /**
     * 重载方法，
     * @return
     */
    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            // for debug
//            System.out.println("============" + component.getName());
            if(component instanceof MenuNode){
                MenuNode currentNode = (MenuNode)component;
//                stack.push(component.createIterator());
                stack.push(currentNode.menucomponents.iterator());
            }
            return component;

        }else{
            return null;
        }
    }


    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }

        }
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
