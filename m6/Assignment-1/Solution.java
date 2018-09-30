import java.util.Scanner;
class AddLargeNumbers {
    // private E[] LinkedList;
    // private int size, resize;
    // private AddLargeNumbers() {
    //     LinkedList = (E[])new Object[20];
    //     //size = 0;
    //     //resize = 40;
    // }
    public static LinkedList numberToDigits(String number) {
        // LinkedList op = new LinkedList();
        // String[] numbers = number.split("", number.length());
        // for (int i = 0; i < numbers.length; i++) {
        //     int num = Integer.parseInt(numbers[i]);
        //     op.Insertback(num);
        // }
        // return op;
        LinkedList obj = new LinkedList();
        int intnumber = Integer.parseInt(number);
        int b = intnumber;
        while (b != 0) {
            int a = b % 10;
            obj.Insertfront(a);
            b = intnumber / 10;
        }
        return obj;
    }
    public static String digitsToNumber(LinkedList list) {
        LinkedList obj1 = new LinkedList();
        return obj1.displayAll();
        // Node temp = list.head;
        // String str = "";
        // while (temp.getNext() != null) {
        //     str += temp.getData();
        //     temp = temp.getNext();
        // }
        // str += temp.getData();
        // return str;
    }
}
//     public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
//         Stack s1 = new Stack();
//         Stack s2 = new Stack();
//         //LinkedList fors1 = new LinkedList();
//         //for list1
//         Node current = new Node();
//         while (current.next != null) {
//             s1.push(current.value);
//         }
//         //for list2
//         Node current2 = new Node();
//         while (current2.next != null) {
//             s2.push(current2.value);
//         }
//         long stacksize1 = s1.getStackSize();
//         long stacksize2 = s2.getStackSize();
//         String[] sum;
//         int carry;
//         if (stacksize2 == stacksize1) {
//             for (int i = stacksize1; i > 0; i--) {
//                 if (carry) {
//                 sum[i] += s1.pop(i) + s2.pop(i) + carry;
//                 } else {
//                     sum[i] += s1.pop(i) + s2.pop(i);
//                 }
//                 if (sum > 10) {
//                     int sum = Integer.parseInt();
//                     carry = sum % 10;
//                 }
//             }
//         }
//         if (stacksize1 > stacksize2) {
//             long difference = stacksize2 - stacksize1;
//             int i;
//             for (int i = stacksize2; i > 0; i--) {
//                 if (carry) {
//                 sum[i] += s1.pop(i) + s2.pop(i) + carry;
//                 } else {
//                     sum[i] += s1.pop(i) + s2.pop(i);
//                 }
//                 if (sum > 10) {
//                     carry = sum % 10;
//                 }
//             }
//             for (int j = difference; j > 0; i--) {
//                 sum += s1.pop(i) + s2.;
//                 i++;

//             }
//         }
//     }
// }

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
        //     //     break;
        }
    }  
}
