class Insertion {
    // Team teams;
    Filesort[] obj;
    int size;
    Insertion() {
        obj = new Filesort[9];
        this.size = 0;
    }
    public void add(Filesort f) {
        obj[size++] = f;
    }
    public int size() {
        return size;
    }
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
    public void insertion() {
        for (int i = 0;i < size; i++) {
            for (int j = i; j > 0 && obj[j].compareTo(obj[j-1]) == 1; j--) {
                swap(obj, j, j-1);
            }
        }
        //System.out.println("j");
        System.out.println(print(size));
        // toString();
    }
// time complexity of this method is O(1). It swaps the elements only once.
    public void swap(Filesort[] obj, int j, int min) {
        Filesort temp = obj[min];
        obj[min] = obj[j];
        obj[j] = temp;
    }
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.
    public String print(int size ) {
        String str = "";
        for (int k = 0; k < size; k++) {
            str += obj[k].geti() + ", " + obj[k].getfreqj() ;
            // for (int j = 0; j < obj[k].counta(); j++) {
            //     str += a[j];
            // }
            // str = str.substring(0, str.length() - 2);
            str +=   "\n";

        }
        return str;
    }
}