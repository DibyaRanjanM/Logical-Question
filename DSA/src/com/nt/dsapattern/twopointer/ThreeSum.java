package com.nt.dsapattern.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ThreeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Array size");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the Array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ThreeSum ts = new ThreeSum();
		List<List<Integer>> threeSum = ts.threeSum(arr);
		System.out.println(threeSum);
		sc.close();

	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}

		}

		return ans;

	}

}
