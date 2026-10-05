package com.nt.stream.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamArray {

	public static void main(String[] args) {
		// Write a Program to find the Maximum element in an array?
		int arr[] = { 5, 1, 2, 8 };
		int asInt = Arrays.stream(arr).max().getAsInt();
		System.out.println(asInt);

		// Write a program to print the count of each character in a String?
		String str = "Now is the winter";
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

	}

}
