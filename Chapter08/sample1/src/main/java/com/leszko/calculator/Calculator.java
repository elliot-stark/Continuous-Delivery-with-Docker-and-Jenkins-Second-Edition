package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Functions for each field in calculator
 */
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int c) {
		return a + c;
	}

	@Cacheable("difference")
	public int difference(int a, int b) {
		return a - b;
	}

	@Cacheable("product")
	public int product(int a, int b) {
		return a * b;
	}

	@Cacheable("quotient")
	public int quotient(int a, int b) {
		return a / b;
	}
}

