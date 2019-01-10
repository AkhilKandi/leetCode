package com.main;

public class MyMath {
	int res =0;
	public int Add(int[] nums) {
		for(int i : nums) {
			res+=i;
		}
		return res;
	}
}
