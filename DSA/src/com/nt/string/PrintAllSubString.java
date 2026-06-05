package com.nt.string;

import java.util.Scanner;

/*
 * 
 * 
 * Print all substrings of a string of length exactly 3.
 */
public class PrintAllSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Striing ");
		String nextLine = sc.nextLine();
		PrintAllSubString pal = new PrintAllSubString();
		pal.subString(nextLine);

		sc.close();

	}

	public void subString(String str) {
		for (int i = 0; i <= str.length() - 3; i++) {

			System.out.println(str.substring(i, i + 3));

		}

	}

}
