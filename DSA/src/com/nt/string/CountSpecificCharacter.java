package com.nt.string;
/*
 * 
 * Count how many times a specific character appears in a string.
 */

import java.util.Scanner;

public class CountSpecificCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		System.out.println("Enter teh Character");
		String next = sc.next();

		specificCharacter(nextLine, next.charAt(0));
		sc.close();

	}

	public static void specificCharacter(String str, char target) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == target)

			{
				count++;
			}
		}
		System.out.println(count);
	}

}
