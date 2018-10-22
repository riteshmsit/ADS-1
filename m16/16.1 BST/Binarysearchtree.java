class Binarysearchtree<Key extends Comparable<Key>, Value> {
	Node root;
	int size = 0;
	private class Node {
		private Book key;
		private Value value;
		private Node left;
		private Node right;
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
        	size++;
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
}


