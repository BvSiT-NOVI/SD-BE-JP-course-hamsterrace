package org.example;

public class Player {
    //attributes
    private String token;
    private int rowPosition;//Rows start with 0

    //constructor
    public Player(String token) {
        this.token = token;
    }

    //methods
    public void move(){
        rowPosition++;
    }

    //getters and setters
    public int getRowPosition() {
        return rowPosition;
    }
    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Player{" +
                "token='" + token + '\'' +
                ", rowPosition=" + rowPosition +
                '}';
    }
}
