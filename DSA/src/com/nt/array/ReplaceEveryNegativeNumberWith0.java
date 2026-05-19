package com.nt.array;

import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * 
 * Replace every negative number in a list with 0.
 */
public class ReplaceEveryNegativeNumberWith0 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -3, 2, 6, -6, -1);

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				numbers.set(i, 0);
			}
		}
		System.out.println(numbers);

	}

}
