/*
 * Author: Prtish Shah
 * Date: 02-06-14
 * Version: 1.0
 * Description: 
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package com.example.projecteuler.problem6;


public class Problem6 {

	public int findDiff(int num)
	{
		return squreofsum(num) -sumOfSqure(num);
	}
	
	private int sumOfSqure(int num)
	{
		return ((num) * (num + 1) * ((2*num) + 1)) /6;
	}
	
	private int squreofsum(int num)
	{
		return ((num * (num+1))/2) * ((num * (num+1))/2);
	}
	public static void main(String[] args) {
		
		Problem6 pb6 = new Problem6();
		System.out.println("Difference: " + pb6.findDiff(100));

	}

}
