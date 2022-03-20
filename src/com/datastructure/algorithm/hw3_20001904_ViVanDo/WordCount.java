package com.datastructure.algorithm.hw3_20001904_ViVanDo;
import java.util.*;
import java.io.*;

public class WordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String para = input(scanner);
		String[] array = para.trim().split(" ");
		SimpleArrayList<WordCountObject> arrayList = count(array);
		for(WordCountObject wco : arrayList) {
			wco.printCount();
		}
	}

	private static SimpleArrayList<WordCountObject> count(String[] array) {
		// TODO: Implement this method
		SimpleArrayList<WordCountObject> arrayList = new SimpleArrayList<>();
		for(String s : array) {
			arrayList.add(new WordCountObject(s));
		}
		
		for(int i = 0; i < arrayList.size(); i++) {
			for(int j = i + 1; j < arrayList.size(); j++) {
				if(!arrayList.get(i).hasCount() && !arrayList.get(j).hasCount()) {
					if(arrayList.get(i).equals(arrayList.get(j))) {
						arrayList.get(i).count();
						arrayList.get(j).hadCount();
					}
				}
			}
		}
		return arrayList;
	}
	
	public static String input(Scanner scanner) {
		System.out.print("input paragraph: ");
		String paragraph = scanner.nextLine();
		return paragraph;
	}
	
	public static String readFileAsString(String path) {
		StringBuilder builder = new StringBuilder();
		
        try
		{
			BufferedReader buffer = new BufferedReader(new FileReader(path));
			String str;
			while ((str = buffer.readLine()) != null)
			{
				builder.append(str).append("\n");

			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
        return builder.toString();
	}
}
