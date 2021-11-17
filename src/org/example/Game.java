package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    //attributes
    private List<Player> players = new ArrayList<>();

    //methods
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

    public void playRound(int numPlayers){
        int numberToGuess = (new Random()).nextInt(numPlayers)+1;
        System.out.println("numberToGuess="+ numberToGuess);//debug
        List<Integer> playerInput = getPlayerInput(numPlayers);
        for (int i = 0; i < playerInput.size(); i++) {
            if (playerInput.get(i)==numberToGuess){
                System.out.println("Player "+ (i+1) + " has won this round!");
                break;
            }
        }
    }

    //utility method
    void addPlayer(String token){
        this.players.add(new Player(token));
    }

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                '}';
    }
}
