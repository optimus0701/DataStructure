package com.datastructure.algorithm.hw4_20001904_ViVanDo.CustomerService;

public class Customer {
    private int index;
    private int timeToService;

    public Customer(int index, int timeToService) {
        this.index = index;
        this.timeToService = timeToService;
    }

    public int getTimeToService() {
        return timeToService;
    }

    public void setTimeToService(int timeToService) {
        this.timeToService = timeToService;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "index=" + index +
                '}';
    }
}
