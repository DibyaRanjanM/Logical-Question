package com.nt.string;

import java.util.Scanner;

/*
 * 
 * 
 * Find and print the most frequently occurring character in a string.
 */

public class MostFrequesntOccouringCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String nextLine = sc.nextLine();
		frequentOccour(nextLine);

	}

	public static void frequentOccour(String str) {

		int maxCount = 0;
		char maxCharacter = ' ';
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			int count = 0;
			for (int j = 0; j <= str.length() - 1; j++) {
				if (c == str.charAt(j)) {
					count++;

				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxCharacter = c;
			}

		}
		System.out.println(maxCharacter);
		System.out.println(maxCount);
	}

}
