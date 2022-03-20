package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;

public class BubbleSortEx {
    // Exercise 1
    public static void main(String[] args) {
        int[] array = new int[] {13, 5, 12, 19, 43, 23};
        NumComparisonAndSwap bubbleSort = sort(array, true);
        System.out.println("number of comparisons: " + bubbleSort.getNumOfComparisons());
        System.out.println("number of swap: " + bubbleSort.getNumOfSwap());
    }

    public static NumComparisonAndSwap sort(int[] array, boolean print) {
        int length = array.length;
        int numOfComparisons = 0;
        int numOfSwaps = 0;
        for (int i = 0; i < length; i++) {
            boolean is_sorted = true;
            for (int j = 1; j < length - i; j ++) {
                numOfComparisons++;
                if (array[j - 1] > array[j]) {
                    numOfSwaps++;
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    is_sorted = false;
                }
                if (is_sorted) break;
                if (print) System.out.println(Arrays.toString(array));
            }
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwaps);
    }
}
