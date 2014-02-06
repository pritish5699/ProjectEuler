/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package com.example.projecteuler.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Problem5 {

	
	public int findSmallestPositive(int maxLimit) {
		HashMap<Integer, Integer> hash = findPrimeNumbers(maxLimit);
		
		for(int i=2; i<= maxLimit; i++)
		{
			int temp =i;
			for (Entry<Integer, Integer> e : hash.entrySet()) {
				int count =0;
				while(temp % e.getKey() ==0)
				{
					count++;
					temp = temp / e.getKey();
				}
				if(count > e.getValue())
					hash.put(e.getKey(), count);
			}
		}
		int smallestNum = 1;
		for (Entry<Integer, Integer> e : hash.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			for(int i=0; i < e.getValue(); i++)
				smallestNum *= e.getKey();
		}
		return smallestNum;
	}

	public HashMap<Integer, Integer> findPrimeNumbers(int num) {
		HashMap<Integer, Integer> primeFactors = new HashMap<>();
		
		for (int k = 2; k <= num; k++) {
			int range = k;
			for (int i = 2; i <= range / i; i++) {
				while (range % i == 0) {
					primeFactors.put(i, 0);
					range = range / i;
				}
			}
			if (range > 1) {
				primeFactors.put(range, 0);
			}
		}
		return primeFactors;
	}

	public static void main(String[] args) {
		Problem5 pb5 = new Problem5();
		System.out.println("Smallest number:" + pb5.findSmallestPositive(20));
	}

}
