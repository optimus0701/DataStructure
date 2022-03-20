package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;

public class InsertionSortEx {
    // Exercise 3
    public static void main(String[] args) {
        int[] array = new int[] {13, 5, 12, 19, 43, 23};
        NumComparisonAndSwap insertionSort = sort(array, true);
        System.out.println("number of comparisons: " + insertionSort.getNumOfComparisons());
        System.out.println("number of swap: " + insertionSort.getNumOfSwap());
    }

    public static NumComparisonAndSwap sort(int[] array, boolean print) {
        int length = array.length;
        int numOfComparisons = 0;
        int numOfSwap = 0;

        for (int i = 1; i < length; i++) {
            int next = array[i];
            int j;

            for (j = i - 1; j >= 0 && array[j] > next; j--) {
                numOfComparisons++;
                array[j + 1] = array[j];
            }
            array[j + 1] = next;
            numOfSwap++;
            if (print) System.out.println(Arrays.toString(array));
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwap);
    }
}
