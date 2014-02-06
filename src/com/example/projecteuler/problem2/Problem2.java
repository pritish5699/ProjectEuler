package com.example.projecteuler.problem2;

import java.util.ArrayList;

/*
 * Author: Prtish Shah
 * Date: 02-05-14
 * Version: 1.0
 * Description: 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Problem2 {

	
	
	private ArrayList<Integer> fibonacciSeries(int limit)
	{
		ArrayList<Integer> fiboSeries = new ArrayList<>();
		fiboSeries.add(1);
		fiboSeries.add(1);
		int fiboNum=0;
		int index = 2;
		while(fiboNum < limit)
		{
			fiboNum = fiboSeries.get(index-1) + fiboSeries.get(index-2);
			fiboSeries.add(fiboNum);
			index++;
		}
		return fiboSeries;
	}
	
	public int findSum(int limit)
	{
		int sum=0;
		ArrayList<Integer> fiboSeries = fibonacciSeries(limit);
		for(int i : fiboSeries)
		{
			if(i % 2 ==0)
				sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Problem2 pb2 = new Problem2();
		System.out.println("Sum of even-terms:" + pb2.findSum(4000000));
	}

}
