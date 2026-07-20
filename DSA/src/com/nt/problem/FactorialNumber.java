package com.nt.problem;

public class FactorialNumber {
	public static void main(String[] args) {
		int num = 4;
		long factorial = FactorialNumber.factorial(num);
		System.out.println(factorial);

	}

	public static long factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;

		}
		return fact;

	}

}
