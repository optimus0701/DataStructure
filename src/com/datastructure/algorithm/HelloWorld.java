package com.datastructure.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("cba");
        arrayList.remove(1);
        System.out.println(arrayList.get(2));
    }
}
