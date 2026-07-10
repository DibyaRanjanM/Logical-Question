
/*
 * 
 * Find the Index of the First Occurrence in a String
Easy
Topics
premium lock icon
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

package com.nt.dsapattern.twopointer;

import java.util.Scanner;

public class IndexofFirstOccouranceOfaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String nextLine = sc.nextLine();
		System.out.println("enter the 2nd String");
		String nextLine2 = sc.nextLine();
		IndexofFirstOccouranceOfaString ind = new IndexofFirstOccouranceOfaString();
		int firstIndex = ind.firstIndex(nextLine, nextLine2);
		System.out.println(firstIndex);
		sc.close();

	}

	public int firstIndex(String haystack, String needle) {
		int h = haystack.length();
		int n = needle.length();
		for (int i = 0; i <= h - n; i++) {
			int j = 0;
			while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;
			}
			if (j == n) {
				return i;
			}
		}
		return -1;
	}

}
