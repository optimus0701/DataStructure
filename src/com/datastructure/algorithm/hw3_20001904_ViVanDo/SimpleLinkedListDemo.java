package com.datastructure.algorithm.hw3_20001904_ViVanDo;

public class SimpleLinkedListDemo {
	public static void main(String[] args) {
		SimpleLinkedList<String> linkedList = new SimpleLinkedList<>();
		
		linkedList.add("abc3");
		linkedList.add("abc2");
		linkedList.add("abc1");
		linkedList.add("abc0");
		linkedList.addBot("abc4");
		linkedList.addBot("abc5");
		linkedList.addBot("abc6");
		
		linkedList.remove("abc3");
		linkedList.removeTop();
		linkedList.removeBot();
		
		System.out.println(linkedList);
	}
}
