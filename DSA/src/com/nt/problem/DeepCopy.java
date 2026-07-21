package com.nt.problem;
/*
 * 
 * Problem Statement: Write a program to implement a deep copy of a class with a nested object (e.g., an array). Modify the copied object and show that the original remains unchanged. Return the modified array's sum.
Example: Input: [1, 2, 3] (modify to [4, 5, 6]) → Output: 15
Constraints: 1 <= arr.length <= 10^4.
 */

public class DeepCopy {
	int arr[];

	public DeepCopy(int[] arr) {
		super();
		this.arr = arr;
	}

	public DeepCopy(DeepCopy deep) {
		super();
		this.arr = new int[deep.arr.length];
		for (int i = 0; i < deep.arr.length; i++) {
			this.arr[i] = deep.arr[i];
		}
	}

}
