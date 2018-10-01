import java.util.Scanner;
public class Steque<E>  {
	E[] steque;
	int head, tail, capacity;
	public Steque() {
		steque = (E[])new Object[3000];
		capacity = 2000;
		head = 1000;
		tail = 1000;
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
		if (tail > head) {
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