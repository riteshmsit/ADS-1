public class Stack<E> {
	private E[] stack;
	private int size, resize;
	private Stack() {
		stack = (E[])new Object[200];
		size = 0;
		//resize = 40;
	}
	public void push(E item) {
		if (size == resize) {
			resize(2 * size);
		}
		stack[size++] = item;
	}
	public E pop() {
		if (size == resize / 4) {
			resize(size);
		}
		size--;
		return stack[size];
	}
	// public void resize(int resize) {
	// 	E[] stack1 = (E[])new Object[resize];
	// 	for (int i = 0; i < size; i++) {
	// 		stack1[i] = stack[i];
	// 	}
	// 	stack = stack1;
	// }
	public boolean isEmpty() {
		return (size == 0);
	}
	public void printstack() {
		for (int i = 0; i < size; i++) {
			System.out.println(stack[i] + " ");
		}
	}
}