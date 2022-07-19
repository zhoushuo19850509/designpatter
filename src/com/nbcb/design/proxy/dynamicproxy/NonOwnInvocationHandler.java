package com.nbcb.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnInvocationHandler
        implements InvocationHandler {



    private PersonBean personBean;

    public NonOwnInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        /**
         * 对于getXX()，方法，别人可以随意调用
         */
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }
        /**
         * 对于setHotOrNotRating()方法，别人可以调用
         * 别人调用这个方法进行打分
         */
        else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(personBean,args);
        }
        /**
         * 对于其他setXX()方法，别人都不能调用，这些方法只有本人才能调用
         */
        else if(method.getName().startsWith("set")){
            throw new IllegalAccessException();
        }

        return null;

    }
}
