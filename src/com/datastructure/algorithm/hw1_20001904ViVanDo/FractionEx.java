package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.util.Scanner;

public class FractionEx {
    // Exercise 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyFraction fraction1 = inputFraction(scanner);
        System.out.println(fraction1);

        MyFraction fraction2 = new MyFraction(6, 8);

        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2));
        System.out.println(fraction1 + " : " + fraction2 + " = " + fraction1.divide(fraction2));


        MyFraction[] array = new MyFraction[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = new MyFraction(1, 8);
        }

        System.out.println("add fractions: " + fraction1.add(array));
        System.out.println("subtract fractions: " + fraction1.subtract(array));
        System.out.println("multiply fractions: " + fraction1.multiply(array));
        System.out.println("divide fractions: " + fraction1.divide(array));

    }

    private static MyFraction inputFraction(Scanner scanner) {
        System.out.print("Input numerator(Integer): ");
        int numerator = scanner.nextInt();
        System.out.print("Input denominator(Integer): ");
        int denominator = scanner.nextInt();
        return new MyFraction(numerator, denominator);
    }
}
