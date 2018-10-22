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
     Book b = new Book();
     while (s.hasNextLine()) {
     String[] tokens = s.nextLine().split(",");
     switch (tokens[0]) {
        case "put":
                    b = new Book(tokens[1], tokens[1 + 1],
                    Float.parseFloat(tokens[1 + 1 + 1]));
                    bst.put(b,
                    Integer.parseInt(tokens[1 + 1 + 1 + 1]));
                    break;
        case "get":
                    b = new Book(tokens[1], tokens[1 + 1],
                    Float.parseFloat(tokens[1 + 1 + 1]));
                    System.out.println(bst.get(b));
                    break;
        case "max":
                    System.out.println(bst.max());
                    break;
        case "min":
                    System.out.println(bst.min());
                    break;
        case "floor":
                     b = new Book(tokens[1], tokens[1 + 1],
                    Float.parseFloat(tokens[1 + 1 + 1]));
                    System.out.println(bst.floor(b));
                    break;
        case "ceiling":
                    b = new Book(tokens[1], tokens[1 + 1],
                    Float.parseFloat(tokens[1 + 1 + 1]));
                    System.out.println(bst.ceiling(b));
                    break;
        case "select":
                    System.out.println(bst.select(
                        Integer.parseInt(tokens[1])));
                    break;

        default:
                break;
     }
    }
    }
}


