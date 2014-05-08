/*
 * Author: Prtish Shah
 * Date: 02-12-14
 * Version: 1.0
 * Description: 
 
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
package com.example.projecteuler.problem14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author pshah
 * 
 */
public class Problem14 {

	public static void main(String[] args) {
		int chainLength = 0;
		int maxChain = 0;
		int MaxNum = 0;
		for (int i = 2; i < 1000000; i++) {
			chainLength = chainCounter(i);
			if (chainLength > maxChain) {
				maxChain = chainLength;
				MaxNum = i;
			}
		}
		System.out.println(MaxNum);
	}

	public static int chainCounter(long a) {
		int count = 0;
		while (a != 1) {
			if (a % 2 == 0) {
				a = a / 2;
			} else {
				a = 3 * a + 1;
			}
			count++;
		}
		return count;
	}

}
