package org.example.exercises;

import java.util.Arrays;

public class GameBoard {
    private int numColumns;
    private int numRows;
    private String[] fieldToken;

    public GameBoard(int numColumns, int numRows) {
        this.numColumns = numColumns;
        this.numRows = numRows;
        fieldToken = new String[numColumns*numRows];
        Arrays.fill(fieldToken,"X");
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[] getFieldToken() {
        return fieldToken;
    }

    public void setFieldToken(String[] fieldToken) {
        this.fieldToken = fieldToken;
    }
}
