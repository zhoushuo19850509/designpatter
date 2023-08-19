package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        System.out.println("hello ...");

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println( a + b);

        }


    }
}
