package com.nt.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Check if two strings are anagrams of each other.
(Anagram: same letters, different order — e.g. 'listen' and 'silent')
 */

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ist String");
		String string = sc.nextLine();
		System.out.println("entret ythe 2nd Stringt");
		String nextLine = sc.nextLine();
		anagram(string, nextLine);
		sc.close();

	}

	public static void anagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		System.out.println("1");
		str2 = str2.toLowerCase();
		System.out.println("2");
		if (str1.length() != str2.length()) {
			System.out.println("3");
			System.out.println("Not Anagram");
		}
		System.out.println("4");
		char[] cs = str1.toCharArray();
		System.out.println("5");
		char[] cs2 = str2.toCharArray();
		System.out.println("6");
		Arrays.sort(cs);
		System.out.println("7");
		Arrays.sort(cs2);
		System.out.println("8");
		if (Arrays.equals(cs, cs2)) {
			System.out.println("Strings are Anagrams");
		} else {
			System.out.println("Strings are not Anagrams");
		}

	}

}
