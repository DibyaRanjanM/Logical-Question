package com.nt.dsapattern.twopointer;
/*
 * 
 * 
 * Longest Palindromic Substring
Attempted
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

import java.util.Scanner;

public class LongestPollindromicSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();
		LongestPollindromicSubstring l = new LongestPollindromicSubstring();
		String longestPalindrome = l.longestPalindrome(nextLine);
		System.out.println(longestPalindrome);

	}

	public String longestPalindrome(String s) {

		String ans = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			String odd = expand(s, i, i);
			String even = expand(s, i, i + 1);
			if (odd.length() > ans.length()) {
				ans = odd;
			}
			if (even.length() > ans.length()) {
				ans = even;
			}
		}
		return ans;

	}

	public static String expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;

		}

		return s.substring(left + 1, right);

	}

}
