package org.example;

import org.example.GameBoard;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("@");
        player.move();
        System.out.println(player.toString());
    }
}
