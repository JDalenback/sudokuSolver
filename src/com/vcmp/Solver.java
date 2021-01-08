package com.vcmp;

/**
 * The Solver uses backtracking to solve the sudoku board.
 * @version 1.0 2020-02-11
 * @author Johannes Dalenbäck
 */
public class Solver {
    private final byte EMPTY = 0;
    private final byte SIZE = 9;
    private CheckBoard check;

    public Solver(CheckBoard check)
    {
        this.check = check;
    }

    /**
     * Backtracking algorithm for solving a sudoku board using recursion.
     * @param board current implementation of the sudoku board.
     * @return true if board is solved.
     */
    public boolean solve(byte[][] board)
    {
       for(byte row = 0; row < SIZE; row++)
       {
           for(byte col = 0; col < SIZE; col++)
           {
                if(board[row][col] == EMPTY)
                {
                    for(byte numberToTest = 1; numberToTest <= SIZE; numberToTest++)
                    {
                        if(!check.isInRow(board, row, numberToTest)
                                && !check.isInColumn(board, col, numberToTest)
                                && !check.isInSquare(board, row, col, numberToTest))
                        {
                            board[row][col] = numberToTest;
                            if(solve(board))
                                return true;
                            else
                                board[row][col] = EMPTY;
                        }
                    }
                    return false;
                }
           }
       }
       return true;
    }
}

