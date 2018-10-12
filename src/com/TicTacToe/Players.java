package com.TicTacToe;

enum CurrentStateOnBoard {Empty, X, O};

public class Players {
    // Class should hold two players max
    // second player could be an AI(Later figured out)

    private String player1;
    private String player2;
    private CurrentStateOnBoard turn = CurrentStateOnBoard.X;

    private int ply1Score;
    private int ply2Score;
    //private int numberOfGames;
    private int turnCount;

    // initialize the players and the score
    public Players(String n1, String n2)
    {
        player1 = n1;
        player2 = n2;
        ply1Score = 0;
        ply2Score = 0;
        turnCount = 0;
    }

    // getters
    public String getPlayer1Name ()
    {
        return player1;
    }

    public String getPlayer2Name()
    {
        return player2;
    }

    public CurrentStateOnBoard getTurn()
    {
        return turn;
    }

    public int getPly1Score()
    {
        return ply1Score;
    }

    public int getPly2Score()
    {
        return ply2Score;
    }

    public int getTurnCount()
    {
        return turnCount;
    }

    // setters
    public void setPlayer1Name(String name)
    {
        player1 = name;
    }

    public void setPlayer2Name(String name)
    {
        player2 = name;
    }

    // keep track of turn fucntion, to change change the CurrentStateOnBoard from X to O and vice-versa
    public CurrentStateOnBoard turn()
    {
        if (turn == CurrentStateOnBoard.X)
            turn = CurrentStateOnBoard.O;
        else if(turn == CurrentStateOnBoard.O)
            turn = CurrentStateOnBoard.X;
        turnCount++;
        return turn;
    }

    public String getCurrentPlayerName()
    {
        if (turn == CurrentStateOnBoard.X)
            return player1;
        else
            return player2;
    }

}
