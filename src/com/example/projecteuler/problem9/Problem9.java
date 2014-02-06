/*
 * Author: Prtish Shah
 * Date: 02-06-14
 * Version: 1.0
 * Description: 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
package com.example.projecteuler.problem9;


public class Problem9 {
	
	private double findPythoNum(int a, int b)
	{
		return Math.sqrt((a*a) + (b*b));
	}
	
	private boolean checkSum(int a, int b, double c)
	{
		return ((a+b+c) == 1000);
	}
	
	public int findPythogoreanTriplet(int num)
	{
		int mul =0;
		for(int num1 = 1; num1 < num-1; num1++)
		{
			for(int num2 =1; num2 < num-1; num2++)
			{
				double pythoNum =findPythoNum(num1, num2);
				if(checkSum(num1, num2, pythoNum))
				{
					System.out.println("Num1: " + num1 + " Num2: "+ num2 + " Num3: "+ (int)pythoNum);
					mul = (int) (num1 * num2 * pythoNum);
					break;
				}
			}
		}
		return mul;
	}
	public static void main(String[] args) {
		Problem9 pb9 = new Problem9();
		System.out.println("Number: " + pb9.findPythogoreanTriplet(1000));
	}

}
