package com.nt.array;

//2nd Largest
public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 3 };
		SecondLargest la = new SecondLargest();
		la.secondLargest(arr);

	}

	public void secondLargest(int[] arr) {
		int largest = arr[0];
		int sLargest = -1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > largest) {
				sLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > sLargest) {
				sLargest = arr[i];
			}

		}
		System.out.println(sLargest);

	}

}
