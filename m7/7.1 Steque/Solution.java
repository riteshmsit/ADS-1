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
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int nooftestcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nooftestcases; i++) {
            Steque obj = new Steque();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                    String[] ins = line.split(" ");
                    switch (ins[0]) {
                        case "enqueue":
                    obj.addLast(Integer.parseInt(ins[1]));
                        break;
                        case "push":
                    obj.pushFront(Integer.parseInt(ins[1]));
                    break;
                        case "pop":
                        if (obj.isEmpty()) {
                System.out.println("Steque is empty.");
                break;
                        } else {
                            obj.deleteLast();
                            break;
                        }
                        default:
                        break;
                    }
                } 
                    System.out.println();
        }
    }
}
