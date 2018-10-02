import java.util.*;
class Solution {
	private Solution() {

	}
	private static Team[] team = new Team[20];
	private static int teamsize = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Team obj = new Team();
		Selectionsort obj1 = new Selectionsort();
		while (sc.hasNextLine()) {
			String[] input = sc.nextLine().split(",");
			team[teamsize++] = new Team(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]));
		}
		if (teamsize > 2) {
			obj1.sortByInsertion(team,teamsize);
		} else {
			obj1.display(teamsize, team);
		}
	}
}

