package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    //attributes
    private List<Player> players = new ArrayList<>();
    private int numOfRoundsToWin;

    //constructor
    public Game() {
        numOfRoundsToWin = 4;
    }


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

    public void playRound(){
        int numberToGuess = (new Random()).nextInt(players.size())+1;
        System.out.println("numberToGuess="+ numberToGuess);//debug
        List<Integer> playerInput = getPlayerInput(players.size());
        for (int i = 0; i < playerInput.size(); i++) {
            if (playerInput.get(i)==numberToGuess){
                System.out.println("Player "+ (i+1) + " has won this round!");
                this.players.get(i).move();
                break;
            }
        }
        showBoard();
    }

    //utility method
    void addPlayer(String token){
        this.players.add(new Player(token));
    }

    public void showBoard(){
        //Add extra row for start row.
        GameBoard gameBoard = new GameBoard(numOfRoundsToWin+1, players.size());
        for (int col = 0; col < players.size() ; col++) {
            Player player = players.get(col);
            gameBoard.setToken(player.getRowPosition(),col, player.getToken());
        }
        gameBoard.print();
    }

    public void play(){
        System.out.println("Welcome to the hamster race!");
        showBoard();
        for (int i = 0; i < 2; i++) {
            playRound();
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                '}';
    }

    //getters and setters
    public List<Player> getPlayers() {
        return players;
    }
}
