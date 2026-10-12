package com.nt.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		// Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?

		/*
		 * When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; and int[]
		 */
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));

		/*
		 * When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; and return
		 * type is list
		 */
		int[] arr1 = { 10, 15, 8, 49, 25, 98, 32 };
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr1).boxed()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(collect);

		// 2-Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
