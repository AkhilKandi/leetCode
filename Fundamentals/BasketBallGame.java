package com.main;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode problem - 682
 */
public class BasketBallGame {

	public static void main(String[] args) {

		int res = 0;
		String[] str = { "5", "-2", "4", "C", "D", "9", "+", "D" };
		List<Integer> resArr = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase("C")) {
				res = res - resArr.get(resArr.size() - 1);
				resArr.remove(resArr.size() - 1);

			} else if (str[i] == "D") {
				int temp = 2 * resArr.get(resArr.size() - 1);
				res = res + temp;
				resArr.add(temp);

			} else if (str[i] == "+") {
				int temp1 = resArr.get(resArr.size() - 1) + resArr.get(resArr.size() - 2);
				res = res + temp1;
				resArr.add(temp1);
			} else {
				res = res + Integer.parseInt(str[i]);
				resArr.add(Integer.parseInt(str[i]));

			}

		}

		System.out.println(res);

	}

}
