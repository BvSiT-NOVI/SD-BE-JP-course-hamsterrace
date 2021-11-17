package org.example;

import org.example.GameBoard;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer("@");
        game.addPlayer("X");
        game.addPlayer("#");
        game.playRound();
        System.out.println(game.toString());
    }
}
