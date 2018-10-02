class Selectionsort {
    Selectionsort() {

    }
    public void sortByInsertion(Team[] a, int teamsize) {
        int max = 0;
        String s = "";
        for (int i = 0; i < teamsize - 1; i++) { 
            max = i; 
            for (int j = i + 1; j < teamsize; j++) {
                if (a[j].getWins() > a[max].getWins()) {
                    max = j;
                } else if (a[j].getWins() == a[max].getWins()) {
                    if (a[j].getLosses() < a[max].getLosses()) { 
                        max = j;
                    }  else if (a[j].getLosses() == a[max].getLosses()) {
                        if (a[j].getDraws() > a[max].getDraws()) {
                            max = j;
                        }
                    }
                }
            }
            Team t = a[max];
            a[max] = a[i];
            a[i] = t;
        }
        System.out.println(displayToString(a, teamsize));
    }
    public String displayToString(Team[] a, int teamsize) {
        String s = "";
        int i;
        for (i = 0; i <  teamsize - 1; i++) {
            s += a[i].getTeam() + ",";
        }
        s += a[i].getTeam();
        return s;
        
    }
}