package com.datastructure.algorithm.hw3_20001904_ViVanDo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.*;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int defaultSize = 100;
    private int n = 0;


    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        defaultSize = capacity;
        array = (T[]) new Object[defaultSize];
    }
	
	public SimpleArrayList(T[] array) {
		this.array = array;
		n = array.length;
	}
	

    @Override
    public void add(T data) {
        if (n >= array.length) {
            defaultSize++;
            array = Arrays.copyOf(array, defaultSize);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                n++;
                break;
            }
        }
    }

    @Override
    public T get(int i) {
        if (i >= n) {
            return null;
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        array[i] = data;
    }

    @Override
    public void remove(T data) {
		if (isEmpty()) {
			return;
		}
		
		while(isContain(data)) {
			for(int i = 0; i < n; i++) {
				if(array[i].equals(data)) {
					remove(i);
					break;
				}
			}
		}
		
    }
	
	
	public void remove(int index) {
		T[] head = Arrays.copyOfRange(array, 0, index);
		T[] tail = Arrays.copyOfRange(array, index + 1, array.length);
		
		for(int i = 0; i < n - 1; i++) {
			if(i < head.length) {
				array[i] = head[i];
			} else {
				array[i] = tail[i - head.length];
			}
		}
		n--;
	}

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        if (array == null) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        array = Arrays.copyOf(array, n);
		Iterator<T> iterator = Arrays.stream(array).iterator();
		return iterator;
    }
	
	@Override
	public Spliterator<T> spliterator()
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		array = Arrays.copyOf(array, n);
		return Arrays.toString(array);
	}
}
