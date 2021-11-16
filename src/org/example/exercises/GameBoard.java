package org.example.exercises;

import java.util.Arrays;

public class GameBoard {
    private int numColumns;
    private int numRows;

    public GameBoard(int numColumns, int numRows) {
        this.numColumns = numColumns;
        this.numRows = numRows;
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
}
