import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *  The {@code Minpq} class represents a priority queue of generic keys.
 */
public class Minpq<Key extends Comparable <Key>, Value> {
    private Key[] pq;
    private Value[] val;
    private int n;
    private Comparator<Key> comparator;
    /**
     * Initializes an empty priority queue with the given initial capacity.
     *
     * @param  initCapacity the initial capacity of this priority queue
     */
    public Minpq(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }
    public void getTop5() {
        for (int i = 0; i < 5; i++) {
            System.out.println(pq[i] + " " + val[i]);
        }
    }
    /**
     * Initializes an empty priority queue.
     */
    public Minpq() {
        this(1);
    }
    /**
     * Initializes an empty priority queue with the given initial capacity,
     * using the given comparator.
     *
     * @param  initCapacity the initial capacity of this priority queue
     * @param  comparator the order in which to compare the keys
     */
    public Minpq(int initCapacity, Comparator<Key> comparator) {
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }
    /**
     * Initializes an empty priority queue using the given comparator.
     *
     * @param  comparator the order in which to compare the keys
     */
    public Minpq(Comparator<Key> comparator) {
        this(1, comparator);
    }
    /**
     * Initializes a priority queue from the array of keys.
     * <p>
     * Takes time proportional to the number of keys, using sink-based heap construction.
     *
     * @param  keys the array of keys
     * /**
    * Time complexity is O(log(N))
    */
    public Minpq(Key[] keys) {
        n = keys.length;
        pq = (Key[]) new Object[keys.length + 1];
        for (int i = 0; i < n; i++)
            pq[i+1] = keys[i];
        for (int k = n/2; k >= 1; k--)
            sink(k);
        assert isMinHeap();
    }
    /**
     * Returns true if this priority queue is empty.
     *
     * @return {@code true} if this priority queue is empty;
     *         {@code false} otherwise
     */
    /**
    * Time complexity is O(1)
    */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of keys on this priority queue.
    * Time complexity is O(1)
     * @return the number of keys on this priority queue
     */
    public int size() {
        return n;
    }
    /**
    * Time complexity is O(log(N))
    */
    private void sink(int k) {
        while (2*k <= n) {
            int j = 2 * k;
            if (j < n && greater(j, j+1)) j++;
            if (!greater(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
    /**
     * Returns a smallest key on this priority queue.
     * Time complexity is O(1)
     * @return a smallest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }

    // helper function to double the size of the heap array
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(N)
     * @param capacity [description]
     */
    private void resize(int capacity) {
        assert capacity > n;
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

    /**
     * Adds a new key to this priority queue.
     * Time complexity is O(1)
     * @param  x the key to add to this priority queue
     */
    public void insert(Key x, Value y,int frequency, int a) {
        // double size of array if necessary
        if (n == pq.length - 1) resize(2 * pq.length);

        // add x, and percolate it up to maintain heap invariant
        pq[n] = x;
        val[n] = y;
        n++;
        // for (int j = 0; j < frequency.length; j++) {
        // frequency[a++] = y;
        // }
        swim(y);
        assert isMinHeap();
    }

    /**
     * @return a smallest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     * Time complexity is O(log(N))
     */
    public Key delMin() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Key min = pq[1];
        exch(1, n--);
        sink(1);
        pq[n+1] = null;     // to avoid loiterig and help with garbage collection
        if ((n > 0) && (n == (pq.length - 1) / 4)) resize(pq.length / 2);
        assert isMinHeap();
        return min;
    }


   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/
   /**
    * @brief [brief description]
    * @details [long description]
    * Time complexity is O(log(N))
    * @param k [description]
    */
    private void swim(int k) {
        while (k > 1 && greater(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }
   /***************************************************************************
    * Helper functions for compares and swaps.
    *********************************************************************1/
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1)
     * @param i [description]
     * @param j [description]
     *
     * @return [description]
     */
    private boolean greater(int i, int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
        }
        else {
            return comparator.compare(pq[i], pq[j]) > 0;
        }
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param N [description]
     * @param j [description]
     *
     * @return [description]
     */
    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    // is pq[1..N] a min heap?
    /**
     * @brief [brief description]
     * @details [long description]
     * @return [description]
     * Time complexity is O(1)
     */
    private boolean isMinHeap() {
        return isMinHeap(1);
    }

    // is subtree of pq[1..n] rooted at k a min heap?
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(log(N))
     * @param k [description]
     * @return [description]
     */
    private boolean isMinHeap(int k) {
        if (k > n) return true;
        int left = 2 * k;
        int right = 2 * k + 1;
        if (left  <= n && greater(k, left))  return false;
        if (right <= n && greater(k, right)) return false;
        return isMinHeap(left) && isMinHeap(right);
    }

