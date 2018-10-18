package com.TicTacToe;

import com.TicTacToe.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame{
    Container pane;
    JButton[][] board;
    String currentPlayer;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem newGame;
    JMenuItem quit;

    public GUI(){
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout(3,3));
        setTitle("Tic-Tac-Toe");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        currentPlayer = "X";
        board = new JButton[3][3];
        initializeMenu();
        initializeButtons();
    }
    public void initializeMenu(){
        menuBar = new JMenuBar();
        menuBar.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        menu = new JMenu("Menu");
        menu.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        newGame = new JMenuItem("New Game");
        newGame.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        quit = new JMenuItem("Quit");
        quit.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(newGame);
        menu.add(quit);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public void initializeButtons() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                JButton button = new JButton();
                button.setFont(new Font(Font.DIALOG, Font.BOLD, 100));
                board[i][j] = button;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(((JButton)e.getSource()).getText().equals("")){ // TODO && checkForWinner
                            button.setText(currentPlayer);
                            changePlayer();
                        }
                    }
                });
                pane.add(button);
            }
        }
    }

    public void reset() {
        currentPlayer = "X";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j].setText("");
            }
        }
    }

    public void changePlayer(){
        if(currentPlayer.equals("X")){
            currentPlayer = "O";
        }else if(currentPlayer.equals("O")){
            currentPlayer = "X";
        }
    }
}