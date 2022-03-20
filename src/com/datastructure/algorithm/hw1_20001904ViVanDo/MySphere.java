package com.datastructure.algorithm.hw1_20001904ViVanDo;

public class MySphere {
    private int r;
    private int x;
    private int y;
    private int z;

    public MySphere(int r, int x, int y, int z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * r * r;
    }

    public double getVolume() {
        return (4 * Math.PI * r * r * r) / 3;
    }

    public boolean isSurrounded(MySphere other) {
        if (distance(other) <= r) {
            if (distance(other) + other.r <= r) {
                return true;
            }
        }
        return false;
    }

    public boolean isIntersect(MySphere other) {
        if (distance(other) < r) {
            if (!isSurrounded(other)) {
                return true;
            }
        } else {
            if (distance(other) < (r + other.r)) {
                return true;
            }
        }
        return false;
    }

    public double distance(MySphere other) {
        int temp1 = x - other.x;
        int temp2 = y - other.y;
        int temp3 = z - other.z;
        return Math.sqrt(temp1 * temp1 + temp2 * temp2 + temp3 * temp3);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
