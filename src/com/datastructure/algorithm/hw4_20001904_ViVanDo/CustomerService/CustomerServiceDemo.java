package com.datastructure.algorithm.hw4_20001904_ViVanDo.CustomerService;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class CustomerServiceDemo {
    public static void main(String[] args) {
        final int n = 3;
        Queue<Customer> customers = new ArrayDeque<>();
        ArrayList<Teller> tellers = new ArrayList<>();
        initCustomer(customers, n);
        initTeller(tellers, n);

        System.out.println("Start Status: " + customers);

        for (int i = 0; i < n; i++) {
            if (tellers.get(i).isFree()) {
                tellers.get(i).service(customers.poll());
                System.out.println("teller " + i + ": " + customers);
            }
        }

    }

    private static void initTeller(ArrayList<Teller> tellers, int n) {
        for (int i = 0; i < n; i++) {
            tellers.add(new Teller(true));
        }
    }

    private static void initCustomer(Queue<Customer> customers, int n) {
        int length = new Random().nextInt(n, n + 5);
        for (int i = 0; i < length; i++) {
            int timeToService = new Random().nextInt(10, 20);
            customers.offer(new Customer(i, timeToService));
        }
    }
}
