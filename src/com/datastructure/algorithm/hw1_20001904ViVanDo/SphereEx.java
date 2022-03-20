package com.datastructure.algorithm.hw1_20001904ViVanDo;

public class SphereEx {
    // Exercise 4
    public static void main(String[] args) {
        MySphere sphere1 = new MySphere(5, 0, 0, 0);
        MySphere sphere2 = new MySphere(3, 0, 0, 0);
        System.out.println("Surface Area: " + sphere1.getSurfaceArea());
        System.out.println("Volume: " + sphere1.getVolume());
        System.out.println("Is Surrounded: " + sphere1.isSurrounded(sphere2));
        System.out.println("Is Intersect: " + sphere1.isIntersect(sphere2));
    }
}
