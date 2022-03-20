package com.datastructure.algorithm.hw4_20001904_ViVanDo.CustomerService;

public class Teller {
    private boolean isFree;
    private int numOfCus;
    private Customer customer;
    public Teller(boolean isFree) {
        this.isFree = isFree;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void service(Customer customer) {
        isFree = false;
        numOfCus++;
        this.customer = customer;
    }

    public int getNumOfCus() {
        return numOfCus;
    }
}
