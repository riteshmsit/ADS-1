
import java.util.Arrays;
import java.util.Collections;
/**
 * Class for merit.
 */
class Merit {
    Student[] students;
    Student[] students1;
    int size;
    /**
     * Constructs the object.
     */
    Merit() {
        students = new Student[50];
        students1 = new Student[50];

        size = 0;
    }
    /**
     * Adds a student.
     *
     * @param      st    { student }
     */
    public void addStudent(Student st) {
        students[size++] = st;
    }
    /**
     * Gets the size.
     *
     * @return     The size.
     */
    public int getSize() {
        return size;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += students[i].name+","+students[i].total+","+students[i].category+"\n";
        }
        return str;
    }
    /**
     * string representation
     *
     * @return     { String representation }
     */
    public String toString1() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += students[i].name+","+students[i].total+","+students[i].category+"\n";
        }
        return str;
    }
    /**
     * exchange method
     *
     * @param      students  The students
     * @param      i         { parameter_description }
     * @param      j         { parameter_description }
     */
    public void exch(Student[] students, int i, int j) {
        Student stu = students[j];
        students[j] = students[i];
        students[i] = stu;
    }
    /**
     * contains method.
     *
     * @param      obj   The object
     *
     * @return     { description_of_the_return_value }
     */
    boolean contains(Student obj) {
        for (Student stu : students1) {
            try {
                if(stu.equals(obj)) {
                    return true;
                }   
            } catch (Exception e) {

            }
            
        }
        return false;
    }
    /**
     * sort method
     *
     * @param      noOfvacancies  No ofvacancies
     * @param      noOfunres      No ofunres
     * @param      noOfBC         No of bc
     * @param      noOfSC         No of sc
     * @param      noOfST         No of st
     */
public void sort(int noOfvacancies,int noOfunres,int noOfBC,int noOfSC,int noOfST) {
        int z = 0;
        for(int i = 0; i<noOfunres; i++){
            students1[z++] = students[i];
            // System.out.println(students1[i]);
        }
        int bc = 0;
        if(noOfBC != 0) {
            for (int i = noOfunres; i<students.length; i++ ) {
                try {
                    if (students[i].category.equals("BC")) {
                        students1[z++] = students[i];
                        bc++;
                    if(bc == noOfBC){
                        break;
                    }
            // System.out.println(students1[i]);

                }   
            } catch(Exception e) {
            }
            }
        }
        int sc = 0;
        if (noOfSC != 0) {
            for (int i = noOfunres ; i<size; i++ ) {
                if (students[i].category.equals("SC")) {
                    students1[z++] = students[i];
                    sc++;
                    if(sc == noOfSC) {
                        break;
                    }
                }
            }
        }
        int st = 0;
        if (noOfST != 0) {
            for (int i = noOfunres ; i<size; i++ ) {
                if (students[i].category.equals("ST")) {
                        students1[z++] = students[i];
                        st++;
                        if(st == noOfST) {
                            break;
                        }
                }
            }
        }
        if(bc != noOfBC) {
            for (int i = noOfunres; i<students.length; i++ ) {
                if (!contains(students[i])){
                        students1[z++] = students[i];
                        bc++;
                    if(bc == noOfBC){
                        break;
                    }
            // System.out.println(students1[i]);
                }
            }
        }
        if(sc != noOfSC) {
            for (int i = noOfunres; i<students.length; i++ ) {
                if (!contains(students[i])){
                        students1[z++] = students[i];
                        sc++;
                    if(sc == noOfSC){
                        break;
                    }
            // System.out.println(students1[i]);
            }
        }
        }
        if(st != noOfST) {
            for (int i = noOfunres; i<students.length; i++ ) {
                if (!contains(students[i])){
                        students1[z++] = students[i];
                        st++;
                        if(st == noOfST){
                            break;
                        }
            // System.out.println(students1[i]);
                }
            }
        }
        students1 = Arrays.copyOf(students1, z);
        Arrays.sort(students1, Collections.reverseOrder());
    }
    /**
     * insertion sort.
     */
    public void InsertionSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (!less(students, j - 1, j)) {
                    break;
                } else {
                    exch(students, j - 1, j);
                }
                } 
            }
        }
        /**
         * less method.
         *
         * @param      arr   The arr
         * @param      i     { parameter_description }
         * @param      j     { parameter_description }
         *
         * @return     { description_of_the_return_value }
         */
    public boolean less(Student[] arr, int i, int j) {
        return  arr[i].compareTo(arr[j]) < 0;
    }
}
