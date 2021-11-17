package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<Integer> getPlayerInput(int numPlayers)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> chosenNumbers = new ArrayList<>();
        System.out.println("Type a number between 1 and "+ numPlayers);
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player "+ (i + 1) + "," + " choose a number: ");
            chosenNumbers.add(scanner.nextInt());
        }
        return chosenNumbers;
    }
}
