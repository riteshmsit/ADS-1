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
        //File path = new File("Files.txt");

    // File [] files = path.listFiles();
    // for (int i = 0; i < files.length; i++){
    //     if (files[i].isFile()){ //this line weeds out other directories/folders
    //         System.out.println(files[i]);
    //     }
    // }
         for (int i = 0; i < 8; i++) {
             Scanner scan = new Scanner(new File("C:/Users/rites/ADS-1/ADS-1/Exam question/Files/" + i + ".txt"));            
             String temp = scan.nextLine();
             String[] temp1 = temp.split(" ");
             int counta = 0;
            // System.out.println(temp);
             String[] a = new String[temp1.length];

             //System.out.println(temp1);
             int count = 0;
             int j;
             for (j = 0; j < temp1.length - 1; j++) {
                if(temp1[j].equals(line)) {
                    count++;
                    a[counta++] = "" + j + ", ";
                }
             } 
             if (counta != 0) {
             System.out.println(line + ":" + count);
         }
             String s = "";
             if (counta != 0) {
             s += i + ", " + count +", "+ "[";
         } 
             for (int k = 0; k < counta; k++) {
                s += a[k];
             }
             //s = s.substring(0, s.length() - 1);
             if (counta != 0) {
                s = s.substring(0, s.length() - 2);
             s += "]";
             System.out.println(s);
          }

        }
    }    
}
