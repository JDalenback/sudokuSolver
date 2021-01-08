package com.vcmp;

/**
 * A SudokuBoard object creates the sudoku board and stores it in an byte[][] array. It loads the sudoku in to
 * the array and manages methods regarding the board itself.
 * @version 1.0 2020-02-11
 * @author Johannes Dalenbäck
 */
public class SudokuBoard
{
    private byte[][] board = new byte[9][9];

    public SudokuBoard()
    {
        loadSudoku();
    }

    /**
     * Populates array "board" with starting numbers for soduko board.
     */
    private void loadSudoku(){
        board[0][4] = 6;
        board[1][2] = 2;
        board[1][8] = 9;
        board[2][1] = 3;
        board[2][3] = 4;
        board[2][7] = 1;
        board[3][1] = 1;
        board[3][4] = 5;
        board[3][6] = 4;
        board[4][0] = 6;
        board[4][2] = 5;
        board[5][1] = 4;
        board[5][2] = 3;
        board[5][7] = 9;
        board[6][0] = 5;
        board[6][1] = 2;
        board[6][2] = 1;
        board[6][5] = 9;
        board[7][5] = 3;
        board[7][7] = 8;
        board[8][3] = 5;
        board[8][5] = 4;
        board[8][6] = 6;
    }

    /**
     * Prints the sudoku board as a 9x9 grid with spaces between all 3x3 squares to the console.
     */
    public void showBoard()
    {
        for (byte row = 0; row < board.length; row++)
        {
            if (row %  3 == 0)
                System.out.println();
            for (byte col = 0; col < board[row].length; col++)
            {
                if (col %  3 == 0)
                    System.out.print("\t");
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.print("----------------------------------------------");// Print to separate from next call to showBoard.
    }

    /**
     * Getter method for the sudoku board.
     * @return the current implementation of the sudoku board.
     */
    public byte[][] getBoard(){
        return this.board;
    }
}
