package com.nt.kadanealgorithm;

public class MiniMumSubArray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MiniMumSubArray obj = new MiniMumSubArray();
		int result = obj.minSubArray(nums);
		System.out.println("Maximum subarray sum: " + result);

	}

	public int minSubArray(int[] nums) {
		int currentSum = nums[0];
		int minSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.min(nums[i], currentSum + nums[i]);
			minSum = Math.min(minSum, currentSum);
		}
		return minSum;

	}

}
