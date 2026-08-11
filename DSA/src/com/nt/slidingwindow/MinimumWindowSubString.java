package com.nt.slidingwindow;
/*
 * 
 * 
 * Minimum Window Substring
Solved
Hard
Topics
premium lock icon
Companies
Hint
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
 

Follow up: Could you find an algorithm that runs in O(m + n) time?
 */

//*****AMAZON INTERVIEW QUESTION
public class MinimumWindowSubString {
	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		MinimumWindowSubString obj = new MinimumWindowSubString();

		String result = obj.minWindow(s, t);

		System.out.println(result);

	}

	public String minWindow(String s, String t) {
		if (s.length() == 0 || t.length() == 0)
			return " ";
		int[] freq = new int[128];
		for (char c : t.toCharArray()) {
			freq[c]++;
		}
		int left = 0;
		int right = 0;
		int required = t.length();
		int minLen = Integer.MAX_VALUE;
		int start = 0;
		while (right < s.length()) {
			char r = s.charAt(right);
			if (freq[r] > 0) {
				required--;
			}
			freq[r]--;
			right++;
			while (required == 0) {
				if (right - left < minLen) {
					minLen = right - left;
					start = left;
				}

				char l = s.charAt(left);

				freq[l]++;

				if (freq[l] > 0) {
					required++;
				}

				left++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

	}
}
