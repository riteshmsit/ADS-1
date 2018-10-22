class Binarysearchtree<Key extends Comparable<Key>, Value> {
	Node root;
	private class Node {
		private Book key;
		private Value value;
		private Node left;
		private Node right;
        private int size;
	}
     public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if (x == null) return 0;
        else return x.size;
    }
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(log(N))
	 * @param key [description]
	 * @param value [description]
	 */
	public void put(Book key, Value value) {
        if (key == null)  {
       		System.out.println("null");
        }
        root = put(root, key, value);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param root [description]
     * @param key [description]
     * @param value [description]
     * @return [description]
     */
    private Node put(Node root, Book key, Value value) {
        if (root == null) {
        	Node n = new Node();
        	n.key = key;
        	n.value = value;
        	n.left = null;
        	n.right = null;
        	root = n;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
        	root.left  = put(root.left,  key, value);
        }
        else if (cmp > 0) {
        	root.right = put(root.right, key, value);
        }
        else {
        	root.value = value;
            root.size = 1 + size(root.left) + size(root.right);
        }
        return root;

    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param key [description]
     * @return [description]
     */
    public Value get(Book key) {
        return get(root, key);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param x [description]
     * @param key [description]
     *
     * @return [description]
     */
    private Value get(Node x, Book key) {
        if (key == null) {
        	System.out.println("empty");
        }
        if (x == null) {
        	//System.out.println("in get");
        	return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
        	return get(x.left, key);
       	}
        else if (cmp > 0) {
        	return get(x.right, key);
        }
        else {
        	return x.value;
        }

    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1) as it is calling another function
     * @return [description]
     */
    public Book min() {
        Node n = min(root);
        return n.key;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param x [description]
     * @return [description]
     */
    private Node min(Node x) {
        if (x.left == null) return x;
        else return min(x.left);
    }
    /**
     * @brief [brief description]
     * Time complexity is O(1) as it is calling another function.
     * @details [long description]
     * @return [description]
     */
    public Book max() {
        Node c = max(root);
        return c.key;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N)) as it is a recusive function.
     * @param x [description]
     * @return [description]
     */
    private Node max(Node x) {
        if (x.right == null) return x;
        else return max(x.right);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1) as it is calling another function
     * @param x [description]
     * @return [description]
     */
     public Book floor(Book key) {
        if (key == null) {
            System.out.println(" ");
        }
        Node x = floor(root, key);
        if (x == null) return null;
        else return x.key;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param x [description]
     * @return [description]
     */
    private Node floor(Node x, Book key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp <  0) return floor(x.left, key);
        Node t = floor(x.right, key);
        if (t != null) return t;
        else return x;
    }
    /**
    *Time complexity is O(1) as it is calling another function.
    **/
    public Book ceiling(Book key) {
        if (key == null) {
            System.out.println(" ");
        }
        Node x = ceiling(root, key);
        if (x == null) return null;
        else return x.key;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N)) as it is a recursive function
     * @param x [description]
     * @return [description]
     */
    private Node ceiling(Node x, Book key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) return t;
            else return x;
        }
        return ceiling(x.right, key);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1) as it is calling another function.
     * @param x [description]
     * @return [description]
     */
     public int rank(Book key) {
        if (key == null) {
            System.out.println(" ");
        }
        return rank(key, root);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N)) as it is a recursive function.
     * @param x [description]
     * @return [description]
     */
    private int rank(Book key, Node x) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return rank(key, x.left);
        else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right);
        else              return size(x.left);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1) as it is calling another function
     * @param x [description]
     * @return [description]
     */
    public Book select(int k) {
        Node x = select(root, k);
        return x.key;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N)) as it is a recursive function.
     * @param x [description]
     * @return [description]
     */
    private Node select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.left);
        if      (t > k) return select(x.left,  k);
        else if (t < k) return select(x.right, k-t-1);
        else            return x;
    }

}