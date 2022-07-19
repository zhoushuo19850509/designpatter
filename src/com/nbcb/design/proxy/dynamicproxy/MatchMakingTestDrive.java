package com.nbcb.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();




    }

    public void drive(){
        PersonBean joe = new PersonBeanImpl("Joe");

        PersonBean ownProxy = getOwnProxy(joe);
        System.out.println("name of person: " + ownProxy.getName());

        ownProxy.setInterests("fishing");
        System.out.println("interest of person : " + ownProxy.getInterests());

        try{
            // 自己不允许给自己打分哦
            ownProxy.setHotOrNotRating(30);
        }catch(Exception e){
            System.out.println("ownProxy access illegal methods ...");
        }

        PersonBean nonOwnProxy = getNonOwnProxy(joe);
        System.out.println(nonOwnProxy.getName());

        nonOwnProxy.setHotOrNotRating(20);
        nonOwnProxy.setHotOrNotRating(30);
        System.out.println("see the rating ..." + nonOwnProxy.getHotOrNotRating());

        try{
            // 自己不允许给自己打分哦
            nonOwnProxy.setGender("male");
        }catch(Exception e){
            System.out.println("nonOwnProxy access illegal methods ...");
        }


    }


    PersonBean getOwnProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnInvocationHandler(personBean));
    }

    PersonBean getNonOwnProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnInvocationHandler(personBean));
    }


}
