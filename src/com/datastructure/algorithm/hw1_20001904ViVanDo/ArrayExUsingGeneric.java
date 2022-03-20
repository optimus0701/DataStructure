package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.util.Scanner;

public class ArrayExUsingGeneric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array length: ");
        int length = scanner.nextInt();

        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.print("Input type of array: ");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> {
                Integer[] array = inputIntegerArray(length, scanner);
                MyArray<Integer> myArray = new MyArray<>(array);
                System.out.println("max: " + myArray.getMax());
                System.out.println("min: " + myArray.getMin());
            }
            case 2 -> {
                Double[] array = inputDoubleArray(length, scanner);
                MyArray<Double> myArray = new MyArray<>(array);
                System.out.println("max: " + myArray.getMax());
                System.out.println("min: " + myArray.getMin());
            }
        }
    }

    private static Double[] inputDoubleArray(int length, Scanner scanner) {
        Double[] array = new Double[length];
        System.out.print("Input array(double): ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    private static Integer[] inputIntegerArray(int length, Scanner scanner) {
        Integer[] array = new Integer[length];
        System.out.print("Input array(integer): ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


}
