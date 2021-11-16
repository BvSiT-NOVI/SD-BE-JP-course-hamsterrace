package org.example.exercises;

import java.util.Arrays;

public class MainEx6 {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(3,3);
        System.out.println("Aantal rijen: "+gameBoard.getNumRows());
        System.out.println(Arrays.toString(gameBoard.getFieldToken()));
    }
}
