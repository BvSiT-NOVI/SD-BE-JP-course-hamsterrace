package org.example;

import org.example.GameBoard;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer("@");
        game.addPlayer("X");
        game.addPlayer("#");

        game.getPlayers().get(0).move();
        game.getPlayers().get(0).move();
        game.getPlayers().get(1).move();
        game.showBoard();
        System.out.println(game.toString());
    }
}
