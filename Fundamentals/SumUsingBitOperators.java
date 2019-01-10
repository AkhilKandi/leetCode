package com.main;

/*
 * LeetCode- 371
 * Add two numbers without using arithmetic operators.
 */

public class SumUsingBitOperators {

	public static void main(String[] args) {

		int a = 3, b = 6;
		while (a != 0) {

			int carry = a & b;
			System.out.println("carry =" + carry);
			b = a ^ b;
			System.out.println("b =" + b);
			a = carry << 1;
			System.out.println("a =" + a);
		}

	}

}
