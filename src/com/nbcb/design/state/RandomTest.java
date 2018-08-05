package com.nbcb.design.state;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args){
        Random randomWinner = new Random(System.currentTimeMillis());

        for(int i = 0 ; i < 10 ; i++){
            int winner = randomWinner.nextInt(10);
            System.out.println("hello random: " + winner);
        }
    }
}
