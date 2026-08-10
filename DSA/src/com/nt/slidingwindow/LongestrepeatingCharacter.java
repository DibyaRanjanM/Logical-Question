package com.nt.slidingwindow;

/*
 * 
 * 424. Longest Repeating Character Replacement
Solved
Medium
Topics
premium lock icon
Companies
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 * 
 */
public class LongestrepeatingCharacter {
	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;

		System.out.println(characterReplacement(s, k));
	}

	public static int characterReplacement(String s, int k) {
		int length = s.length();
		int[] freq = new int[256];
		int left = 0;
		int result = 0;
		for (int right = 0; right < length; right++) {
			freq[s.charAt(right)]++;
			int maxCount = findMax(freq);
			int len = right - left + 1;
			int diff = len - maxCount;

			while (diff > k) {
				freq[s.charAt(left)]--;
				left++;
				maxCount = findMax(freq);
				len = right - left + 1;
				diff = len - maxCount;
			}
			result = Math.max(result, right - left + 1);
		}
		return result;

	}

	public static int findMax(int[] freq) {
		int maxCount = -1;
		for (int i = 0; i < 256; i++) {
			maxCount = Math.max(maxCount, freq[i]);
		}
		return maxCount;
	}
}