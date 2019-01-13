import java.util.Scanner;
class Steque {
    Node head;
    Node tail;
    int[] jury = new int[50];
    int size = 0;
    int count = 0;
    int count2 = 0;
    String[] result = new String[400];
    int counts = 0;
    class Node {
        String  data;
        Node next;
        Node(String inputdata) {
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
    public void pushFront(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = head;
            size++;
            //display();
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
        //display();
    }
    /**.
     * The time complexity is 1 as it is called once and the element is also added only once.
     *dele
     * @param      data  The data
     */
    public void addLast(String data) {
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
        int jrycount = 0;
        String[] a = tail.data.split(",");
        for (int j = 0; j < count; j++) {
            
            if (Integer.parseInt(a[1]) != jury[j]) {
                jrycount++;
            }

        }
        if (jrycount == jury.length) {
            jury[count++] =  Integer.parseInt(a[1]);
        }
        
    }
    /**.The time complexity is 1 as element is deleted once.
     * { function_description }
     */
    public void deleteFirst() {
        if (head != null) {
        // String[] a = head.data.split(",");
        // jury[count] = a[1];
        // count++;
        result[counts++] = head.data;
        head = head.next;

        size--;
        }
        //display();
    }
    /**. The time complexity is N as elements are displayed till the length of the linked list. 
     * { function_description }
     */
    public String display() {
        //int count = 0;
        String str = "";
        if (head == null) {
            str += "NO Registrations";
            return str;
        }
        
        if (size == 1) {
            str += head.data;
            String[] a = head.data.split(",");
            int jcount = 0;
            for (int i = 0; i < count; i++) {
                if (jury[i] != Integer.parseInt(a[1])) {
                        jcount++;
                }
            }
            if (jcount == jury.length) {
                    jury[count] = Integer.parseInt(a[1]);
                    count++;
            }
            deleteFirst();
            return str;
        }


            // Node temp = head;     
            //     while (temp != null) {
            //         for (int i = 0; i < count; i++) {
            //             String[] c = temp.data.split(",");
            //             if (jury[i] == Integer.parseInt(c[1])) {
            //                 delete(temp.data);
            //                 break;
            //             }
            //         }
            //         temp = temp.next;
            //     }
        
            

            String[] c = head.data.split(",");
            for (int i = 0; i < count; i++) {
                if (jury[i] == Integer.parseInt(c[1])) {
                    deleteFirst();
                    str += head.data;
                    return str;
                }
            }
            // str += head.data;
            //     deleteFirst();
            //     return str;
            return "";
        }
        // void delete(String val) {
        //     Node temp = head;
        //     Node prev = null;
        //     if (head.data == val) {
        //         deleteFirst(); 
        //     }
        //     while (temp != null) 
        // { 
            
        //     temp.next = temp.next.next; 
        // }     
        //prev.next = temp.next;
  

        //      while (temp != null) { 
        //        if (temp.next.data.equals(val)) {
        //       temp.next = temp.next.next;
        //       size--;
        //      }
        //     //prev = temp; 
        //     temp = temp.next; 
        // }
        //prev.next = temp.next;
        }     
  
        //     Node temp = head;
        //     head = temp;
        //     while (temp != null) {
        //         if (temp.next.data.equals(val)) {
        //         temp.next = temp.next.next;
        //         size--;
        //     }
        //     temp = temp.next;
        //     }
        // }