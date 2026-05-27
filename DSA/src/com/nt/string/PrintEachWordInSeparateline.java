package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Print each word of a sentence on a separate line.
 */

public class PrintEachWordInSeparateline {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String line = sc.nextLine();
		separateLine(line);
		sc.close();

	}

	public static void separateLine(String str) {
		int length = str.length() - 1;
		for (int i = 0; i <= length; i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				System.out.print("\n");
			} else {
				System.out.print(c);
			}
		}

	}

}
