package org.example.exercises;

import java.util.Random;

public class MainEx8 {
    public static void main(String[] args) {
        int numPlayers=3;
        //int player = new Random().nextInt(numPlayers) + 1;
        System.out.println(String.format("Player %d has won!",new Random().nextInt(numPlayers) + 1));
        System.out.println("-".repeat(10));
    }
}
