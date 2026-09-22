package com.nt.array;
//Add remove duplicates from sorted array
public class RemoveDuplicatreFromSortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3 };
		RemoveDuplicatreFromSortedArray rd = new RemoveDuplicatreFromSortedArray();
		int removeDuplicate = rd.removeDuplicate(arr);
		System.out.println(removeDuplicate);
		for (int i = 0; i < removeDuplicate; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public int removeDuplicate(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {

			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;

	}

}
