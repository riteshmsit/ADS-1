import java.util.Scanner;
class Steque {
	Node leftnode = null;
	Node rightnode = null;
	int size = 0;
	class Node {
		int data;
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
	public void pushAtEnd(int data) {
		if (isEmpty()) {
			insertFront(data);
			return;
		}
		if (size == 1) {
			leftnode = rightnode;
		}
		Node newnode = new Node(data);
		rightnode.next = newnode;
		rightnode = newnode;
		size++;
	}
	public void insertFront(int data) {
		Node end = new Node(data);
		if (isEmpty()) {
			leftnode = end;
			rightnode = leftnode;
			size++;
			return;
		} else {
			end.next = leftnode;
			leftnode = end;
			size++;
			return;
		}
	}
	public int deleteBack(int data) {
		int leftout = leftnode.data;
		leftnode = leftnode.next;
		size--;
		return leftout;
	}
	public void print() {
		if (isEmpty()) {
			System.out.println("Steque is empty.");
			return;
		}
		String str = "";
		Node test = leftnode;
		while (test.next != null) {
			str = str + test.data + ", ";
			test = test.next;
		}
		str = str + rightnode.data;
		System.out.println(str);
	}
}