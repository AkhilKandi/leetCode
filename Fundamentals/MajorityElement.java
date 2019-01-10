package com.main;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 2, 2, 1, 1 };

		int count = 1, val = 0;
		Arrays.sort(nums);
//		System.out.println(nums.length);
//		System.out.println(Arrays.toString(nums));
		for (int i = 1; i < nums.length; i++) {

			if (nums[i - 1] == nums[i]) {
				count++;

				if (count > (nums.length / 2)) {
					val = nums[i - 1];
					System.out.println(val);
					break;
				}
			} else {
				if (count > (nums.length / 2)) {
					System.out.println(nums[i - 1]);
				} else
					count = 1;

			}
		}
		System.out.println(val);
	}

}
