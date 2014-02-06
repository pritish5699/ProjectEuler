package com.example.projecteuler.problem1;

import java.util.HashSet;
import java.util.Set;

/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

	
	public int findSumOfMultiples(int multiple1, int multiple2, int maxLimit)
	{
		Set<Integer> multipleSet = new HashSet<>();
		int sum = 0;
		for(int i = multiple1; i< maxLimit; i = i + multiple1)
		{
			multipleSet.add(i);
		}
		for(int i = multiple2; i< maxLimit; i = i + multiple2)
		{
			multipleSet.add(i);
		}
		
		for(int i : multipleSet)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Problem1 pb1 = new Problem1();
		System.out.println("Multiple of 3 and 5, range 0-10: " + pb1.findSumOfMultiples(3, 5, 10));
		System.out.println("Multiple of 3 and 5, range 0-1000: " + pb1.findSumOfMultiples(3, 5, 1000));
	}

}
