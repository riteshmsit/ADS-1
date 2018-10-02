class Insertionsort {
    Insertionsort() {

    }
    public void sortByInsertion(Team[] a, int teamsize) {
        String s = "";
        for (int i = 0; i < teamsize - 1; i++) { 
            int j = i;
            while(j > 0) {
                if (a[j].getWins() > a[max].getWins()) {
                    Team t = a[max];
                    a[max] = a[i];
                    a[i] = t;
                } else if (a[j].getWins() == a[max].getWins()) {
                    if (a[j].getLosses() < a[max].getLosses()) { 
                        //max = j;
                        Team t = a[max];
                    a[max] = a[i];
                    a[i] = t;
                    }  else if (a[j].getLosses() == a[max].getLosses()) {
                        if (a[j].getDraws() > a[max].getDraws()) {
                            //max = j;
                            Team t = a[max];
                    a[max] = a[i];
                    a[i] = t;
                        }
                    }
                }
                j--;
            }
            // Team t = a[max];
            // a[max] = a[i];
            // a[i] = t;
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