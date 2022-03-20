package com.datastructure.algorithm.hw2_20001904_ViVanDo;

public class MyObjectForSort<T> implements Comparable<T> {
    private T value;

    public MyObjectForSort(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }



    @Override
    public int compareTo(T object) {
        if (value instanceof Integer) {
            return ((Integer) value).compareTo((Integer) object);
        }
        if (value instanceof Double) {
            return ((Double) value).compareTo((Double) object);
        }
        if (value instanceof Float) {
            return ((Float) value).compareTo((Float) object);
        }
        if (value instanceof String) {
            return ((String) value).compareTo((String) object);
        }
        return 0;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
