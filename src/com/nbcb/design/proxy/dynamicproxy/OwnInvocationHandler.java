package com.nbcb.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 */
public class OwnInvocationHandler
        implements InvocationHandler {


    private PersonBean personBean;

    public OwnInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        /**
         * 对于getXX()，方法，本人可以随意调用
         */
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }
        /**
         * 对于setHotOrNotRating()方法，本人不能调用，不能给自己打分
         */
        else if(method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException();
        }
        /**
         * 对于其他setXX()方法，本人可以随意设置，毕竟是设置自己的信息
         */
        else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args);
        }

        return null;
    }
}
