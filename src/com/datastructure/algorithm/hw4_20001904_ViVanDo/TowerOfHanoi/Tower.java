package com.datastructure.algorithm.hw4_20001904_ViVanDo.TowerOfHanoi;

import java.util.Stack;

public class Tower {
    private int x;
    private int y;
    public final static int width = 20;
    public final static  int height = 200;
    private Stack<Disc> discs;

    public Tower(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tower(int x, int y, Stack<Disc> discs) {
        this.x = x;
        this.y = y;
        this.discs = discs;
        setDiscPosition();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Stack<Disc> getDiscs() {
        return discs;
    }

    public void setDiscs(Stack<Disc> discs) {
        this.discs = discs;
    }

    public void setDiscPosition() {
        for (int i = 0; i < discs.size(); i++) {
            discs.get(i).setX(this.x - (discs.get(i).getWidth() / 2) + 10);
            discs.get(i).setY(500 - (i + 1) * 10);
        }
    }
}
