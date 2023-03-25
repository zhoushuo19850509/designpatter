package com.nbcb.design.templatemethod.arraysort;

import java.util.Arrays;

public class ArraySortTest {
    public static void main(String[] args) {


        // sort the Ducks
        Duck[] ducks = new Duck[5];
        ducks[0] = new Duck("DuckA",10);
        ducks[1] = new Duck("DuckB",5);
        ducks[2] = new Duck("DuckC",16);
        ducks[3] = new Duck("DuckD",33);
        ducks[4] = new Duck("DuckE",6);
        System.out.println(Arrays.toString(ducks));


        System.out.println("\n start sort the ducks ...");
        Arrays.sort(ducks);
        System.out.println(Arrays.toString(ducks));


    }
}
