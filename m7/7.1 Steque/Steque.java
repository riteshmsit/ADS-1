import java.util.Scanner;
public class Steque<E>  {
	E[] steque;
	int head, tail, capacity;
	public Steque() {
		steque = (E[])new Object[30];
		capacity = 30;
		head = 15;
		tail = 15;
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
		if (tail < capacity) {
			tail--;
			steque[tail] = null;
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
}