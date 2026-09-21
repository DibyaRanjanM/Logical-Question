package com.nt.kadanealgorithm;
/*
 * 
 * 
 * Maximum Product Subarray
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

public class MaximumProductSubarray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaximumProductSubarray obj = new MaximumProductSubarray();
		int result = obj.maxProduct(nums);
		System.out.println("Maximum subarray sum: " + result);

	}

	public int maxProduct(int[] nums) {
		int minEnd = nums[0];
		int maxEnd = nums[0];
		int res = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int v1 = nums[i];
			int v2 = minEnd * nums[i];
			int v3 = maxEnd * nums[i];
			int newMax = Math.max(v1, Math.max(v2, v3));
			int newMin = Math.min(v1, Math.min(v2, v3));
			maxEnd = newMax;
			minEnd = newMin;
			res = Math.max(res, maxEnd);
		}
		return res;

	}
}
