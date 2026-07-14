package com.nt.list;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int index = 4;
		System.out.println(isOutofBound(arr, index));

	}

	public static int isOutofBound(int[] nums, int index) {
		try {
			return nums[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return -1;
		}

	}

}
