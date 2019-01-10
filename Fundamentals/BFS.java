package com.main;

import java.util.ArrayList;
import java.util.List;

public class BFS {

	Node root;

	BFS() {
		root = null;
	}

	public static void main(String[] args) {

		BFS bfs = new BFS();

		bfs.root = new Node(1);
		bfs.root.left = new Node(2);
		bfs.root.right = new Node(3);
		bfs.root.left.left = new Node(3);
		bfs.root.left.right = new Node(4);
		bfs.root.right.left = new Node(4);
		bfs.root.right.right = new Node(3);
//1,2,2,3,4,4,3]
		bfs.printLevelOrder();

	}

	public static List<Integer> ls;
	public static boolean flag = true;
	void printLevelOrder() {

		int h = height(root);

		for (int i = 1; i <= h; i++) {
			ls = new ArrayList<>();
			printGivenLevel(root, i, ls);

			int j = ls.size() - 1;
			int k = 0;
			while (k < j) {
				if (ls.get(k++) != ls.get(j--)) {
					// System.out.println("Not Symmetric");
					flag = false;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Not Symmetric");
				break;
			}

			// System.out.println("Symmetric");
		}


	}

	public void printGivenLevel(Node root1, int level, List<Integer> ls) {

		if (level == 1) {
			if (root1 == null)
				ls.add(-1);
			else
				ls.add(root1.val);
		} else {
			if (root1 != null) {
				printGivenLevel(root1.left, level - 1, ls);
				printGivenLevel(root1.right, level - 1, ls);
			}
		}
	}

	public int height(Node root2) {
		if (root2 == null)
			return 0;
		else {
			int l = height(root2.left);
			int r = height(root2.right);

			if (l > r)
				return (l + 1);
			return (r + 1);
		}
	}

}
