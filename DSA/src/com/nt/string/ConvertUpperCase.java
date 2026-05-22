package com.nt.string;
/*
 * 
 * Convert a string to uppercase without using upper().
 */

import java.util.Scanner;

public class ConvertUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetre the string");
		String nextLine = sc.nextLine();
		upperCase(nextLine);
		sc.close();

	}

	public static void upperCase(String str) {
//		String upperCase = str.toUpperCase();
//		System.out.println(upperCase);
		String result = " ";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			result = result + ch;
		}
		System.out.println(result);
	}

}
