import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Solution<E> {
	private E[] stack;
	private int size, resize;
	private Solution() {
		stack = (E[])new Object[20];
		size = 0;
		resize = 40;
	}
	public void push(E item) {
		if (size == resize) {
			resize(2 * size);
		}
		stack[size++] = item;
	}
	public void pop() {
		if (size == resize / 4) {
			resize(size);
		}
		stack[size--] = null;
	}
	public void resize(int resize) {
		E[] stack1 = (E[])new Object[resize];
		for (int i = 0; i < size; i++) {
			stack1[i] = stack[i];
		}
		stack = stack1;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public void printstack() {
		for (int i = 0; i < size; i++) {
			System.out.println(stack[i] + " ");
		}
	}
	public static void main(String[] args) {
		Solution<String> pl = new Solution<String>();
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("-")) {
				pl.pop();
			} else {
				pl.push(temp[i]);
			}
		}
		pl.printstack();	
	}
}
// for displaying remaining elements
// import java.util.Scanner;
// class Stack {
// 	public static void main(String[] args) {
// 		String[] stack = new String[20];
// 		int size = 0;
// 		Scanner scan = new Scanner(System.in);
// 		String[] input = scan.nextLine().split(" ");
// 		for(int i=0;i<input.length;i++){
// 			if(input[i].equals("-")){
// 				size--;
// 				System.out.println(stack[size]);
// 			} else{
// 				stack[size++] = input[i];
// 			}
// 		}
// 		//System.out.println("remaining elements in the stack are " + stack);
// 	}
// }