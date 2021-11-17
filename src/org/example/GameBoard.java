package org.example;

import java.util.Arrays;

public class GameBoard {
    private int numColums;
    private int numRows;
    private String fieldTemplate;
    private String[] fieldToken;

    //Constructor
    public GameBoard(int numRows, int numColums, String fieldTemplate) {
        this.numRows = numRows;
        this.numColums = numColums;
        this.fieldTemplate = fieldTemplate;
        this.fieldToken = new String[numColums*numRows];
        Arrays.fill(fieldToken,"");
    }

    public GameBoard() {
        this(5,3," |");
    }

    //Methods
    public void print() {
        for (int row = 0; row < numRows; row++) {
            if (row == 1) printSeparatorLine("Start");//After start row insert start line
            if (row == (numRows - 1)) printSeparatorLine("Finish");//Before last row insert finish line
            String line = "";
            for (int col = 0; col < numColums; col++) {
                line+= replaceAtStart(getToken(row,col ),fieldTemplate);
            }
            System.out.println(line);
        }
    }

    public void printSeparatorLine(String tagEndLine){
        String linePiece = "-".repeat(fieldTemplate.length());
        System.out.println(linePiece.repeat(numColums) + tagEndLine);
    }

    public String replaceAtStart(String replace, String string){
        return replace+ string.substring(replace.length());
    }

    public void setToken(int row, int col, String token){
        //TODO catch out of bound exception?
        this.fieldToken[this.numColums * row + col] =token;
    }

    public String getToken(int row, int col){
        //TODO catch out of bound exception?
        return this.fieldToken[this.numColums * row + col];
    }
}
