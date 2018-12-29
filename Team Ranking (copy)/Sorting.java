class Sorting {
    Team[] team;
    int size;
    Sorting() {
        team = new Team[20];
        size = 0;
    }
    public void add(Team t) {
        team[size++] = t;
    }
    public void insertion() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0 && team[j].compareTo(team[j-1]) == 1; j--) {
                swap(team, j, j-1);
            }
        }
    }
    public void swap(Team[] team, int second, int first) {
        Team temp = team[second];
        team[second] = team[first];
        team[first] = temp;
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += team[i].getTeamname() + " ";

        }
        s = s.trim();
        return s;
    }
}