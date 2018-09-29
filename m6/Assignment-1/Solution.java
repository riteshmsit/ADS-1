import java.util.Scanner;
class AddLargeNumbers {
    public static LinkedList numberToDigits(String number) {
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
    }

    // public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

    // }
}

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
             //    pDigits = AddLargeNumbers.numberToDigits(p);
             //    qDigits = AddLargeNumbers.numberToDigits(q);
             //    LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
             //    System.out.println(AddLargeNumbers.digitsToNumber(result));
             //    break;
        }
    }
    
}
