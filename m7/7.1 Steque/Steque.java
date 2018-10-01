import java.util.Scanner;
class Steque {
	Node left = null;
	Node right = null;
	int size = 0;
	class Node {
		int  data;
		Node next;
		Node(int inputdata) {
			this.data = inputdata;
		}
	}
	boolean isEmpty() {
		return size == 0;
	}
	int size() {
		return size;
	}
	void pushFront(int inputitem) {
		Node newnode = new Node(inputitem);
		if (isEmpty()) {
			left = newnode;
			right = left;
			size++;
			display();
			return;
		}
		newnode.next = left;
		left = newnode;
		size++;
		display();
	}
	void addLast(int inputitem) {
		if (isEmpty()) {
			pushFront(inputitem);
			return;
		}
		if (size == 1) {
			left = right;
		}
		Node newnode = new Node(inputitem);
		right.next = newnode;
		right = newnode;
		size++;
		display();
	}
	int deleteLast() {
		int leftout = left.data;
		left = left.next;
		size--;
		display();
		return leftout;
	}
	void display() {
		if (isEmpty()) {
			System.out.println("Steque is empty.");
			return;
		}
		String str = "";
		Node test = left;
		while (test.next != null) {
			str = str + test.data + ", ";
			test = test.next;
		}
		str = str + right.data;
		System.out.println(str);
	}
}