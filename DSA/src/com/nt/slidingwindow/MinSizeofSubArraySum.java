package com.nt.slidingwindow;

/*
 * 
 * Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.
 */

public class MinSizeofSubArraySum {
	public static void main(String[] args) {

		MinSizeofSubArraySum obj = new MinSizeofSubArraySum();

		int target = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };

		int result = obj.minSubArrayLen(target, nums);

		System.out.println("Minimum Length = " + result);
	}

	public int minSubArrayLen(int target, int[] nums) {
		int n = nums.length;
		int left = 0, sum = 0;
		int minLen = Integer.MAX_VALUE;

		for (int right = 0; right < n; right++) {
			sum += nums[right];

			// shrink window while sum >= target
			while (sum >= target) {
				minLen = Math.min(minLen, right - left + 1);
				sum -= nums[left];
				left++;
			}
		}

		return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
	}
}