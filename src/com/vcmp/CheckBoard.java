package com.vcmp;

/**
 * CheckBoard objects contain all methods for checking the given sudoku board for numbers and availability of boxes.
 * @version 1.0 2020-02-11
 * @author Johannes Dalenbäck
 */
public class CheckBoard
{
    /**
     * Check row to see if given number is already in row.
     *
     * @param board Current implementation of sudoku board.
     * @param rowIndex Which row in board to search.
     * @param numberToCheck Which number to search for.
     * @return true if number is in row, false if number is not.
     */
    public boolean isInRow(byte[][] board, byte rowIndex, byte numberToCheck)
    {
        for (int col = 0; col < board.length; col++)
        {
            if(board[rowIndex][col] == numberToCheck)
                return true;
        }
        return false;
    }

    /**
     * Check column to see if given number is already in column.
     *
     * @param board Current implementation of sudoku board.
     * @param colIndex Which column in board to search.
     * @param numberToCheck Which number to search for.
     * @return true if number is in column, false if number is not.
     */
    public boolean isInColumn(byte[][] board, byte colIndex, byte numberToCheck)
    {
        for(byte row = 0; row < board.length; row++)
        {
            if(board[row][colIndex] == numberToCheck)
                return true;
        }
        return false;
    }

    /**
     * Check 3x3 square to see if given number is already present.
     *
     * @param board Current implementation of sudoku board.
     * @param rowIndex Which row given number is located in.
     * @param colIndex Which column given number is located in.
     * @param numberToCheck Which number to check for.
     * @return true if number is present in 3x3 square, false if not
     */
    public boolean isInSquare(byte[][] board, byte rowIndex, byte colIndex, byte numberToCheck)
    {

        byte currentRow = 0;
        byte currentCol = 0;

        if(rowIndex > 2 && rowIndex < 6)
            currentRow = 3;
        else if(rowIndex > 5)
            currentRow = 6;

        if(colIndex > 2 && colIndex < 6)
            currentCol = 3;
        else if(colIndex > 5)
            currentCol = 6;

        for(byte row = currentRow; row < currentRow + 3; row++)
        {
            for(byte col = currentCol; col < currentCol + 3; col++)
            {
                if(board[row][col] == numberToCheck)
                    return true;
            }
        }
        return false;
    }
}


