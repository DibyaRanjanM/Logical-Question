package com.nt.slidingwindow;
/*
 * 
 * Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
Note: A subarray is a contiguous part of any given array.

 */

public class SumOfSubArray {
	public static void main(String[] args) {

		SumOfSubArray obj = new SumOfSubArray();

		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		int result = obj.maxSubarraySum(arr, k);

		System.out.println("Maximum Sum = " + result);

	}

	public int maxSubarraySum(int[] arr, int k) {
		int n = arr.length;
		if (n < k) {
			return 0;
		}
		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + arr[i];
		}
		maxSum = windowSum;
		for (int i = k; i < n; i++) {
			windowSum = windowSum + arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
}
