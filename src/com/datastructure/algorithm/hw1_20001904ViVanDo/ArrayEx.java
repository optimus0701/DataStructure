package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.util.Scanner;

public class ArrayEx {
    // Exercise 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a integer number: ");
        int length = scanner.nextInt();
        int[] array = inputArrayInteger(scanner, length);
        findPerfectNumber(array);
        System.out.println(max(array));
    }

    private static void findPerfectNumber(int[] array) {
        if (array == null) {
            return;
        }
        for (int ele : array) {
            if (isPerfectNumber(ele)) {
                System.out.println(ele);
            }
        }
    }

    private static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    }

    private static int[] inputArrayInteger(Scanner scanner, int length) {
        int[] array = new int[length];
        System.out.print("Input array(Integer): ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }
}
