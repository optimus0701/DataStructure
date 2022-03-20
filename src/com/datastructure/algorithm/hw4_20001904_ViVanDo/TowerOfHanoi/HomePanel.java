package com.datastructure.algorithm.hw4_20001904_ViVanDo.TowerOfHanoi;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class HomePanel extends JPanel {
    private final static int NUM_TOWER = 3;
    private final static int NUM_DISC = 7;
    private Tower[] towers;
    private Stack<Disc>[] discs = new Stack[NUM_TOWER];
    public HomePanel() {
        init();
    }

    private void init() {
        createDiscsForTower1();
        // create tower
        towers = new Tower[NUM_TOWER];
        for (int i = 0; i < NUM_TOWER; i++) {
            if (i == 0) {
                towers[0] = new Tower( 115, Tower.height + 100, discs[0]);
            } else {
                towers[i] = new Tower((i + 1) * 115, Tower.height + 100);
            }

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.YELLOW);
        for (Tower tower : towers) {
            g2D.fillRect(tower.getX(), tower.getY(), Tower.width, Tower.height);
            Stack<Disc> discStack = tower.getDiscs();
            if (discStack != null && discStack.size() != 0) {
                drawDiscs(g2D, discStack);
            }
        }
    }

    private void drawDiscs(Graphics2D g2D, Stack<Disc> discStack) {
        g2D.setColor(Color.PINK);
        for (int i = 0; i < discStack.size(); i++) {
            Disc disc = discStack.get(i);
            g2D.fillRect(disc.getX(), disc.getY(), disc.getWidth(), disc.getHeight());
        }
        g2D.setColor(Color.YELLOW);
    }

    public void move() {
        if (towers[1].getDiscs() != null && towers[1].getDiscs().size() == NUM_DISC) {
            restart("Winner!");
        } else {
            if (towers[0].getDiscs().size() != 0) {
                moveDiscsTo(0, 2);
                repaint();
            } else {
                if (towers[2].getDiscs().size() != 0) {
                    moveDiscsTo(2, 1);
                    if (towers[1].getDiscs().size() == NUM_DISC) {
                        repaint();
                        restart("Winner!");
                    } else {
                        repaint();
                    }
                }
            }
        }
    }

    public void moveDiscsTo(int idxFrom, int idxTo) {
        Disc item = towers[idxFrom].getDiscs().peek();
        towers[idxFrom].getDiscs().pop();
        if (discs[idxTo] == null) {
            discs[idxTo] = new Stack<>();
        }

        discs[idxTo].push(item);
        towers[idxTo].setDiscs(discs[idxTo]);
        towers[idxTo].setDiscPosition();
    }

    public void restart(String title) {
        int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to restart game", title,
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == 0) {
            createDiscsForTower1();
            towers[0].setDiscs(discs[0]);
            towers[0].setDiscPosition();
            discs[1] = null;
            towers[1].setDiscs(null);
            discs[2] = null;
            towers[2].setDiscs(null);
            repaint();
        }
    }

    public void createDiscsForTower1() {
        discs[0] = new Stack<>();
        for (int i = 0; i < NUM_DISC; i++) {
            discs[0].push(new Disc(i));
        }
    }

}
