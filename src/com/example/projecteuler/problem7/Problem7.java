/*
 * Author: Prtish Shah
 * Date: 02-06-14
 * Version: 1.0
 * Description: 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
package com.example.projecteuler.problem7;

import java.util.SortedSet;
import java.util.TreeSet;

public class Problem7 {

	public int findPrimeNumbers(int num) {
		SortedSet<Integer> primeFactors = new TreeSet<>();
		int range =2;
		while(primeFactors.size() < num)
		{
			//System.out.println(range);
			int temp = range;
			for (int i = 2; i <= range / i; i++) {
				while (range % i == 0 ) {
					primeFactors.add(i);
					range = range / i;
				}
			}
			if (range > 1) {
				primeFactors.add(range);
			}
			range = temp + 1;
		}
		//System.out.println(primeFactors);
		return primeFactors.last();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem7 pb7 = new Problem7();
		System.out.println("Prime Number:" + pb7.findPrimeNumbers(6));
		System.out.println("Prime Number:" + pb7.findPrimeNumbers(10001));

	}

}
