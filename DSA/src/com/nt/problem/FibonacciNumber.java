package com.nt.problem;

public class FibonacciNumber {
	public static void main(String[] args) {
		int num = 17;
		int fibonacci = FibonacciNumber.fibonacci(num);
		System.out.println(fibonacci);

	}

	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		int first = 0;
		int second = 1;
		int current = 0;
		for (int i = 2; i <= num; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		return current;
	}

}
