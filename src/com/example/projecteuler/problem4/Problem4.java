/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
package com.example.projecteuler.problem4;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

	private boolean isPalindrome(String paliNum) {
		StringBuilder stBuilder = new StringBuilder(paliNum);
		/*
		 * System.out.println(stBuilder.reverse()); System.out.println(paliNum);
		 */
		return paliNum.equals(stBuilder.reverse().toString());
	}

	private int findLargestPalindrome() {
		ArrayList<Integer> answers = new ArrayList<Integer>();

		int number1 = 999;
		int number2 = 999;
		int product = 0;
		while (number1 > 100) {

			product = number1 * number2;
			if (isPalindrome(Integer.toString(product))) {
				answers.add(product);
			}

			if (number2 == 100) {
				number1--;
				number2 = number1;
			} else {
				number2--;
			}

		}

		Collections.sort(answers);
		for (int i = 0; i < answers.size(); i++) {
			System.out.println(answers.get(i));
		}
		return answers.get(answers.size() -1);
	}

	public static void main(String[] args) {
		Problem4 pb4 = new Problem4();
		System.out.println("Largest Prime Number by two 3-digit number: "
				+ pb4.findLargestPalindrome());

	}

}
