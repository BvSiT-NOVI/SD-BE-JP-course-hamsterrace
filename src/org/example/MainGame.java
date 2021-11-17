package org.example;

import org.example.GameBoard;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        Game game = new Game();
        List<Integer> chosenNumbers = game.getPlayerInput(2);
        System.out.println(chosenNumbers.toString());
    }
}
