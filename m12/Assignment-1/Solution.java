import java.util.*;
class Solution {
	private Solution() {

	}
	private static Students[] details = new Students[200];
	private static Students[] overall = new Students[200];
	private static int size = 0;
	private static int overallsize = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insertion obj2 = new Insertion();
		int qualified = Integer.parseInt(sc.nextLine());
		int vacancies = Integer.parseInt(sc.nextLine());
		int unresvacancies = Integer.parseInt(sc.nextLine());
		int bcvacancies = Integer.parseInt(sc.nextLine());
		int scvacancies = Integer.parseInt(sc.nextLine());
		int stvacancies = Integer.parseInt(sc.nextLine());
		int i = 0;
		while (i < qualified) {
			String[] st = sc.nextLine().split(",");
			details[size++] = new Students(st[0], st[1], Integer.parseInt(st[2]), Integer.parseInt(st[3]), Integer.parseInt(st[4]), Integer.parseInt(st[5]), st[6]);
			i++;
		}
		overall[overallsize++] = new Students(qualified, vacancies, unresvacancies, bcvacancies, scvacancies, stvacancies);
		obj2.sortByInsertion(details,size, overall, overallsize, vacancies, unresvacancies);
	}
}