package com.vcmp;

/**
 * Sudoko solving program that uses backtracking to solve the sudoku board.
 * @version 1.0 2020-02-11
 * @author Johannes Dalenbäck
 */
public class Main
{
    public static void main(String[] args)
    {
        SudokuBoard board = new SudokuBoard();
        board.showBoard();

        CheckBoard check = new CheckBoard();

        Solver solver = new Solver(check);
        solver.solve(board.getBoard());

        board.showBoard();
    }
}
