package com.TicTacToe;

public class CheckWinner {

    Contains the logic to check who won the game
    public CurrentStateOnBoard checkForWinner(int position, BoardGame board)
    {
        switch (position)
        {
            case 1:
                if (checkTopRow(board) || checkLeftColumn(board) || checkLtRDiagonal(board))
                    return board.getPositionState(1);
                break;
            case 2:
                if (checkTopRow(board) || checkMiddleColumn(board))
                    return board.getPositionState(2);
                break;
            case 3:
                if (checkTopRow(board) || checkRightColumn(board) || checkRtLDiagonal(board))
                    return board.getPositionState(3);
                break;
            case 4:
                if (checkMiddleRow(board) || checkLeftColumn(board))
                    return board.getPositionState(4);
                break;
            case 5:
                if (checkMiddleRow(board) || checkMiddleColumn(board) || checkLtRDiagonal(board) || checkRtLDiagonal(board))
                    return board.getPositionState(5);
                break;
            case 6:
                if (checkMiddleRow(board) || checkRightColumn(board))
                    return board.getPositionState(6);
                break;
            case 7:
                if (checkBottomRow(board) || checkLeftColumn(board) || checkRtLDiagonal(board))
                    return board.getPositionState(7);
                break;
            case 8:
                if (checkBottomRow(board) || checkMiddleColumn(board))
                    return board.getPositionState(8);
                break;
            case 9:
                if (checkBottomRow(board) || checkRightColumn(board) || checkLtRDiagonal(board))
                    return board.getPositionState(9);
                break;
            default:
                return CurrentStateOnBoard.Empty;
        }
        return CurrentStateOnBoard.Empty;
    }

    //Function for Draw
    public Boolean declareDraw(Players players)
    {
        if (players.getTurnCount() == 9)
            return true;
        return false;
    }

    //checks if the Top Row contains
    public Boolean checkTopRow(BoardGame board)
    {
        if (board.getPositionState(1) == board.getPositionState(2) && board.getPositionState(1) == board.getPositionState(3))
            return true;
        return false;
    }

    //checks if the Middle row contains three across
    public Boolean checkMiddleRow(BoardGame board)
    {
        if (board.getPositionState(4) == board.getPositionState(5) && board.getPositionState(4) == board.getPositionState(6))
            return true;
        return false;
    }

    //checks if the Bottom row contains three across
    public Boolean checkBottomRow(BoardGame board)
    {
        if (board.getPositionState(7) == board.getPositionState(8) && board.getPositionState(7) == board.getPositionState(9))
            return true;
        return false;
    }

    //checks if the Left Column contains three down
    public Boolean checkLeftColumn(BoardGame board)
    {
        if (board.getPositionState(1) == board.getPositionState(4) && board.getPositionState(1) == board.getPositionState(7))
            return true;
        return false;
    }

    //checks if the Middle Column contains three down
    public Boolean checkMiddleColumn(BoardGame board)
    {
        if (board.getPositionState(2) == board.getPositionState(5) && board.getPositionState(2) == board.getPositionState(8))
            return true;
        return false;
    }

    //checks if the Right Column contains three down
    public Boolean checkRightColumn(BoardGame board)
    {
        if (board.getPositionState(3) == board.getPositionState(6) && board.getPositionState(3) == board.getPositionState(9))
            return true;
        return false;
    }

    //checks if the Left to Right Diagonal contains three across
    public Boolean checkLtRDiagonal(BoardGame board)
    {
        if (board.getPositionState(1) == board.getPositionState(5) && board.getPositionState(1) == board.getPositionState(9))
            return true;
        return false;
    }

    //checks if the Right to Left Diagonal contains three across
    public Boolean checkRtLDiagonal(BoardGame board)
    {
        if (board.getPositionState(3) == board.getPositionState(5) && board.getPositionState(3) == board.getPositionState(7))
            return true;
        return false;
    }

}
