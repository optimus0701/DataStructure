package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.math.BigDecimal;

public class MyArray<N extends Number> {
    private N[] array;

    public MyArray(N[] array) {
        this.array = array;
    }

    public MyArray() {
    }

    public N getMax() {
        N max = array[0];
        for (N ele : array) {
            if (compare(ele, max) > 0) {
                max = ele;
            }
        }
        return max;
    }

    public N getMin() {
        N min = array[0];
        for (N ele : array) {
            if (compare(ele, min) < 0) {
                min = ele;
            }
        }
        return min;
    }

    public void findPerfectNumber() {
        for (N ele : array) {
            if (ele instanceof Integer) {
                int n = (int) ele;
                if (isPerfectNumber(n)) {
                    System.out.println(n);
                }
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

    public int compare(Number a, Number b){
        return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));
    }
}
