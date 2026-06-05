package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Check if a string is a valid pangram (contains every letter of the alphabet at least once).
 */
public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		Pangram pm = new Pangram();
		boolean validPangram = pm.validPangram(nextLine);
		System.out.println(validPangram);
		sc.close();

	}

	public boolean validPangram(String str) {
		str = str.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1) {
				return false;

			}

		}
		return true;

	}

}
