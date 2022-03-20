package com.datastructure.algorithm.hw3_20001904_ViVanDo;

import org.w3c.dom.*;
import java.util.*;

public class SimpleLinkedList<T> {
	class Node {
		T data;
		Node next;
		
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node top = null;
	private Node bot = null;
	private int n = 0;
	
	public void add(T data) {
		n++;
		Node node = new Node(data);
		if(isEmpty()) {
			top = node;
			bot = node;
		} else {
			Node temp = top;
			top = node;
			top.next = temp;
			
		}
	}
	
	public void addBot(T data) {
		n++;
		Node node = new Node(data);
		if(isEmpty()) {
			top = node;
			bot = node;
		} else {
			bot.next = node;
			bot = node;
		}
	}
	
	public T get(int i) {
		if (i == 0) {
			return top.data;
		} else if (i == n - 1) {
			return bot.data;
		} else if (i > n) {
			return null;
		} else {
			Node temp = top;
			for(int j = 0; j < i; j++){
				temp = temp.next;
			}
			return temp.data;
		}
	}
	
	public void set(int i, T data) {
		if (i == 0) {
			top.data = data;
		} else if (i == (n - 1)) {
			bot.data = data;
		} else {
			Node temp = top;
			for(int j = 0; j < i; j++){
				temp = temp.next;
			}
			temp.data = data;
		}
	}
	
	public boolean isContain(T data) {
		if (bot.data == data) {
			return true;
		} else {
			Node temp = top;
			while (temp != bot) {
				if(temp.data.equals(data)) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}
	}
	
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}
	
	public T removeTop() {
		n--;
		top = top.next;
		return top.data;
	}
	
	public T removeBot() {
		T result = bot.data;
		n--;
		Node temp = top;
		for(int i = 0; i < n - 1; i++) {
			temp = temp.next;
		}
		bot = new Node(temp.data);
		return result;
	}
	
	public void remove(T data) {
		if(top.data == data) {
			removeTop();
		} else if(bot.data == data) {
			removeBot();
		} else {
			n--;
			Node temp = top;
			for(int i = 1; i < n; i++) {
				if(temp.next.data.equals(data)) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}
	
	
	public T getTop() {
		return top.data;
	}
	
	public T getBot() {
		return bot.data;
	}
	

	@Override
	public String toString()
	{
		// TODO: Implement this method
		StringBuffer result = new StringBuffer("[");
		result.append(top.data).append(",");
		Node temp = top;
		for(int i = 0; i < n - 2; i++) {
			temp = temp.next;
			result.append(temp.data).append(",");
		}
		
		result.append(temp.next.data).append("]");
		
		return result.toString();
	}
	
	
}
