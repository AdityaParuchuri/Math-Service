package com.sapient.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.MathService;

class TestMathService {
	MathService service;
	
	@BeforeEach
	void init() {
		service = new MathService();
	}
	
	@Test
	void testGetFibValid() {
		int actual = service.getFibonacci(5);
		int expected = 5;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testGetFibInvalid() {
		int actual = service.getFibonacci(-1);
		int expected = -1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testGetFactValid() {
		long actual = service.getFactorial(5);
		long expected = 120;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testGetFactInvalid() {
		long actual = service.getFactorial(-1);
		long expected = -1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testGetPrimeValidPrime() {
		boolean actual = service.isPrime(7);
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testGetPrimeValidNonPrime() {
		boolean actual = service.isPrime(8);
		boolean expected = false;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testIsPrimeNeg() {
		boolean actual = service.isPrime(-1);
		boolean expected = false;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testIsPrimeOne() {
		boolean actual = service.isPrime(1);
		boolean expected = false;
		Assertions.assertEquals(expected, actual);
	}
}
