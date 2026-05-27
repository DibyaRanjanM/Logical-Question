package com.nt.string;

import java.util.Scanner;

/*
 * Find and print the longest word in a given sentence.
 */
public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		longestWord(nextLine);
		sc.close();

	}

	public static void longestWord(String str) {
		String[] split = str.split(" ");
		String longest = " ";
		for (String word : split) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("longest word" + longest);
	}

}
