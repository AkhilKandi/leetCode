package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Missingnums {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 3, 4, 1, 2, 3, 6, 8 };

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		for (int i : nums) {
			i = i > 0 ? i : -i;
			nums[i - 1] = nums[i - 1] > 0 ? -nums[i - 1] : nums[i - 1];
		}
		System.out.println(Arrays.toString(nums));

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				list.add(i + 1);
		}
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
