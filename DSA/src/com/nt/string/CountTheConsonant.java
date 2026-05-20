package com.nt.string;
/*
 * 
 * Count the number of consonants in a string.
 */

public class CountTheConsonant {
	public static void main(String[] args) {
		String str = "Roshan";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
					&& ch != 'o' && ch != 'u') {
				System.out.println(ch);
				count++;
			}
			

		}
		System.out.println(count);

	}
}