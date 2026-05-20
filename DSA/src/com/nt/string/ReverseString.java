package com.nt.string;

/*
 * 
 * 
 * Reverse a string without using slicing or reversed().
 */
public class ReverseString {
	public static void main(String[] args) {
		String str = "Roshan";
		int length = str.length() - 1;

		for (int i = length; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");

		}

	}

}
