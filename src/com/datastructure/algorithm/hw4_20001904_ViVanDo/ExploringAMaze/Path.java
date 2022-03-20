package com.datastructure.algorithm.hw4_20001904_ViVanDo.ExploringAMaze;

import java.util.Stack;

public class Path {
    private int row;
    private int col;
    private Stack<Direction> directions;

    public Path(int row, int col) {
        this.row = row;
        this.col = col;
        createDirections();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Stack<Direction> getDirections() {
        return directions;
    }

    public void setDirections(Stack<Direction> directions) {
        this.directions = directions;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Path)) return false;
        Path path = (Path) o;
        return getRow() == path.getRow() && getCol() == path.getCol();
    }

    @Override
    public String toString() {
        return row + " " + col;
    }

    public void createDirections() {
        directions = new Stack<>();
        directions.add(Direction.NO_DIR);
        directions.add(Direction.LEFT);
        directions.add(Direction.RIGHT);
        directions.add(Direction.DOWN);
        directions.add(Direction.UP);
    }

    /*public boolean hasVisited(Path path) {
        for (int )
    }*/

}
