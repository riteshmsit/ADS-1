import java.util.Arrays;
/**student.**/
class store {
    Student[] student;
    int size;
    store() {
        student = new Student[50];
        size = 0;
    }
    /**
     * @param student value
     * time complexity is O(1).
     */
    public void addStudent(final Student s) {
        student[size++] = s;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * time complexity is O(N^2).
     */
    public void sort() {
        int n = size;
        for (int k = n / 2; k >= 1; k--)
            sink(student, k, n);
        while (n > 1) {
            exch(student, 1, n--);
            sink(student, 1, n);
        }
    }
    /**
     * @param student [description]
     * @param pq student
     * @param c value
     * @param n value
     * time complexity is O(N).
     */
     public void sink(final Student[] pq, final int c, final int n) {
        int k = c;
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch (pq, k, j);
            k = j;
        }
    }
    /**
     * @param student value
     * @param i value
     * @param j value
     * @return value
     * time complexity is O(1).
     *
     */
    public boolean less(final Student[] student, final int i, final int j) {
        return student[i - 1].compare(student[j - 1]) >= 0;
    }
    /**
     * @param team student
     * @param i value
     * @param loc value
     * time complexity is O(1).
     */
    public void exch(final Student[] team, final int i, final int loc) {
        Student swap = team[i - 1];
        team[i - 1] = team[loc - 1];
        team[loc - 1] = swap;
    }
    /**
     * @param arr value
     * @param val value
     * time complexity is O(N).
     * @return value
     */
    public boolean contains(final int[] arr, final int val) {
        for (int n : arr) {
            if (val == n) {
                return true;
            }
        }
        return false;
    }
    /**
     * time complexity is O(N).
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < size - 1; i++) {
            s += student[i].getname() + "," + student[i].gettotal()
            + "," + student[i].getreserve();
            s += "\n";
        }
        s += student[size - 1].getname() + "," + student[size - 1].gettotal()
        + "," + student[size - 1].getreserve();
            return s;
    }
    /**
     * time complexity is O(1).
     * @param vacancy value
     * @return value
     */
    public String toString1(final int vacancy) {
        String s = "";
        for (int i = 0; i < vacancy - 1; i++) {
            s += student[i].getname() + "," + student[i].gettotal()
            + "," + student[i].getreserve();
            s += "\n";
        }
        s += student[vacancy - 1].getname() + "," + student[vacancy - 1].gettotal()
        + "," + student[vacancy - 1].getreserve();
            return s;
    }
    /**
     * time complexity is O(1).
     * @param open [description]
     * @param n value
     * @param bc value
     * @param sc value
     * @param st value
     */
    public void getr(final int c,final int c1, final int c2, final int c3, final int c4) {
        int open = c;
        int n = c1;
        int bc = c2;
        int sc = c3;
        int st = c4;
        int[] array = new int[bc + sc + st];
        int i = 0;
        for (int k = open;k < n; k++) {
            if(bc > 0) {
            if (student[k].getreserve().equals("BC")) {
                array[i++] = k;
                bc--;
            }
        }  if(sc > 0) {
            if (student[k].getreserve().equals("SC")) {
                array[i++] = k;
                sc--;
            }
        }  if(st > 0) {
             if (student[k].getreserve().equals("ST")) {
                array[i++] = k;
                st--;
            }
        }
        }
        if (bc > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && bc > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        bc--;
                    }
                }
            }
        }
        if (sc > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && sc > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        sc--;
                    }
                }
            }
        }
        if (st > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && st > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        st--;
                    }
                }
            }
        }
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++) {
            System.out.println(student[array[k]].print());
        }
    }

}

