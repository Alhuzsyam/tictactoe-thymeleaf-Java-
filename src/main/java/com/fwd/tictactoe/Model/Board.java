package com.fwd.tictactoe.Model;

public class Board {
    private char[][] grid;
    private int size;

    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = ' ';
    }

    public boolean placeMove(Move move) {
        int row = move.getRow();
        int col = move.getCol();
        if (isValidMove(row, col)) {
            grid[row][col] = move.getPlayer().getSymbol();
            return true;
        }
        return false;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == ' ';
    }

    public boolean checkWin(Player player) {
        char symbol = player.getSymbol();

        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (checkLine(symbol, i, 0, 0, 1)) return true;
            if (checkLine(symbol, 0, i, 1, 0)) return true;
        }

        // Check diagonals
        return checkLine(symbol, 0, 0, 1, 1) || checkLine(symbol, 0, size - 1, 1, -1);
    }

    private boolean checkLine(char symbol, int startRow, int startCol, int rowInc, int colInc) {
        for (int i = 0; i < size; i++) {
            if (grid[startRow + i * rowInc][startCol + i * colInc] != symbol) return false;
        }
        return true;
    }

    public boolean isDraw() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (grid[i][j] == ' ') return false;
        return true;
    }

    public char[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }
}
