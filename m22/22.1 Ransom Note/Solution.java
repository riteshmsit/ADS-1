import java.util.Scanner;
/**HASHTABLE.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param args value
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        HashTable hashing = new HashTable();
        String[] tokens = s.nextLine().split(" ");
        for (int i = 0; i < Integer.parseInt(tokens[0]); i++) {

            String key = s.next();
            if (hashing.contains(key)) {
                hashing.put(key, hashing.get(key) + 1);
            } else {
            hashing.put(key, 1);
        }
        }
        int[] a = new int[Integer.parseInt(tokens[1])];
        int size = 0;
        for (int i = 0; i < Integer.parseInt(tokens[1]); i++) {
            String key = s.next();
            int value = hashing.get(key);
            if (hashing.contains(key)) {
                a[size++] = --value;
                hashing.put(key, value);
            } else {
                a[size++] = value;
            }
        }
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                c = 0;
                break;
            } else {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}


