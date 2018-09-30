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
        // LinkedList obj = new LinkedList();
        // String[] s = number.split("");
        // for (int i = 1; i < s.length; i++) {
        //     obj.push(Integer.parseInt(s[1]));
        // }
        // return obj;
    }
    /**
     * Returns string of linked list.
     *
     * @param      list  The list
     *
     * @return     { string of link list }
     */
    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
        //return list.displayAll();
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
        LinkedList a,b;
        int eachsum = 0;
        if (list1.getSize() >= list2.getSize()) {
            a = list1;
            b = list2;
        } else {
            a = list2;
            b = list1;
        }
        while (!(b.isEmpty())) {
            if (!(carry.isEmpty())) {
                eachsum = a.pop() + b.pop() + carry.pop();
            } else {
                eachsum = a.pop() + b.pop();
            }
            if (eachsum > 9) {
                String[] s = Integer.toString(eachsum).split("");
                sum.pushHead(Integer.parseInt(s[1]));
                carry.pushHead(Integer.parseInt(s[0]));
                eachsum = 0;
            } else {
                sum.pushHead(eachsum);
                eachsum = 0;
            }
        }
        while (!(a.isEmpty())) {
            if (carry.isEmpty()) {
                eachsum = a.pop();
            } else {
                eachsum = a.pop() + carry.pop();
            }
            if (eachsum > 9) {
                String[] abs = Integer.toString(eachsum).split("");
                sum.pushHead(Integer.parseInt(abs[1]));
                carry.pushHead(Integer.parseInt(abs[0]));
                eachsum = 0;
            } else {
                sum.pushHead(eachsum);
                eachsum = 0;
            }
        }
        return sum;
    }
}
        // if (!(carry.isEmpty())) {
        //         if (a.isEmpty()) {
        //             eachsum = carry.pop();
        //         } else {
        //             eachsum = carry.pop() + a.pop();
        //         }
        //         if(eachsum > 9) {
        //             String[] a = Integer.toString(eachsum).split("");
        //             sum.pushHead(Integer.parseInt(a[1]));
        //             carry.pushHead(Integer.parseInt(a[1]));
        //             eachsum = 0;
        //         } else {
        //             sum.pushHead(eachsum);
        //             eachsum = 0;
        //         }
        //     }
        // }




        // LinkedList sum = new LinkedList();
        // LinkedList carry = 2new LinkedList();
        // LinkedList a, b;
        // int c = 0;
        // if (list1.getSize() >= list2.getSize()) {
        //     a = list1;
        //     b = list2;
        // } else {
        //     a = list2;
        //     b = list1;
        // }
        // while (!(b.isEmpty())) {
        //     if (carry.isEmpty()) {
        //         c = a.pop() + b.pop();
        //     } else {
        //         c = a.pop() + b.pop() + carry.pop();
        //     }
        //     if (c > NINE) {
        //         String[] num = Integer.toString(c).split("");
        //         sum.pushHead(Integer.parseInt(num[1]));
        //         carry.pushHead(Integer.parseInt(num[0]));
        //         c = 0;
        //     } else {
        //         sum.pushHead(c);
        //         c = 0;
        //     }
        // }
        // if (!(carry.isEmpty())) {
        //     if (a.isEmpty()) {
        //         c = carry.pop();
        //     } else {
        //         c = a.pop() + carry.pop();
        //     }
        //     if (c > NINE) {
        //         String[] num = Integer.toString(c).split("");
        //         sum.pushHead(Integer.parseInt(num[1]));
        //         carry.pushHead(Integer.parseInt(num[1]));
        //         c = 0;
    //         } else {
    //             sum.pushHead(c);
    //             c = 0;
    //         }
    //     }
    //     while (!(a.isEmpty())) {
    //         sum.pushHead(a.pop());
    //     }
    //     return sum;
    // }

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main method to take inputs and return outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(
                pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
        break;
        }
    }
}