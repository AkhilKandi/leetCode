package com.main;

public class NumberOf1bits {

	public static long hammingWeight(long n) {
		int r = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				r++;
			n = n >> 1;
		}
		return r;
	}

	public static void main(String[] args) {
		NumberOf1bits n1 = new NumberOf1bits();
		long res = hammingWeight(2147483648);

		System.out.println(res);

	}

}
