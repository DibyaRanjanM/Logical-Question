package com.nt.array;

public class ArraySortedorNot {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 0, 5 };
		ArraySortedorNot ar = new ArraySortedorNot();
		boolean sorted = ar.isSorted(arr);
		System.out.println(sorted);

	}

	public boolean isSorted(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return true;
			} else {
				return false;
			}
		}
		return true;

	}

}
