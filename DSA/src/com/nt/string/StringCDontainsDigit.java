package com.nt.string;

import java.util.Scanner;

/*
 * 
 * 
 * Check if a string contains only digits
 */
public class StringCDontainsDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr the String");
		String nextLine = sc.nextLine();
		StringCDontainsDigit st = new StringCDontainsDigit();
		boolean containsDigit = st.containsDigit(nextLine);
		System.out.println(containsDigit);
		sc.close();
	}

	public boolean containsDigit(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;

	}

}
