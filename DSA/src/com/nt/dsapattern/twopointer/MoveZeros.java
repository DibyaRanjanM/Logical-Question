package com.nt.dsapattern.twopointer;
/*
 * 
 * Move Zeroes
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("enter the Array element");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		MoveZeros mz = new MoveZeros();
		mz.moveZero(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

	public void moveZero(int[] nums) {
		int left = 0;
		for (int right = 0; right <= nums.length - 1; right++) {
			if (nums[right] != 0) {

				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}

		}
	}

}
