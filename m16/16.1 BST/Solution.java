import java.util.Scanner;
/**BINARYTREESEARCH.**/
final class Solution {
    /**
     * @details [long description]
     */
    private Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     *  Time complexity is O(N)
     * @param args value
     */
    public static void main(final String[] args) {
     Scanner s = new Scanner(System.in);
     Binarysearchtree bst = new Binarysearchtree();

     while (s.hasNextLine()) {
     String[] tokens = s.nextLine().split(",");

     Book b = new Book(tokens[1], tokens[1 + 1],
        Float.parseFloat(tokens[1 + 1 + 1]));
     switch (tokens[0]) {
        case "put":
                    bst.put(b,
                    Integer.parseInt(tokens[1 + 1 + 1 + 1]));
                    break;
        case "get":
                    System.out.println(bst.get(b));
                    break;
        default:
                break;
     }
    }
    }
}

