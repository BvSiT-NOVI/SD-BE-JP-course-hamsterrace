package org.example;

import org.example.GameBoard;

public class MainGame {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.print();
        System.out.println(gameBoard.replaceAtStart("X","abcdef"));
        gameBoard.setToken(1,1,"@");
        gameBoard.setToken(0,2,"X");
        System.out.println(gameBoard.getToken(1,1));
        System.out.println(gameBoard.getToken(0,2));
    }
}
