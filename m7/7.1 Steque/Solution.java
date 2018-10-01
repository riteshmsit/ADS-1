import java.util.Scanner;
/**.
 * { item_description }
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *The time complexity is N^2 as there are two loops and one loop is
     *nested inside the other loop.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int nooftestcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nooftestcases; i++) {
            Steque obj = new Steque();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                if (!line.isEmpty()) {
                    String[] ins = line.split(" ");
                    switch (ins[0]) {
                        case "enqueue":
                    obj.addLast(Integer.parseInt(ins[1]));
                        break;
                        case "push":
                    obj.pushFront(Integer.parseInt(ins[1]));
                    break;
                        case "pop":
                        obj.deleteFirst();
                        default:
                        break;
                    }
                } else {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
