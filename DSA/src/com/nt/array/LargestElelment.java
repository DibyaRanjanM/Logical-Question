package com.nt.array;

//largest number in aarray
public class LargestElelment {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 3 };
		LargestElelment la = new LargestElelment();
		la.largestElement(arr);

	}

	public void largestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}

		System.out.println(largest);
	}

}
