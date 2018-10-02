class Selectionsort {
    Selectionsort() {

    }
    public void sortByInsertion(Team[] a, int teamsize) {
        int n = a.length;
        int max = 0;
        String s = "";
        for (int i = 0; i < teamsize - 1; i++) { 
            max = i; 
            for (int j = i + 1; j < teamsize; j++) {
                if (a[j].getWins() > a[max].getWins()) {
                    max = j;
                } else if (a[j].getWins() == a[max].getWins()) {
                    if (a[j].getLosses() < a[max].getLosses()) { //&& a[j].getLosses() != a[max].getLosses()) {
                        max = j;
                    } else if (a[j].getDraws() > a[max].getDraws()) {
                        max = j;
                    }
                }
            }
            String s1 = a[max].getTeam();
            String s2 = a[i].getTeam();
            exchange(s1,s2);
        }
        displayToString(a, teamsize);
    }
    // public void display(int teamsize, Team[] a) {
    //     System.out.println("England");
    // }
    public void exchange(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
    }
    public void displayToString(Team[] a, int teamsize) {
        String s = "";
        int i;
        for (i = 0; i <  teamsize - 1; i++) {
            s += a[i].getTeam() + ",";
        }
            s += a[i].getTeam();
        System.out.println(s);
    }
}