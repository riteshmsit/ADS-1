import java.util.*;
class Solution {
	Solution() {

	}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Sorting sort = new Sorting();
    while (sc.hasNext()) {
        String[] line = sc.nextLine().split(" ");
        Team team = new Team(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
        sort.add(team);
    }
    sort.insertion();
    System.out.println(sort.toString());
}
}