package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Reverse each word in a sentence individually and print the result.
Input: 'Hello World' ® Output: 'olleH dlroW'
 */
public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the string");
		String nextLine = sc.nextLine();
		reverseEachWord(nextLine);
		sc.close();

	}

	public static void reverseEachWord(String str) {
		String[] split = str.split(" ");
		for (String word : split) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");

		}

	}

}
