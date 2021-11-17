package org.example.exercises;

import java.util.Random;

public class MainEx9 {
    public static void main(String[] args) {
        int numOfPlayers = 3;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int player = random.nextInt(numOfPlayers)+1;
            System.out.println(String.format("Player %d has won!",player));
        }
        System.out.println("-".repeat(10));
    }
}
