package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Check whether a given string is a palindrome
 */
public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");

		String nextLine2 = sc.nextLine();
		Pallindrome pd = new Pallindrome();
		pd.pallindrome(nextLine2);
		sc.close();

	}

	public void pallindrome(String str) {
		String reverse = "";
		int lenght = str.length() - 1;
		for (int i = lenght; i >= 0; i--) {
			// System.out.println(str.charAt(i));
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println(str + " is Pallindrome" + reverse);
		} else {
			System.out.println(str + " is not a pollindrome " + reverse);
		}

	}

}
