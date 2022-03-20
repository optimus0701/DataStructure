package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.util.Scanner;

public class InputEx {
    // Exercise 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String strInput = scanner.nextLine();
        System.out.println("string input: " + strInput);
        try {
            System.out.print("Input a Long or integer number: ");
            strInput = scanner.nextLine();
            long iInput = Long.parseLong(strInput);
            System.out.println("integer input: " + iInput);

            System.out.print("Input a double or float number: ");
            strInput = scanner.nextLine();
            double dfInput = Double.parseDouble(strInput);
            System.out.println("double or float input: " + dfInput);

            System.out.print("Input a byte: ");
            byte bInput = scanner.nextByte();
            System.out.println("byte input: " + bInput);

            System.out.print("Input a boolean: ");
            boolean blInput = scanner.nextBoolean();
            System.out.println("boolean input: " + blInput);

        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }
    }
}
