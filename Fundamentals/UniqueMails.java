package com.main;

import java.util.HashSet;

public class UniqueMails {

	public static void main(String[] args) {

		String[] e = { "heelo@dsf.v", "test.email+alex@leet.code.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < e.length; i++) {

			StringBuilder sb = new StringBuilder();

			int index = e[i].indexOf('@');

			for (int j = 0; j < index; j++) {
				if (e[i].charAt(j) != '.' && e[i].charAt(j) != '+') {
					sb.append(e[0].charAt(j));
				}
				else if (e[i].charAt(j) == '+') {
					break;
				}

			}
			sb.append(e[i].substring(index, e[i].length()));
			hs.add(sb.toString());

		}
		System.out.println(hs);
		System.out.println(hs.size());
	}
}