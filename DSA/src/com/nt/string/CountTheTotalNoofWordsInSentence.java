package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Count the total number of words in a sentence (split by spaces).
 */
public class CountTheTotalNoofWordsInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the senetence");
		String nextLine = sc.nextLine();
		totalNumberOfWords(nextLine);

	}

	public static void totalNumberOfWords(String str) {
		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
