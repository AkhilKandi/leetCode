package com.main;

public class TreeTraversal {

	static TreeNode root = null;

	public static void main(String[] args) {

		TreeTraversal tree = new TreeTraversal();

		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(5);
		tree.root.right.right = new TreeNode(6);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);

		System.out.println("PreOrder :");
		tree.preOrderTraversal(root);
		System.out.println("\nInOrder :");
		tree.inOrderTraversal(root);
		System.out.println("\nPostOrder :");
		tree.postOrder(root);
	}

	 void postOrder(TreeNode root2) {
		 
		 if(root2 == null)return;
		 postOrder(root2.left);
		 postOrder(root2.right);
		 System.out.print(root2.value + " ");
	}

	 void inOrderTraversal(TreeNode root2) {

		if (root2 == null)
			return;

		inOrderTraversal(root2.left);
		System.out.print(root2.value+" ");

		inOrderTraversal(root2.right);

	}

	void preOrderTraversal(TreeNode root) {

		if (root == null)
			return;
		System.out.print(root.value + " ");

		preOrderTraversal(root.left);

		preOrderTraversal(root.right);

	}

}
