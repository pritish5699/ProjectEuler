package com.example.projecteuler.problem3;

import java.util.ArrayList;

/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 {

	/**
	 * @param args
	 */
	
	public double findLargestPrimeFactor(double num)
	{
		ArrayList<Double> primeFactors = new ArrayList<>();
		for(double i=2; i <= num /i; i++)
		{
			if(num % i ==0)
			{
				primeFactors.add(i);
				num = num / i;
			}
		}
		if(num > 1)
		{
			primeFactors.add(num);
		}
		return primeFactors.get(primeFactors.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem3 pb3 = new Problem3();
		System.out.println("Largest Prime Factor: "+ pb3.findLargestPrimeFactor(600851475143d)) ;
		
	}

}
