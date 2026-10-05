package com.nt.stream.array;

import java.util.Arrays;

public class StreamArray {

	public static void main(String[] args) {
		// Write a Program to find the Maximum element in an array?
		int arr[] = { 5, 1, 2, 8 };
		int asInt = Arrays.stream(arr).max().getAsInt();
		System.out.println(asInt);

	}

}
