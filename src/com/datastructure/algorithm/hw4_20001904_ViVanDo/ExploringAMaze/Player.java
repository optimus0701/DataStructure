package com.datastructure.algorithm.hw4_20001904_ViVanDo.ExploringAMaze;

import java.util.Stack;

public class Player {
    private Stack<Path> paths;

    public Player(Stack<Path> paths) {
        this.paths = paths;
    }

    public Stack<Path> getPaths() {
        return paths;
    }

    public void setPaths(Stack<Path> paths) {
        this.paths = paths;
    }

    public void move() {
        Direction direction = paths.peek().getDirections().peek();
        paths.peek().getDirections().pop();
        switch (direction) {
            case UP -> moveUp();
            case DOWN -> moveDown();
            case LEFT -> moveLeft();
            case RIGHT -> moveRight();
            case NO_DIR -> back();
        }
    }

    public void back() {
        paths.pop();
    }

    public void moveUp() {
        System.out.println("move up");
        int row = paths.peek().getRow();
        int col = paths.peek().getCol();
        row = row - 1;
        Path path = new Path(row, col);
        if (!paths.contains(path) && row >= 0) {
            paths.push(new Path(row, col));
        } else {
            move();
        }
    }

    public void moveDown() {
        System.out.println("move down");
        int row = paths.peek().getRow();
        int col = paths.peek().getCol();
        row = row + 1;
        Path path = new Path(row, col);
        if (!paths.contains(path) && row < TopPanel.N) {
            paths.push(new Path(row, col));
        } else {
            move();
        }
    }

    public void moveLeft() {
        System.out.println("move left");
        int row = paths.peek().getRow();
        int col = paths.peek().getCol();
        col = col - 1;
        Path path = new Path(row, col);
        if (!paths.contains(path) && col >= 0) {
            paths.push(new Path(row, col));
        } else {
            move();
        }
    }

    public void moveRight() {
        System.out.println("move right");
        int row = paths.peek().getRow();
        int col = paths.peek().getCol();
        col = col + 1;
        Path path = new Path(row, col);
        if (!paths.contains(path) && col < TopPanel.N) {
            paths.push(new Path(row, col));
        } else {
            move();
        }
    }

    @Override
    public String toString() {
        return String.format("Player: [%d, %d]", paths.peek().getRow(), paths.peek().getCol());
    }
}
