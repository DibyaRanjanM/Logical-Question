package com.nt.string;
/*
 * Count the number of vowels in a string.
 */

public class CountTheVowel {
	public static void main(String[] args) {
		String str = "Dibya";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			// char ch = str.charAt(i);
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U')
			{
				count++;
			}
		}
		System.out.println("Number of Vowel " + count);
	}

}
