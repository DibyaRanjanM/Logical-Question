package com.nt.string;

import java.util.Scanner;

/*
 * 
 * Count the frequency of each word in a sentence and print word: count pairs.
 */
public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String nextLine = sc.nextLine();

		FrequencyOfEachCharacter fo = new FrequencyOfEachCharacter();
		fo.frequency(nextLine);
		sc.close();

	}

	public void frequency(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			int coun = 0;
			for (int j = 0; j <= str.length() - 1; j++) {
				if (str.charAt(j) == c) {
					coun++;
				}

			}
			System.out.println(c + ":" + coun);
		}

	}

}
