package com.nbcb.design.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * ���Iterator��ʲô�����أ�
 * ��Ҫ�ǽ�Iterator��Composite����������ܹ�ʵ�ֶ�tree hierachy�и����ڵ�ı���
 *
 * ���ǿ���CompositeIteratorʵ����java.util.Iterator�ӿ�
 * ��ôCompositeIterator��Ȼ�ǿɱ�����
 *
 * ʹ�÷�ʽ���£�
 *
 *
 * ���ʵ�ֹ����أ�
 * ���ȣ�˵����������Ȼ�漰hasNext()��next()��������
 * CompositeIteratorҲ�����⣬��ȻҲ��ʵ����������������
 *
 * Ȼ������˵��tree hierachy��Ҫ��������ܹ��µĸ����ڵ㣬����ҪǶ�׷��ʡ�
 *
 */
public class CompositeIterator implements Iterator {

    /**
     * ���stack��ȫ�ֵģ�һ��new ��һ��CompositeIteratorʵ��
     * stack�����ʵ���о���Ψһ�ġ�
     *
     */
    Stack stack = new Stack();


    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }


    /**
     * ���ط�����
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
