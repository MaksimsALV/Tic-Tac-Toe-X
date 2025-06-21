package com.tictactoex.game;

public class Board {
    public static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    public static void boardVars() {
            var pos1 = board[0][0];
            var pos2 = board[0][1];
            var pos3 = board[0][2];
            var pos4 = board[1][0];
            var pos5 = board[1][1];
            var pos6 = board[1][2];
            var pos7 = board[2][0];
            var pos8 = board[2][1];
            var pos9 = board[2][2];
    }
}
