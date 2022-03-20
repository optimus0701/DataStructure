package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;

public class SelectionSortEx {
    // Exercise 2
    public static void main(String[] args) {
        int[] array = new int[] {13, 5, 12, 19, 43, 23};
        NumComparisonAndSwap selectionSort = sort(array, true);
        System.out.println("number of comparisons: " + selectionSort.getNumOfComparisons());
        System.out.println("number of swap: " + selectionSort.getNumOfSwap());
    }

    public static NumComparisonAndSwap sort(int[] array, boolean print) {
        int length = array.length;
        int numOfComparisons = 0;
        int numOfSwap = 0;
        for (int i = length - 1; i >= 1; i--) {
            // Searching maximum element

            int maxIdx = i;
            for (int j = 0; j < i; j++) {
                numOfComparisons++;
                if (array[j] >= array[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Swap maximum element with the last item

            numOfSwap++;
            int temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
            if (print) System.out.println(Arrays.toString(array));
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwap);
    }
}
