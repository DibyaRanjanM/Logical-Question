package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Remove all spaces from a string without using replace().
 */

public class RemoveSpaceFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();

		replaceSpace(nextLine);
		sc.close();

	}

	public static void replaceSpace(String str) {
		String result =

				"";
		int length = str.length() - 1;
		for (int i = 0; i <= length; i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				result = result + ch;

			}
		}
		System.out.println(result);

	}

}
