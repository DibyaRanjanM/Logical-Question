package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Capitalize the first letter of every word in a sentence (Title Case) without using title().
 */

public class CapitalTitleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		capitalCase(nextLine);
		sc.close();

	}

	public static void capitalCase(String str) {
		String result = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (i == 0) {
				result = result + Character.toUpperCase(c);
			} else if (str.charAt(i - 1) == ' ') {
				result = result + Character.toUpperCase(c);

			} else {
				result = result + c;
			}

		}
		System.out.println(result);
	}

}
