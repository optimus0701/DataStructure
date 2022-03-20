package com.datastructure.algorithm.hw3_20001904_ViVanDo;

import java.util.Scanner;

public class FractionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction[] fractions = inputArray(scanner);
        System.out.print("you want to print index: ");
        int index = scanner.nextInt();
        print(fractions, index);
        Fraction sum = sum(fractions);
        System.out.println("sum of fractions: " + sum);
        sortFractions(fractions);
        for (Fraction fraction : fractions) {
            System.out.println(fraction.normalize());
        }
    }

    private static void sortFractions(Fraction[] fractions) {
        if (fractions == null) {
            return;
        }
        for (int i = 0; i < fractions.length; i++) {
            boolean is_sorted = true;
            for (int j = 1; j < fractions.length - i; j++) {
                if (fractions[j - 1].toDouble() > fractions[j].toDouble()) {
                    Fraction temp = fractions[j - 1];
                    fractions[j - 1] = fractions[j];
                    fractions[j] = temp;
                    is_sorted = false;
                }
                if (is_sorted) break;
            }
        }
    }

    public static void print(Fraction[] fractions, int index) {
        if (fractions == null) {
            System.out.println("Fractions is null");
            return;
        }
        if (index >= fractions.length) {
            System.out.println("invalid index");
            return;
        }
        System.out.println(fractions[index]);
    }

    private static Fraction[] inputArray(Scanner scanner) {
        System.out.print("Input array length: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        Fraction[] fractions = new Fraction[length];
        System.out.println("Input array(format: numerator/denominator)");
        for (int i = 0; i < length; i++) {
            System.out.printf("Fractions[%d]: ", i);
            String input = scanner.nextLine();
            String[] strs = input.split("/");
            if (strs[1].equals("0")) {
                System.out.println("invalid input... denominator can't be 0");
                i--;
                continue;
            }
            fractions[i] = new Fraction(Float.parseFloat(strs[0]), Float.parseFloat(strs[1]));
        }
        return fractions;
    }

    private static Fraction sum(Fraction[] fractions) {
        Fraction sum = fractions[0];
        for (int i = 1; i < fractions.length; i++) {
            sum = sum.add(fractions[i]);
        }
        return sum;
    }
}
