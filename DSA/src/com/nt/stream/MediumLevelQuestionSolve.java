package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class MediumLevelQuestionSolve {
	public static void main(String[] args) {
		// 1.Write a program to find the sum of all elements in a list using Java Stream
		// API
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(n -> n).sum();
		System.out.println(sum);
		
	}

}
