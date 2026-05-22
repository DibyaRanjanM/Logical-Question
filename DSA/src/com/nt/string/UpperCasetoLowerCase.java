package com.nt.string;

import java.util.Scanner;

public class UpperCasetoLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String nextLine = sc.nextLine();
		loweCase(nextLine);
		sc.close();
	}

	public static void loweCase(String str) {
		String result = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		System.out.println(result);
	}

}
