package test;

class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int value) {
		Node insert = new Node(value);

		if (head == null) {
			head = insert;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = insert;
		}
	}

	public void print() {
		Node print = head;
		while (print != null) {
			System.out.print(print.data + " ");
			print = print.next;
		}
	}

	public void findMiddle() {

		Node mid = head;
		int counter = 0;
		while (head != null) {
			if (counter % 2 != 0) {
				mid = mid.next;
			}
			counter++;
			head = head.next;
		}
		if (mid != null)
			System.out.println("Middle : " + mid.data);
	}
}

public class LinkedList_Pro {

	public static void main(String[] args) {
//		java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();		
//		list.add(1);list.add(2);list.add(3);list.add(4);		
//		System.out.println(findMiddle(list));

		LinkedList list = new LinkedList();

		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.print();
		list.findMiddle();
	}

}
