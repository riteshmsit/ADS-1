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
    /**.
     * The time complexity is 1 as it is called once and the element is also added only once.
     *
     * @param      data  The data
     */
    public void pushFront(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = head;
            size++;
            display();
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
        display();
    }
    /**.
     * The time complexity is 1 as it is called once and the element is also added only once.
     *
     * @param      data  The data
     */
    public void addLast(int data) {
        if (head == null) {
            pushFront(data);
            return;
        }
        if (size == 1) {
            head = tail;
        }
        Node newnode = new Node(data);
        tail.next = newnode;
        tail = newnode;
        size++;
        display();
    }
    /**.The time complexity is 1 as element is deleted once.
     * { function_description }
     */
    public void deleteFirst() {
        if (head != null)
        head = head.next;
        size--;
        display();
    }
    /**. The time complexity is N as elements are displayed till the length of the linked list. 
     * { function_description }
     */
    public void display() {
        if (head == null) {
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