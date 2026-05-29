package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Remove all duplicate characters from a string, keeping the first occurrence.
 */

public class RemoveAllDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		duplicateCharacter(nextLine);
		sc.close();

	}

	public static void duplicateCharacter(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			boolean isDuplicate = false;
			char c = str.charAt(i);
			for (int j = 0; j < i; j++) {
				if (c == str.charAt(j)) {
					isDuplicate = true;
					break;

				}

			}
			if (!isDuplicate) {
				System.out.print(c);
			}
		}

	}

}
