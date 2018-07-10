package com.nbcb.design.templatemethod;

import java.util.Arrays;

public class DuckSortDrive {
    public static void main(String[] args){
        Duck[] ducks = new Duck[10];
        ducks[0] = new Duck("Mike0",10);
        ducks[1] = new Duck("Mike1",25);
        ducks[2] = new Duck("Mike2",5);
        ducks[3] = new Duck("Mike3",103);
        ducks[4] = new Duck("Mike4",29);
        ducks[5] = new Duck("Mike5",39);
        ducks[6] = new Duck("Mike6",6);
        ducks[7] = new Duck("Mike7",300);
        ducks[8] = new Duck("Mike8",69);
        ducks[9] = new Duck("Mike9",55);

        System.out.println("original :");
        displayDucks(ducks);
        Arrays.sort(ducks);
        System.out.println("after sort :");
        displayDucks(ducks);

    }

    public static void displayDucks(Duck[] ducks){
        for(int i = 0 ; i < ducks.length; i++){
            System.out.println(ducks[i]);

        }

    }
}
