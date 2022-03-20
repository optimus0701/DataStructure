package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;
import java.util.Random;

public class SortWithComparable {
    public static void main(String[] args) {
        MyObjectForSort<Integer>[] myObjectForSort = new MyObjectForSort[10];
        for (int i = 0; i < 10; i++) {
            Integer value = new Random().nextInt();
            myObjectForSort[i] = new MyObjectForSort<>(value);
        }
        System.out.println(Arrays.toString(myObjectForSort));
        insertionSort(myObjectForSort);
    }

    public static NumComparisonAndSwap bubbleSort(MyObjectForSort<Integer>[] myObjectForSorts) {
        int length = myObjectForSorts.length;
        int numOfComparisons = 0;
        int numOfSwaps = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                numOfComparisons++;
                if (myObjectForSorts[j - 1].compareTo(myObjectForSorts[j].getValue()) > 0) {
                    numOfSwaps++;
                    MyObjectForSort<Integer> temp = myObjectForSorts[j - 1];
                    myObjectForSorts[j - 1] = myObjectForSorts[j];
                    myObjectForSorts[j] = temp;
                }
                System.out.println(Arrays.toString(myObjectForSorts));
            }
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwaps);
    }

    public static NumComparisonAndSwap selectionSort(MyObjectForSort<Integer>[] myObjectForSorts) {
        int length = myObjectForSorts.length;
        int numOfComparisons = 0;
        int numOfSwap = 0;
        for (int i = length - 1; i >= 1; i--) {
            // Searching maximum element

            int maxIdx = i;
            for (int j = 0; j < i; j++) {
                numOfComparisons++;
                if (myObjectForSorts[j].compareTo(myObjectForSorts[maxIdx].getValue()) >= 0) {
                    maxIdx = j;
                }
            }

            // Swap maximum element with the last item

            numOfSwap++;
            MyObjectForSort<Integer> temp = myObjectForSorts[maxIdx];
            myObjectForSorts[maxIdx] = myObjectForSorts[i];
            myObjectForSorts[i] = temp;
            System.out.println(Arrays.toString(myObjectForSorts));
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwap);
    }

    public static NumComparisonAndSwap insertionSort(MyObjectForSort<Integer>[] myObjectForSort) {
        int length = myObjectForSort.length;
        int numOfComparisons = 0;
        int numOfSwap = 0;

        for (int i = 1; i < length; i++) {
            MyObjectForSort<Integer> next = myObjectForSort[i];
            int j;

            for (j = i - 1; j >= 0 && myObjectForSort[j].compareTo(next.getValue()) > 0; j--) {
                numOfComparisons++;
                myObjectForSort[j + 1] = myObjectForSort[j];
            }
            myObjectForSort[j + 1] = next;
            numOfSwap++;
            System.out.println(Arrays.toString(myObjectForSort));
        }
        return new NumComparisonAndSwap(numOfComparisons, numOfSwap);
    }
}
