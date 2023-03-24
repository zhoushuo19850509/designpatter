package com.nbcb.design.adapter.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");

        Enumeration<String> enumeration = v.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
