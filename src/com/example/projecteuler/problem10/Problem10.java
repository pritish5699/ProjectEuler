/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
package com.example.projecteuler.problem10;

import java.util.SortedSet;
import java.util.TreeSet;

public class Problem10 {

	public double findSumofPrimeNumbers(int num) {

		SortedSet<Double> primeFactors = new TreeSet<Double>();
		double range = 2;
		while (range < num) {
			double temp = range;
			for (double i = 2; i <= range / i; i++) {
				while (range % i == 0) {
					primeFactors.add(i);
					range = range / i;
				}
			}
			if (range > 1) {
				primeFactors.add(range);
			}
			range = temp + 1;
		}
		double sum = 0;
		//System.out.println(primeFactors);
		for (double i: primeFactors) {
			sum += i;
		}
		//System.out.println(temp[i]);
		return sum;
	}

	public static void main(String[] args) {
		Problem10 pb10 = new Problem10();
		System.out.printf("Number: %.0f\n", pb10.findSumofPrimeNumbers(2000000));

	}

}
