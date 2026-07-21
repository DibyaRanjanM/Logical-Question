package com.nt.problem;
/*
 * 
 * Problem Statement: Write a program to implement a deep copy of a class with a nested object (e.g., an array). Modify the copied object and show that the original remains unchanged. Return the modified array's sum.
Example: Input: [1, 2, 3] (modify to [4, 5, 6]) → Output: 15
Constraints: 1 <= arr.length <= 10^4.
 */

public class DeepCopyDemo {
	public static void main(String[] args) {
		DeepCopy original = new DeepCopy(new int[] { 1, 2, 3 });

		DeepCopy copied = new DeepCopy(original);
		copied.arr[0] = 6;
		copied.arr[1] = 7;
		copied.arr[2] = 8;
		System.out.println("Original");
		for (int n : original.arr) {
			System.out.println(n + " ");

		}
		System.out.println("Copied");
		for (int n1 : copied.arr) {
			System.out.println(n1 + " ");
		}
		System.out.println();
		int sum = 0;
		for (int n : copied.arr) {
			sum = sum + n;
		}
		System.out.println(sum + " sum is this ");
	}

}
