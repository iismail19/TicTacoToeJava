package com.TicTacToe;

public class BoardGame {

    private CurrentStateOnBoard[][] board;

    public BoardGame()
    {
        board = new CurrentStateOnBoard[3][3];

    }

    public Boolean addtoBoard(int index, CurrentStateOnBoard value)
    {

        switch (index)
        {
            case 1:
                board[0] [0] = value;
                return true;
            case 2:
                board[0] [1] = value;
                return true;
            case 3:
                board[0] [2] = value;
                return true;
            case 4:
                board[1] [0] = value;
                return true;
            case 5:
                board[1] [1] = value;
                return true;
            case 6:
                board[1] [2] = value;
                return true;
            case 7:
                board[2] [0] = value;
                return true;
            case 8:
                board[2] [1] = value;
                return true;
            case 9:
                board[2] [2] = value;
                return true;
            default:
                return false; // Will return false when an invalid index number supplied
        }

    }

    // Return the Full Board
    public CurrentStateOnBoard[][] getArray()
    {
        return board;
    }

    public CurrentStateOnBoard getPositionState(int position)
    {
        // Need to figure out if a state is returned vs if the default case is hit.. ? possible Bug needs to be addressed!
        switch (position)
        {
            case 1:
                return board[0] [0];
            case 2:
                return board[0] [1];
            case 3:
                return board[0] [2];
            case 4:
                return board[1] [0];
            case 5:
                return board[1] [1];
            case 6:
                return board[1] [2];
            case 7:
                return board[2] [0];
            case 8:
                return board[2] [1];
            case 9:
                return board[2] [2];
            default:
                return CurrentStateOnBoard.Empty;
        }
    }
}
