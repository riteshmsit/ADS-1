import java.util.Scanner;
import java.util.Arrays;
class Pairs {
    private int[] arr;
    private int size;
    public Pairs(int n) {
        arr = new int[n];
        size = 0;
    }
    public void add(int k) {
        arr[size++] = k;
    }
    public int getcount() {
        int sum = 0, count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count += 1;
            } else {
                sum += (count * (count + 1)) / 2;
                count = 0;
            }
            if (i == arr.length - 2) {
                sum += (count * (count + 1)) / 2;
            }
        }
        return sum;
    }
}
public class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pairs sum = new Pairs(n);
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            sum.add(k);
        }
        System.out.println("Sum = " + sum.getcount());
    }
}