class Insertion {
    Insertion() {

    }
    public void sortByInsertion(Students[] a,int size,Students[] overall,int overallsize, int vac, int un,int bcvac, int scvac, int stvac) {
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
                            a[j - 1] = t;
                        }
                        else if (a[j - 1].getsubject2() == a[j].getsubject2()) {
                                String[] s1 = a[j - 1].getdateofbirth().split("-");
                                String[] s2 = a[j].getdateofbirth().split("-");
                                if (Integer.parseInt(s1[2]) < Integer.parseInt(s2[2])) {
                                    Students t = a[j];
                                    a[j] = a[j - 1];
                                    a[j - 1] = t;
                                } else if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                                    if (Integer.parseInt(s1[1]) < Integer.parseInt(s2[1])) {
                                        Students t = a[j];
                                        a[j] = a[j - 1];
                                        a[j - 1] = t;
                                    } else if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                                        if (Integer.parseInt(s1[0]) < Integer.parseInt(s2[0])) {
                                            Students t = a[j];
                                            a[j] = a[j - 1];
                                            a[j - 1] = t;
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
        System.out.println(displaywithreservation(a, size, overall, overallsize, vac, un, bcvac, scvac, stvac));
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
    public String displaywithreservation(Students[] a,int size, Students[] overall,int overallsize, int vac, int un,int bcvac, int scvac, int stvac) {
        
        String s = "";
        int c = 0;
        int i;
        int count = 0;
        for (i = 0; i < un; i++) {
            
            s += a[i].getname() + ","+a[i].gettotalmarks() + "," + a[i].getreservation() + "\n";
            vac -= 1;
        }
        for (int k = i; k < size; k++) {
            if (bcvac > 0 && vac > 0) {
                if (a[k].getreservation().equals("BC")) {
                    s += a[k].getname() + ","+ a[k].gettotalmarks() + "," + a[k].getreservation() + "\n";
                    bcvac--;
                    vac--;
                    count++;
                }
            }
            
            else if (stvac > 0 && vac > 0) {
                if (a[k].getreservation().equals("ST")) {
                    s += a[k].getname() + ","+ a[k].gettotalmarks() + "," + a[k].getreservation() + "\n";
                    stvac--;
                    vac--;
                    count++;
                }
            }
            else if (scvac > 0 && vac > 0) {
                if (a[k].getreservation().equals("SC")) {
                    s += a[k].getname() + ","+ a[k].gettotalmarks() + "," + a[k].getreservation() + "\n";
                    scvac--;
                    vac--;
                    count++;
                }
            }
            else if (vac > 0 && (scvac <=0 || stvac <=0 || bcvac <= 0)) {
                
                    s += a[k].getname() + ","+ a[k].gettotalmarks() + "," + a[k].getreservation() + "\n";
                    vac--;
                    count++;
                
            }

            
        }
        for (int k = count; i < size && vac > 0; i++) {
            s += a[k].getname() + ","+ a[k].gettotalmarks() + "," + a[k].getreservation() + "\n";
                    vac--;
                    count++;
        }
        return s;
    }
}