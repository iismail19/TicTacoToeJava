package com.TicTacToe;

import com.TicTacToe.CheckWinner;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JPanel{
    JButton buttons[] = new JButton[9];
    int marker = 0; // even num = X, odd num = O

    public GUI(){
        setLayout(new GridLayout(3,3));
    }

    public void show(){
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeButtons(frame);
        frame.pack();
        frame.setVisible(true);
    }

    public void initializeButtons(JFrame frame) {
        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new buttonListener());
            frame.getContentPane().add(buttons[i]);
        }
    }

    public void reset() {
        for(int i = 0; i < 9; i++) {
            buttons[i].setText("");
        }
    }

    private class buttonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton)e.getSource();
            if(marker%2 == 0){
                buttonClicked.setText("X");
            }else {
                buttonClicked.setText("O");
            }
            /*if(){ // TODO - reset when winner or draw is found
                JOptionPane.showConfirmDialog(null, "Game Over");
                reset();
            }*/
            marker++;
        }
    }
}
