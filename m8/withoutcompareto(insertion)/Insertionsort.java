class Insertionsort {
    Insertionsort() {

    }
    public void sortByInsertion(Team[] a, int teamsize) {
        String s = "";
        for (int i = 0; i < teamsize - 1; i++) { 
            int j = i;
            while(j > 0) {
                if (a[j - 1].getWins() > a[j].getWins()) {
                    Team t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                } else if (a[j - 1].getWins() == a[j].getWins()) {
                    if (a[j - 1].getLosses() < a[j].getLosses()) { 
                        //max = j;
                        Team t = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = t;
                    }  else if (a[j - 1].getLosses() == a[j].getLosses()) {
                        if (a[j - 1].getDraws() > a[j].getDraws()) {
                            //max = j;
                            Team t = a[j];
                    a[j] = a[j - 1];
                    a[j] = t;
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