package com.nt.list;

public class Pallindrome {
	public static void main(String[] args) {

	}

	public static String paliindrome(int num) {
		String number = String.valueOf(num);
		int left = 0;
		int right = number.length() - 1;
		while (left < right) {
			if (number.charAt(left) != number.charAt(right)) {
				return "not Paallindrome";
			}
			left++;
			right--;

		}
		return "pallindrome";

	}

}
