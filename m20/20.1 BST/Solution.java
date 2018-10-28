import java.util.Scanner;
/**
 * Class for book details.
 */
class Book implements Comparable {
    /**
     * variable declaration.
     */
    private String name;
    /**
     * variable declaration.
     */
    private String author;
    /**
     * variable declaration.
     */
    private float price;
    /**
     * Constructs the object.
     *
     * @param      name1    The name
     * @param      author1  The author
     * @param      price1   The price
     */
    Book(final String name1,
                final String author1, final float price1) {
        this.name = name1;
        this.author = author1;
        this.price = price1;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the author.
     *
     * @return     The author.
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * Gets the price.
     *
     * @return     The price.
     */
    public float getPrice() {
        return this.price;
    }
    /**
     * compare to method that returns integer.
     *
     * @param      object  The object
     *
     * @return  integer.
     */
    public int compareTo(final Object object) {
        Book that = (Book) object;
        return this.name.compareTo(that.name);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + ", " + getAuthor() + ", " + getPrice();
    }
}
/**
 * client program.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Binarysearchtree bstobj = new Binarysearchtree();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                Book bd = new Book(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                bstobj.put(bd, Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                bd = new Book(tokens[1], tokens[2],
                                        Float.parseFloat(tokens[2 + 1]));
                if (bstobj.get(bd) == -1) {
                    System.out.println("null");
                } else {
                    System.out.println(bstobj.get(bd));
                }
                break;
            case "max":
                System.out.println(bstobj.max());
                break;
            case "min":
                System.out.println(bstobj.min());
                break;
            case "select":
                System.out.println(bstobj.select(Integer.parseInt(tokens[1])));
                break;
            case "floor":
                bd = new Book(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                System.out.println(bstobj.floor(bd));
                break;
            case "ceiling":
                bd = new Book(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                System.out.println(bstobj.ceiling(bd));
                break;
            case "deleteMin":
                bstobj.deleteMin();
                break;
            case "deleteMax":
                bstobj.deleteMax();
                break;
            case "delete":
                bd = new Book(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                bstobj.delete(bd);
                break;
            default:
                break;
            }
        }
    }
}




