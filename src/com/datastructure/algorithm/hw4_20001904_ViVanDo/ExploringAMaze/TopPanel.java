package com.datastructure.algorithm.hw4_20001904_ViVanDo.ExploringAMaze;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

public class TopPanel extends JPanel {
    public final static int N = 8;
    private int[][] map;
    private Player player;
    private Stack<Path> paths;
    public TopPanel() {
        initMap();
        paths = new Stack<>();
        paths.push(new Path(2, 0));
        player = new Player(paths);
    }

    private void initMap() {
        map = new int[][]{
                {1, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 2},
                {1, 1, 0, 1, 0, 1, 1, 1},
                {1, 0, 0, 1, 0, 1, 1, 1}
        };
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.YELLOW);
        int width = getWidth() / N;
        int height = getHeight() / N;
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                Color color = getColor(map[row][col]);
                g2D.setColor(color);
                int x = col * width;
                int y = row * height;
                g2D.fillRect(x, y, width, height);
                if (player.getPaths() != null) {
                    int pCol = player.getPaths().peek().getCol();
                    int pRow = player.getPaths().peek().getRow();
                    if (col == pCol && row == pRow && map[row][col] == 0) {
                        drawPlayer(g2D, x, y, width, height);
                    } else if (col == pCol && row == pRow && map[row][col] == 1) {
                        player.back();
                        repaint();
                        player.move();
                    } else if (col == pCol && row == pRow && map[row][col] == 2) {
                        drawPlayer(g2D, x, y, width, height);
                        System.out.println("Winner!");
                        restart();
                    }
                } else {
                    System.out.println("stack paths null");
                }
            }
        }
    }

    public void restart() {
        paths.removeAllElements();
        paths.push(new Path(2, 0));
        player.setPaths(paths);
        repaint();
    }

    public Color getColor(int i) {
       return switch (i) {
            case 0 -> Color.CYAN;
            case 2 -> Color.BLUE;
           default -> Color.BLACK;
        };
    }

    public void drawPlayer(Graphics2D g2D, int x, int y, int width, int height) {
        System.out.println(player);
        Image image = null;
        try {
            InputStream inputStream = getClass().getResourceAsStream("./assets/player.png");
            if (inputStream == null) {
                return;
            }
            image = ImageIO.read(inputStream);
            g2D.drawImage(image, x, y, width, height, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void move() {
        player.move();
        repaint();
    }

}
