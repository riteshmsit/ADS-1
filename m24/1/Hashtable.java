import java.util.Arrays;
class Hashtable<Key, Value> {
    private static final int INIT_CAPACITY = 4;
    // number of key-value pairs in the symbol table
    private int n;
    // size of hash probing table           
    private int m; 
    // keys of the hashtable
    private Key[] keys;    
    // values of the hashtable
    private Value[] vals; 
    /**
     * Initializes the empty symbol table.
     */
    public Hashtable() {
        this(INIT_CAPACITY);
    }
   //Initializes an empty table with a given capacity
    public Hashtable(int capacity) {
        m = capacity;
        n = 0;
        keys = (Key[])   new Object[m];
        vals = (Value[]) new Object[m];
    }
//Returns the number of key-value pairs in this table.
    public int size() {
        return n;
    }
// Returns true if this symbol table is empty
    public boolean isEmpty() {
        return size() == 0;
    }
// Returns true if this symbol table contains the specified key.
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    // hash function for keys - returns value between 0 and M-1
    private int hash(Key key) {
        return (key.hashCode() * 11) % m;
    }

    // resizes the hash table to the given capacity by re-hashing all of the keys
    private void resize(int capacity) {
        Hashtable<Key, Value> temp = new Hashtable<Key, Value>(capacity);
        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                temp.put(keys[i], vals[i]);
            }
        }
        keys = temp.keys;
        vals = temp.vals;
        m    = temp.m;
    }
// For average case it is constant time
// For worst case it can go upto N
// For best case it is 1(At starting index)
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");

        if (val == null) {
            delete(key);
            return;
        }
        if (n >= m/2) resize(2*m);

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        }
        keys[i] = key;
        vals[i] = val;
        n++;
    }
// The time complexity in practical time is ideally equal to O(3) or O(4)
// For best case the time complexity is 1 which is almost impossible
// For worst case the time complexity is O(N)
// For average case it is constant time
    public String get(Key key, int num) {
        Value v = get(key);
        String s = "";
        s+= v;
        String[] str = s.split(",");
        if (v == null) {
            return "Student doesn't exists...";
        } else if (num == 1) {
            return str[0];
        } else {
            return str[1];
        }
    }
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (int i = hash(key); keys[i] != null; i = (i + 1) % m)
            if (keys[i].equals(key))
                return vals[i];
        return null;
    }
// The time complexity is average time
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        if (!contains(key)) return;

        // find position i of key
        int i = hash(key);
        while (!key.equals(keys[i])) {
            i = (i + 1) % m;
        }
        // delete key as well as value
        keys[i] = null;
        vals[i] = null;
        i = (i + 1) % m;
        while (keys[i] != null) {
            // delete keys[i] an vals[i] and reinsert
            Key   keyToRehash = keys[i];
            Value valToRehash = vals[i];
            keys[i] = null;
            vals[i] = null;
            n--;
            put(keyToRehash, valToRehash);
            i = (i + 1) % m;
        }
        n--;
        // To reduce the size of the array by 
        //half if it's 12.5% full or less
        if (n > 0 && n <= m/8) resize(m/2);
    }
    //time complexity is O(N).
	public String display() {
		String s = "{";
		if (size() == 0) {
			return "{}";
		}
		for (int i = 0; i < m; i++) {
			if (keys[i] != null) {
				s += keys[i] + ":" + vals[i] +", ";
			}
		}
			s = s.substring(0, s.length() - 2) + "}";
		return s;
	}
}