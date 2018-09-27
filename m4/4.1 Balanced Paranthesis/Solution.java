import java.util.Scanner;
/**PARENTHESIS.**/
final class LinkedListStack {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Node head;
    /**node.**/
    class Node {
        /**
         * variable.
         */
        private char value;
        /**
         * variable.
         */
        private Node next;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     */
    LinkedListStack() {
        head = null;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return value
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return value
     */
    public char pop() {
        if (head == null) {
            boolean x;
        }
        char value = head.value;
        head = head.next;
        return value;
    }
    /**
     * @param value value
     */
    public void push(final char value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
}
/**balance.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args value
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int j = 0;
        int num = Integer.parseInt(s1);
        while (j < num) {
        boolean x = balanced(s);
        if (x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        j++;
    }

        }
        /**.
         * { function_description }
         *
         * @param      s     { parameter_description }
         *
         * @return     { description_of_the_return_value }
         */
public static boolean balanced(final Scanner s) {
boolean y = false;
LinkedListStack stack = new LinkedListStack();
String s2 = s.nextLine();
for (int i = 0; i < s2.length(); i++) {
        char ch = s2.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                    y = false;
                    return y;
            } else if (ch == ')') {
                if (stack == null || stack.pop() != '(') {
                        y = false;
                        return y;
                    }
            } else if (ch == ']') {
                if (stack == null || stack.pop() != '[') {
                    y = false;
                    return y;
                    }
            } else if (ch == '}') {
                if (stack == null || stack.pop() != '{') {
                    y = false;
                    return y;
                    }
                }
            }
            if (stack.isEmpty()) {
                y = true;
                return y;
            } else {
            return y;
        }
        }
    }



