package com.datastructure.algorithm.hw3_20001904_ViVanDo;

public class SimpleArrayListDemo {
    public static void main(String[] args) {
        SimpleArrayList<String> arrayList = new SimpleArrayList<>();
        arrayList.add("abc");
        arrayList.add("test");
		arrayList.add("test");
        arrayList.add("cba");
		arrayList.add("test");
		
        arrayList.remove("test");
        System.out.println(arrayList.toString());
    }
}
