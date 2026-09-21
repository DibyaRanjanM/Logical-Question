package com.nt.kadanealgorithm;

/*
 * Maximum Subarray
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 
 */
public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaximumSubarray obj = new MaximumSubarray();
		int result = obj.maxSubArray(nums);
		System.out.println("Maximum subarray sum: " + result);

	}

	public int maxSubArray(int[] nums) {
		int currentSum = nums[0];
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int currenSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currenSum);
		}
		return maxSum;
	}

}
