package com.nt.dsapattern.twopointer;

import java.util.Scanner;

/*
 * Reverse Words in a String
Medium
Topics
premium lock icon
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * 
 * 
 * 
 */

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String nextLine = sc.nextLine();
		ReverseWord rw = new ReverseWord();
		String reverse = rw.reverse(nextLine);
		System.out.println(reverse);
		sc.close();

	}

	public String reverse(String s) {

		StringBuilder sb = new StringBuilder();

		int right = s.length() - 1;

		while (right >= 0) {

			// Skip spaces
			while (right >= 0 && s.charAt(right) == ' ') {
				right--;
			}

			if (right < 0) {
				break;
			}

			int left = right;

			// Find beginning of word
			while (left >= 0 && s.charAt(left) != ' ') {
				left--;
			}

			sb.append(s.substring(left + 1, right + 1));

			if (left > 0) {
				sb.append(" ");
			}

			right = left - 1;
		}

		return sb.toString().trim();
	}

}
