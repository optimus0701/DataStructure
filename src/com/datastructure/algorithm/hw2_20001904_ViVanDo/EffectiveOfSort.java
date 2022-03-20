package com.datastructure.algorithm.hw2_20001904_ViVanDo;

public class EffectiveOfSort {
    // Exercise 5
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        NumComparisonAndSwap bubbleSort = BubbleSortEx.sort(array, false);
        NumComparisonAndSwap selectionSort = SelectionSortEx.sort(array, false);
        NumComparisonAndSwap insertionSort = InsertionSortEx.sort(array, false);

        int minIdxComparisons = minIdx(bubbleSort.getNumOfComparisons(), selectionSort.getNumOfComparisons(),
                insertionSort.getNumOfComparisons());
        int minIdxSwap = minIdx(bubbleSort.getNumOfSwap(), selectionSort.getNumOfSwap(),
                insertionSort.getNumOfSwap());
        String minComparison = null;
        switch (minIdxComparisons) {
            case 1 -> minComparison = "Bubble Sort";
            case 2 -> minComparison = "Selection Sort";
            case 3 -> minComparison = "Insertion Sort";
        }

        String minSwap = null;
        switch (minIdxSwap) {
            case 1 -> minSwap = "Bubble Sort";
            case 2 -> minSwap = "Selection Sort";
            case 3 -> minSwap = "Insertion Sort";
        }

        System.out.println("Minimum number of comparisons: " + minComparison);
        System.out.println("Minimum number of comparisons: " + minSwap);
    }

    public static int minIdx(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        if (min == a) return 1;
        if (min == b) return 2;
        return 3;
    }
}
