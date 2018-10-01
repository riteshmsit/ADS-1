import java.util.Scanner;
class Steque {
	Node head;
	Node tail;
	int size = 0;
	class Node {
		int  data;
		Node next;
		Node(int inputdata) {
			this.data = inputdata;
		}
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public void pushFront(int inputitem) {
		Node newnode = new Node(inputitem);
		if (isEmpty()) {
			head = newnode;
			tail = head;
			size++;
			display();
			return;
		}
		newnode.next = head;
		tail = newnode;
		size++;
		display();
	}
	public void addLast(int inputitem) {
		if (isEmpty()) {
			pushFront(inputitem);
			return;
		}
		if (size == 1) {
			head = tail;
		}
		Node newnode = new Node(inputitem);
		tail.next = newnode;
		tail = newnode;
		size++;
		display();
	}
	public int deleteLast() {
		int leftout = head.data;
		head = head.next;
		size--;
		display();
		return leftout;
	}
	public void display() {
		if (isEmpty()) {
			System.out.println("Steque is empty.");
			return;
		}
		String str = "";
		Node test = head;
		while (test.next != null) {
			str = str + test.data + ", ";
			test = test.next;
		}
		str = str + tail.data;
		System.out.println(str);
	}
}