package com.TicTacToe;

public class Display {
    private BoardGame board;

    public Display(BoardGame theBoard){
        board = theBoard;
    }

    // Convert the current state from enum to character to be used in DisplayCurrentBoard()
    public char getSpace(CurrentStateOnBoard state)
    {
        if (state == CurrentStateOnBoard.X)
            return 'X';
        else if (state == CurrentStateOnBoard.O)
            return 'O';
        else
            return ' ';
    }

    public void displayBoard(){
        // ToDo: implement here
    }

}
