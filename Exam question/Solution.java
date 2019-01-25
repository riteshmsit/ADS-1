import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
/**
 *class for processing the.
 *word net
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }    
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Insertion sort = new Insertion();
        //File obj = new file();
        int freq = 0;
        String s = "";
        //File path = new File("Files.txt");

    // File [] files = path.listFiles();
    // for (int i = 0; i < files.length; i++){
    //     if (files[i].isFile()){ //this line weeds out other directories/folders
    //         System.out.println(files[i]);
    //     }
    // }
         for (int i = 0; i <= 8; i++) {
             Scanner scan = new Scanner(new File("C:/Users/rites/ADS-1/ADS-1/Exam question/Files/" + i + ".txt"));            
             String temp = scan.nextLine();
             
             String[] temp1 = temp.split(" ");
             int counta = 0;
            // System.out.println(temp);
             int[] a = new int[temp1.length];

             //System.out.println(temp1);
             int count = 0;
             int j;
             int freqj =0;
             for (j = 0; j < temp1.length; j++) {
                if(temp1[j].equals(line)) {
                    count++;
                    a[counta++] =  + j;
                    freq++;
                    freqj++;
                }
             } 
             // String s = "";
         //     if (counta != 0) {
         //     s += i + ", " + count +", "+ "[";
         // } 
         //     for (int k = 0; k < counta; k++) {
         //        s += a[k];
         //     }
             //s = s.substring(0, s.length() - 1);
          //    if (counta != 0) {
          //       s = s.substring(0, s.length() - 2);
          //    s += "]" + "\n";
             
          // }
          if (counta != 0) {
          Filesort obj = new Filesort(i, freqj);
          sort.add(obj);
      }
        }
        if (freq != 0) {
        System.out.println(line +":" + freq);
    } else {
        System.out.println("word is not present in any file");
    }
    if (freq != 0) {
        sort.insertion();
}
        //System.out.println(s); 

    }    
}
