import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Magic Number.
     */
    private static final int NINE = 9;
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {

    }
    /**
     * Returns Linked list of numbers.
     *
     * @param      number  The number
     *
     * @return     { Linked list of numbers }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList l = new LinkedList();
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            l.push(Integer.parseInt(numbers[i]));
        }
        return l;
    }
    /**
     * Returns string of linked list.
     *
     * @param      list  The list
     *
     * @return     { string of link list }
     */
    public static String digitsToNumber(final LinkedList list) {
        //LinkedList l = new LinkedList();
        return list.toString();
    }

    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { linkedlist of sum }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
        final LinkedList list2) {
        LinkedList sum = new LinkedList();
        LinkedList carry = new LinkedList();
        LinkedList a, b;
        int c = 0;
        if (list1.getSize() >= list2.getSize()) {
            a = list1;
            b = list2;
        } else {
            a = list2;
            b = list1;
        }
        while (!(b.isEmpty())) {
            if (carry.isEmpty()) {
                c = a.pop() + b.pop();
            } else {
                c = a.pop() + b.pop() + carry.pop();
            }
            if (c > 9) {
                String[] num = Integer.toString(c).split("");
                sum.pushHead(Integer.parseInt(num[1]));
                carry.pushHead(Integer.parseInt(num[0]));
                c = 0;
            } else {
                sum.pushHead(c);
                c = 0;
            }
        }
        if (!(carry.isEmpty())) {
            if (a.isEmpty()) {
                c = carry.pop();
            } else {
                c = a.pop() + carry.pop();
            }
            if (c > 9) {
                String[] num = Integer.toString(c).split("");
                sum.pushHead(Integer.parseInt(num[1]));
                carry.pushHead(Integer.parseInt(num[1]));
                c = 0;
            } else {
                sum.pushHead(c);
                c = 0;
            }
        }
        while (!(a.isEmpty())) {
            sum.pushHead(a.pop());
        }
        return sum;
    }
}
// /**
//  * Class for solution.
//  */
// public final class Solution {
//     /**
//      * Constructs the object.
//      */
//     private Solution() {

//     }
//     /**
//      * Main method to take inputs and return outputs.
//      *
//      * @param      args  The arguments
//      */
    // public static void main(final String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     String p = sc.nextLine();
    //     String q = sc.nextLine();
    //     switch (input) {
    //     case "numberToDigits":
        //     LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
        //     LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
        //     System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
        //     System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
        //     break;

        // case "addLargeNumbers":
            // pDigits = AddLargeNumbers.numberToDigits(p);
            // qDigits = AddLargeNumbers.numberToDigits(q);
        //     LinkedList result = AddLargeNumbers.addLargeNumbers(
        //         pDigits, qDigits);
        //     System.out.println(AddLargeNumbers.digitsToNumber(result));
        //     break;
        // default:
        // break;
    //     }
    // }

//}
// import java.util.Scanner;
// class AddLargeNumbers {
//     // private E[] LinkedList;
//     // private int size, resize;
//     // private AddLargeNumbers() {
//     //     LinkedList = (E[])new Object[20];
//     //     //size = 0;
//     //     //resize = 40;
//     // }
//     public static LinkedList numberToDigits(String number) {
//         LinkedList op = new LinkedList();
//         String[] numbers = number.split("", number.length());
//         for (int i = 0; i < numbers.length; i++) {
//             int num = Integer.parseInt(numbers[i]);
//             //op.Insertback(num);
//             op.insertAtTail(num);
//         }
//         return op;
//         // LinkedList obj = new LinkedList();
//         // int intnumber = Integer.parseInt(number);
//         // int b = intnumber;
//         // while (b != 0) {
//         //     int a = b % 10;
//         //     obj.Insertfront(a);
//         //     b = intnumber / 10;
//         // }
//         // return obj;
//     }
//     public static String digitsToNumber(LinkedList list) {
//         // LinkedList obj1 = new LinkedList();
//         // return obj1.displayAll();
//         Node temp = list.head;
//         String str = "";
//         while (temp.getNext() != null) {
//             str += temp.getData();
//             temp = temp.getNext();
//         }
//         str += temp.getData();
//         return str;
//     }

//     public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
//         LinkedList sum = new LinkedList();
//         int diff = 0;
//         if (list1.size() > list2.size()) {
//             diff = list1.size() - list2.size();
//             for (int i = 0; i < diff; i++) {
//                 list2.insertAtHead(0);
//             }
//         } else if (list2.size() > list1.size()) {
//             diff = list2.size() - list1.size();
//             for (int i = 0; i < diff; i++) {
//                 list1.insertAtHead(0);
//             }
//         }
//         Node temphead = list2.head;
//         Node temp1 = list1.tail;
//         Node temp2 = list2.tail;
//         String str = "";
//         int num1 = 0;
//         int carry = 0;
//         int replace = 0;
//         String[] nums = null;
//         while (temphead.getNext() != null) {
//             int add = temp1.getData() + temp2.getData();
//             if (add > 2 + 2 + 2 + 2 + 1) {
//                 str = Integer.toString(add);
//                 nums = str.split("");
//                 num1 = Integer.parseInt(nums[1]);
//                 carry = Integer.parseInt(nums[0]);
//                 sum.insertAtHead(num1);
//                 list1.popAtTail();
//                 list2.popAtTail();
//                 replace = list1.eleAtTail() + carry;
//                 list1.popAtTail();
//                 list1.insertAtTail(replace);
//             } else {
//                 sum.insertAtHead(add);
//                 list1.popAtTail();
//                 list2.popAtTail();
//             }
//             temp1 = list1.tail;
//             temp2 = list2.tail;
//             temphead = list1.head;
//         }
//         int k = temp1.getData() + temp2.getData();
//         sum.insertAtHead(k);
//         return sum;
//     }
// }
//         // Stack s1 = new Stack();
//         // Stack s2 = new Stack();
//         // //LinkedList fors1 = new LinkedList();
//         // //for list1
//         // Node current = new Node();
//         // while (current.next != null) {
//         //     s1.push(current.value);
//         // }
//         // //for list2
//         // Node current2 = new Node();
//         // while (current2.next != null) {
//         //     s2.push(current2.value);
//         // }
//         // long stacksize1 = s1.getStackSize();
//         // long stacksize2 = s2.getStackSize();
//         // String[] sum;
// //         int carry;
// //         if (stacksize2 == stacksize1) {
// //             for (int i = stacksize1; i > 0; i--) {
// //                 if (carry) {
// //                 sum[i] += s1.pop(i) + s2.pop(i) + carry;
// //                 } else {
// //                     sum[i] += s1.pop(i) + s2.pop(i);
// //                 }
// //                 if (sum > 10) {
// //                     int sum = Integer.parseInt();
// //                     carry = sum % 10;
// //                 }
// //             }
// //         }
// //         if (stacksize1 > stacksize2) {
// //             long difference = stacksize2 - stacksize1;
// //             int i;
// //             for (int i = stacksize2; i > 0; i--) {
// //                 if (carry) {
// //                 sum[i] += s1.pop(i) + s2.pop(i) + carry;
// //                 } else {
// //                     sum[i] += s1.pop(i) + s2.pop(i);
// //                 }
// //                 if (sum > 10) {
// //                     carry = sum % 10;
// //                 }
// //             }
// //             for (int j = difference; j > 0; i--) {
// //                 sum += s1.pop(i) + s2.;
// //                 i++;

// //             }
// //         }
// //     }
// // }
        
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;
            // case "addLargeNumbers":
            //     pDigits = AddLargeNumbers.numberToDigits(p);
            //     qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
     }  
 }
