package com.fwd.tictactoe.Service;

import com.fwd.tictactoe.Model.*;

public class GameService {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex = 0;
    private boolean gameOver = false;
    private String resultMessage = "";

    public void initGame(int size) {
        board = new Board(size);
        players = new Player[]{
            new Player("Player 1", '❌'),
            new Player("Player 2", '⭕')
        };
        currentPlayerIndex = 0;
        gameOver = false;
        resultMessage = "";
    }

    public boolean makeMove(int row, int col) {
        if (gameOver) return false;

        Player currentPlayer = players[currentPlayerIndex];
        Move move = new Move(row, col, currentPlayer);

        if (!board.placeMove(move)) return false;

        if (board.checkWin(currentPlayer)) {
            resultMessage = currentPlayer.getName() + " wins 👑";
            gameOver = true;
        } else if (board.isDraw()) {
            resultMessage = "Game is a draw 🏳️";
            gameOver = true;
        } else {
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }
        return true;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
