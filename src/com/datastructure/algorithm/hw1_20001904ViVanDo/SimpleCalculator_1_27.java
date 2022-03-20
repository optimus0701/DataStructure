package com.datastructure.algorithm.hw1_20001904ViVanDo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCalculator_1_27 {
    // Exercise 5(P-1.27)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculate");
        System.out.println("operator: [+], [-], [*], [/]");
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String[] numbers = input.split("[+-/*]");
        String[] operators = input.split("[^+-/*]");

        ArrayList<String> operatorArrayList = new ArrayList<>();
        for (String s : operators) {
            if (!s.isEmpty()) {
                operatorArrayList.add(s.trim());
            }
        }

        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();
        for (String s : numbers) {
            bigDecimals.add(new BigDecimal(s.trim()));
        }

        if (operatorArrayList.size() >= bigDecimals.size()) {
            System.out.println("Invalid input");
        } else {
            for (int i = 0; i < operatorArrayList.size(); i++) {
                switch (operatorArrayList.get(i)) {
                    case "*" -> {
                        bigDecimals.set(i, bigDecimals.get(i).multiply(bigDecimals.get(i + 1)));
                        operatorArrayList.remove(i);
                        bigDecimals.remove(i + 1);
                    }
                    case "/" -> {
                        bigDecimals.set(i, bigDecimals.get(i).divide(bigDecimals.get(i + 1)));
                        operatorArrayList.remove(i);
                        bigDecimals.remove(i + 1);
                    }
                }
            }

            BigDecimal results = bigDecimals.get(0);
            for (int i = 0; i < operatorArrayList.size(); i++) {
                switch (operatorArrayList.get(i)) {
                    case "+" -> {
                        results = results.add(bigDecimals.get(i + 1));
                    }
                    case "-" -> {
                        results = results.subtract(bigDecimals.get(i + 1));
                    }
                }
            }
            System.out.println(results);
        }
    }
}
