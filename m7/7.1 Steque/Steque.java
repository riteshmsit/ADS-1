import java.util.Scanner;
public class Steque<E>  {
	E[] steque;
	int head, tail, capacity;
	public Steque() {
		steque = (E[])new Object[300];
		capacity = 300;
		head = 150;
		tail = 150;
	}
	public void pushAtEnd(E item) {
		if (tail < capacity) {
			steque[tail++] = item;
		}
	}
	public void insertFront(E item) {
		if (head > 0) {
			head--;
			steque[head] = item;
		}
	}
	public void deleteBack(E item) {
		if (!isEmpty()) {
		tail--;
		steque[tail] = item;
		} else {
			System.out.println("Steque is empty.");
		}

	}
	public int size() {
		if (head != tail)
			return tail - head;
		return 0;
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	public String print() {
		if (!isEmpty()) {
			String s = "";
			int i = head;
			for (i = head; i < tail - 1; i++) {
				s += steque[i] + ", ";
			}
			s += steque[i];
			return s;
		} else {
			return "Steque is empty.";
		}
	}
}