package com.datastructure.algorithm.hw4_20001904_ViVanDo.ExploringAMaze;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EAMMain {
    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        mainPanel.setLayout(boxLayout);

        TopPanel topPanel = new TopPanel();
        topPanel.setPreferredSize(new Dimension(600, 600));
        topPanel.setBackground(Color.DARK_GRAY);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 0);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(flowLayout);
        JButton buttonRestart = new JButton("ReStart");
        JButton buttonMove = new JButton("Move");

        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topPanel.restart();
            }
        });

        buttonMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topPanel.move();
            }
        });

        bottomPanel.add(buttonRestart);
        bottomPanel.add(buttonMove);

        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

        JFrame jFrame = new JFrame("Exploring A Maze Game");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(mainPanel);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xFrame = (int) (screenSize.getWidth() / 2 - 250);
        int yFrame = (int) (screenSize.getHeight() / 2 - 350);
        jFrame.setLocation(xFrame, yFrame); //set frame in center of screen

        jFrame.pack();//size = size all component
        jFrame.setVisible(true);
    }
}
