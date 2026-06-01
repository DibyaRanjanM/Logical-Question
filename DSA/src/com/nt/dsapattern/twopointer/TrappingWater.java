package com.nt.dsapattern.twopointer;

import java.util.Scanner;

/*
 * 
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 *  compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */

public class TrappingWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the Element");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		TrappingWater tw = new TrappingWater();
		int trap = tw.trap(arr);
		System.out.println(trap);
		sc.close();

	}

	public int trap(int[] height) {
		int water = 0;
		int left = 0;
		int right = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		while (left < right) {
			leftMax = Math.max(leftMax, height[left]);
			rightMax = Math.max(rightMax, height[right]);

			if (leftMax < rightMax) {
				water = water + leftMax - height[left];
				left++;
			} else {
				water = water + rightMax - height[right];
				right--;

			}

		}
		return water;

	}
}
