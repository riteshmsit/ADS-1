import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Merge m = new Merge();
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String tokens = s.nextLine();
            String[] lines = tokens.split(",");
            m.sort(lines);
            System.out.println(m.show(lines));
            System.out.println();

        }
    }
}