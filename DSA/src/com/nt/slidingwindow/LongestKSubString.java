package com.nt.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
Constraints:
1 ≤ s.size() ≤ 105
1 ≤ k ≤ 26

Expected Complexities
Company Tags
AmazonGoogleSAP Labs
 */

public class LongestKSubString {
	public static void main(String[] args) {
		LongestKSubString obj = new LongestKSubString();

		String s = "aabacbebebe";
		int k = 3;

		int result = obj.longestKSubString(s, k);

		System.out.println(result);

	}

	public int longestKSubString(String s, int k) {
		int length = s.length();
		int low = 0;
		int res = -1;
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int high = 0; high < length; high++) {
			char c = s.charAt(high);
			freq.put(c, freq.getOrDefault(c, 0) + 1);

			while (freq.size() > k) {
				char leftChar = s.charAt(low);
				freq.put(leftChar, freq.get(leftChar) - 1);
				if (freq.get(leftChar) == 0)
					freq.remove(leftChar);
				low++;

			}
			if (freq.size() == k) {
				res = Math.max(res, high - low + 1);
			}
		}
		return res;

	}

}
