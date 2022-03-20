package com.datastructure.algorithm.hw3_20001904_ViVanDo;

public class WordCountObject {
	private String word;
	private int count = 1;

	public WordCountObject(String word) {
		this.word = word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public boolean equals(WordCountObject o) {
		return word.equals(o.getWord());
	}
	
	
	public boolean hasCount() {
		return count == -1;
	}
	
	public void count() {
		count++;
	}
	
	public void hadCount() {
		count = -1;
	}
	
	public void printCount() {
		if(count != - 1) {
			System.out.println(word + ": " + count);
		}
	}
}
