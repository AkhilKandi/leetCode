package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DomainCount {

	public static void main(String[] args) {

		String[] domains = { "9001 discuss.leetcode.com", "1 discuss.akhil.com" };

		List<String> visitCount = subdomainVisit(domains);
		System.out.println(visitCount);

	}

	public static List<String> subdomainVisit(String[] domains) {

		Map<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < domains.length; i++) {

			String[] breaker = domains[i].split(" ");

			while (breaker[1].indexOf('.') != -1) {
				int firstIndex = breaker[1].indexOf('.');
				hm.put(breaker[1], hm.getOrDefault(breaker[1], 0) + Integer.parseInt(breaker[0]));
				breaker[1] = breaker[1].substring(firstIndex + 1);
				if (breaker[1].indexOf('.') == -1) {
					hm.put(breaker[1], hm.getOrDefault(breaker[1], 0) + Integer.parseInt(breaker[0]));
				}
			}

		}
		List<String> res = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			res.add(entry.getValue() + " " + entry.getKey());
		}
		return res;
	}
}
