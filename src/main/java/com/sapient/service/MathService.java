package com.sapient.service;

import java.util.ArrayList;

public class MathService {
	public int getFibonacci(int n) {
		if (n <0) {
			System.out.println("Error! Invalid input");
			return -1;
		}
		if (n <= 1) {
			return n;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	public long getFactorial(int n) {
		if(n<0) {
			System.out.println("ERROR! Invalid input");
			return -1;
		}
		long factorial = 1;
		for (int i = 1; i <= n; i++) {

			factorial *= i;
		}
		return factorial;
	}

	public boolean isPrime(int n) {
		boolean flag = true;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public ArrayList<Integer> getPrimesBetween(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<>();
		if (start < 0 || end <=1) {
			System.out.println("ERROR! Invalid input");
			return primes;
		}
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		while (start < end) {
			boolean flag = false;
			for (int i = 2; i <= start / 2; i++) {
				if (start % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				primes.add(start);
			}

			start++;
		}
		return primes;
	}
}
