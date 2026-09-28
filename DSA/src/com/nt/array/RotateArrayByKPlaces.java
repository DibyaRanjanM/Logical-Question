package com.nt.array;
/*
 * 
 * Left Rotate Array by K Places
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.

Example 1:
Input: nums = [1, 2, 3, 4, 5, 6], k = 2

Output: nums = [3, 4, 5, 6, 1, 2]

Explanation:

rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

Example 2:
Input: nums = [3, 4, 1, 5, 3, -5], k = 8

Output: nums = [1, 5, 3, -5, 3, 4]

Explanation:

rotate 1 step to the left: [4, 1, 5, 3, -5, 3]

rotate 2 steps to the left: [1, 5, 3, -5, 3, 4]

rotate 3 steps to the left: [5, 3, -5, 3, 4, 1]

rotate 4 steps to the left: [3, -5, 3, 4, 1, 5]

rotate 5 steps to the left: [-5, 3, 4, 1, 5, 3]

rotate 6 steps to the left: [3, 4, 1, 5, 3, -5]

rotate 7 steps to the left: [4, 1, 5, 3, -5, 3]

rotate 8 steps to the left: [1, 5, 3, -5, 3, 4]
 */

public class RotateArrayByKPlaces {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 2;

		RotateArrayByKPlaces s = new RotateArrayByKPlaces();
		s.rotateArray(arr, k, arr.length);

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public void rotateArray(int num[], int d, int size) {
		d = d % size;
		reverse(num, 0, d - 1);
		reverse(num, d, size - 1);
		reverse(num, 0, size - 1);

	}

	public void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
