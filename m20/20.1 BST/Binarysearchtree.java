/**
 * Class for binary search tree.
 */
class Binarysearchtree {
    /**
     * variable declaration.
     */
    private Node root;
    /**
     * Class for node.
     */
    private final class Node {
        /**
         * variable declaration.
         */
        private Book key;
        /**
         * variable declaration.
         */
        private int val;
        /**
         * variable declaration.
         */
        private Node left;
        /**
         * variable declaration.
         */
        private Node right;
        /**
         * variable declaration.
         */
        private int size;
        /**
         * Constructs the object.
         *
         * @param      key1   The key
         * @param      val1  The value
         * @param s int size
         */
        private Node(final Book key1, final int val1, final int s) {
            this.key = key1;
            this.val = val1;
            this.size = s;
            left = null;
            right = null;
        }
    }
    /**
     * Constructs the object.
     */
    Binarysearchtree() {
        root = null;
    }
    /**
     * size method.
     *
     * @return size.
     */
    public int size() {
        return size(root);
    }
    /**
     * size overloaded method.
     *
     * @param      x Node
     *
     * @return size.
     */
    private int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }
    /**
     * get method.
     *time complexity is O(logN)
     * @param      key   The key
     *
     * @return  integer.
     */
    public int get(final Book key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.val;
            }
        }
        return -1;
    }
    /**
     * put method to insert the key, value.
     *time complexity is O(1)
     * @param      key   The key
     * @param      val   The value
     */
    public void put(final Book key, final int val) {
        root = put(root, key, val);
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x   root node.
     * @param      key   The key
     * @param      val   The value
     *
     * @return root
     */
    private Node put(final Node x, final Book key, final int val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else if (cmp == 0) {
            x.val = val;
        }
        return x;
    }

/**
     * Removes the smallest key and associated value from the symbol table.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
/**
 * funtion to recursively delete the minimum element.
 *
 * @param      x     a node to be deleted.
 *
 * @return     return type is node
 */
    private Node deleteMin(final Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * Removes the largest key and associated value from the symbol table.
     *
     */
    public void deleteMax() {
        /*if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");*/
        root = deleteMax(root);
    }
/**
 * funtion to recursively delete the maximum element.
 *
 * @param      x     a node to be deleted.
 *
 * @return     return type is node
 */
    private Node deleteMax(final Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Removes the specified key and its associated value from this symbol table     
     * (if the key is in this symbol table).    
     *
     * @param  key the key
     */
    public void delete(final Book key) {
        root = delete(root, key);
    }

    private Node delete(Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) {
            x.left  = delete(x.left,  key);
        }
        else if (cmp > 0) {
            x.right = delete(x.right, key);
        }
        else {
            if (x.right == null) {
                return x.left;
            }
            if (x.left  == null) {
                return x.right;
            }
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * min element.
     * time complexity is O(1)
     * @return minimum.
     */
    public Book min() {
        return min(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return minimum.
     */
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }
    /**
     * maximum element.
     * time complexity is O(1)
     * @return maximum.
     */
    public Book max() {
        return max(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return maximum.
     */
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
    /**
     * floor method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return  key
     */
    public Book floor(final Book key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     *
     *overloaded constructor.
     *time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return floor.
     */
    private Node floor(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * ceiling method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return key.
     */
    public Book ceiling(final Book key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }
    /**
     * {Select Method}.
     * Time complexity of this method is O(1).
     * @param      k     {Integer}
     *
     * @return     {Book Object}
     */
    public Book select(final int k) {
        Node x = select(root, k);
        return x.key;
    }
    /**
     * {Select method}
     * Time complexity of this method is O(log(N)).
     * @param      x     {Node}
     * @param      k     {Integer}
     *
     * @return     {Node}
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left,  k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }
    /**
     * {Rank}.
     * Time complexity of this method is O(1).
     * @param      key   The key
     *
     * @return     {Integer}
     */
    public int rank(final Book key) {
        return rank(key, root);
    }
    /**
     * {Method of rank}.
     * Time complexity of this method is O(log(N)).
     * @param      key   The key
     * @param      x     {Node}
     *
     * @return     {Integer}
     */
    private int rank(final Book key, final Node x) {
        if (x == null) {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(key, x.left);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }
}



