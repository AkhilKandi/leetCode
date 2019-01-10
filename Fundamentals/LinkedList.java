package com.main;

public class LinkedList {

	static ListNode head = null;

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.push(1);
		l.push(1);
		l.push(1);
		l.push(1);
		l.push(1);

		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}

	}


	private void push(int i) {

		if (head == null)
			head = new ListNode(i);
		else {
			ListNode temp = head;
			while (temp.next!= null)
				temp = temp.next;
			temp.next = new ListNode(i);
		}

	}
}
