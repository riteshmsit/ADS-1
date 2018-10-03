import java.util.Scanner;
/**MERGE.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args value
     * Time complexity is O(N).
     */
    public static void main(final String[] args) {
        Merge m = new Merge();
        Scanner s = new Scanner(System.in);
        final int len = 50;
        String[] tokens = new String[len];
        while (s.hasNextLine()) {
             tokens = s.nextLine().split(",");
             m.sort(tokens);
            System.out.println(m.show(tokens));
            System.out.println();
        }
    }
}