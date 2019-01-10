package com.main;

import java.util.HashSet;

public class Db_Example {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		Db_Example ds = new Db_Example();
		ds.SE(1, s);
	}

	void SE(int k, HashSet<Integer> S) {
		visit(S); // do something with subset S

		for (int j = k; j <= 3; j++) { // N is 3 in this case
			S.add(j);
			SE(j + 1, S);
			S.remove(j);
		}
	}

	public void visit(HashSet<Integer> hs) {
		System.out.println("Visit Method " + hs.toString());
	}

}
