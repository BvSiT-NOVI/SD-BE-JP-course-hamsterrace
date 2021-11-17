package org.example.exercises;

import java.util.Random;

public class MainEx10 {
    public static void main(String[] args) {
        int numOfPlayers = 3;
        int player=0;
        while (player!=3){
            player = new Random().nextInt(numOfPlayers)+1;
            System.out.printf("Player %d has won!%n",player);
        }
        System.out.println("-".repeat(10));
    }
}
