package com.datastructure.algorithm.hw4_20001904_ViVanDo.TowerOfHanoi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TOHMain {
    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        mainPanel.setLayout(boxLayout);

        HomePanel home = new HomePanel();
        home.setPreferredSize(new Dimension(500, 500));
        home.setBackground(Color.GRAY);


        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 0);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(flowLayout);
        JButton reStartButton = new JButton("ReStart");
        JButton moveButton = new JButton("Move");

        reStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.restart("Restart Game");
            }
        });

        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.move();
            }
        });




        bottomPanel.add(reStartButton);
        bottomPanel.add(moveButton);


        mainPanel.add(home);
        mainPanel.add(bottomPanel);

        JFrame jFrame = new JFrame("Tower Of Hanoi Game");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(mainPanel);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xFrame = (int) (screenSize.getWidth() / 2 - 250);
        int yFrame = (int) (screenSize.getHeight() / 2 - 250);
        jFrame.setLocation(xFrame, yFrame); //set frame in center of screen

        jFrame.pack();//size = size all component
        jFrame.setVisible(true);
    }
}
