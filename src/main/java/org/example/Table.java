package org.example;

public class Table {
    int rowsCount;
    int columnCount;
    int[][] table;

    public Table(int rowsCount, int columnCount) {
        setRowsCount(rowsCount);
        setColumnCount(columnCount);
        table = new int[rowsCount][columnCount];

    }
    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }



    int getValue(int row, int column) {
        return this.table[row - 1][column - 1];
    }
    void setValue(int row, int column, int value) {
        this.table[row - 1][column - 1] = value;
    }
    int rows() {
        return this.rowsCount;
    }
    int cols() {
        return this.columnCount;
    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int rowTurn = 0; rowTurn < this.rowsCount; ++rowTurn) {
            for (int colTurn = 0; colTurn < this.columnCount; ++colTurn) {
                out.append(this.table[rowTurn][colTurn]).append("  ");
            }
            out.append("\n");
        }
        return out.toString();
    }
    Double average() {
        double out = 0;
        for (int rowTurn = 0; rowTurn < this.rowsCount; ++rowTurn) {
            for (int colTurn = 0; colTurn < this.columnCount; ++colTurn) {
                out += this.table[rowTurn][colTurn];
            }
        }
        out = out / (rowsCount * columnCount);
        return out;
    }
}
