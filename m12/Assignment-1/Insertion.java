class Insertion {
    Insertion() {

    }
    public void sortByInsertion(Students[] a,int size,Students[] overall,int overallsize) {
        for (int i = 0; i < size; i++) { 
            int j = i;
            while(j > 0) {
                if (a[j - 1].gettotalmarks() < a[j].gettotalmarks()) {
                    Students t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                } else if (a[j - 1].gettotalmarks() == a[j].gettotalmarks()) {
                    if (a[j - 1].getsubject3() < a[j].getsubject3()) { 
                        Students t = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = t;
                    }  else if (a[j - 1].getsubject3() == a[j].getsubject3()) {
                        if (a[j - 1].getsubject2() < a[j].getsubject2()) {
                            Students t = a[j];
                            a[j] = a[j - 1];
                            a[j] = t;
                        }
                        else if (a[j - 1].getsubject2() == a[j].getsubject2()) {
                                String[] s1 = a[j - 1].getdateofbirth().split("-");
                                String[] s2 = a[j].getdateofbirth().split("-");
                                if (Integer.parseInt(s1[2]) > Integer.parseInt(s2[2])) {
                                    Students t = a[j];
                                    a[j] = a[j - 1];
                                    a[j] = t;
                                } else if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                                    if (Integer.parseInt(s1[1]) > Integer.parseInt(s2[1])) {
                                        Students t = a[j];
                                        a[j] = a[j - 1];
                                        a[j] = t;
                                    } else if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                                        if (Integer.parseInt(s1[0]) > Integer.parseInt(s2[0])) {
                                            Students t = a[j];
                                            a[j] = a[j - 1];
                                            a[j] = t;
                                        }
                                    } 
                                }
                            }
                        }
                }
                j--;
            }
        }
        System.out.println(displayToString(a, size));
        System.out.println();
        System.out.println(displaywithreservation(a, size, overall, overallsize));
    }
    public String displayToString(Students[] a, int size) {
        String s = "";
        int i;
        for (i = 0; i <  size - 1; i++) {
            s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
        }
        s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation();
        return s;   
    }
    public String displaywithreservation(Students[] a,int size,Students[] overall,int overallsize) {
        int j = overall[0].getvacancies();
        int b = overall[0].getbcvacancies();
        int q = overall[0].getunresvacancies();
        int c = overall[0].getscvacancies();
        int d = overall[0].getstvacancies();
        String s = "";
        int i;
        for (i = 0; i < q; i++) {
        //     if (a[i].getreservation().equals("BC")) {
        //         b--;
        //     } else if (a[i].getreservation().equals("SC")) {
        //         c--;
        //     } else if (a[i].getreservation().equals("ST")) {
        //         d--;
        //     }
             s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
        // }
        //i--;
        }
        //int j = i;
        while (b != 0 && b > 0 && i < size) {
            if (a[i].getreservation().equals("BC")) {
            s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
            b--;
            i++;
        } else {
            i++;
        }
        }
        //i = q;
        //i--;
        
        //i--;
        // while (c != 0 && c > 0) {
        //     if (a[i].getreservation().equals("SC")) {
        //         s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
        //         c--;
        //         i++;
        //     } else {
        //     i++;
        // }
        //}
        //i = q;
        while (d != 0 && d > 0) {
            if (a[j].getreservation().equals("ST")) {
                s += a[j].getname() + "," + a[j].gettotalmarks() + "," + a[j].getreservation() + "\n";
                d--;
                j++;
            } else {
                j++;
            }
        }
        while (c != 0 && c > 0) {
            if (a[i].getreservation().equals("SC")) {
                s += a[i].getname() + "," + a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
                c--;
                i++;
            } else {
            i++;
        }
        }
        return s;
    }
}