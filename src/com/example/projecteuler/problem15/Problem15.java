package com.example.projecteuler.problem15;

public class Problem15 {

	public static void main(String args[]) {

		int gridSize = 20;
		long path = 1;

		for (int i = 0; i < gridSize; i++) {
			path *= 2 * gridSize - i;
			path /= (i + 1);
		}
		System.out.println(path);
	}

}
