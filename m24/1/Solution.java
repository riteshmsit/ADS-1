import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Studentdetails details = new Studentdetails();
		Hashtable hashing = new Hashtable();
		// The time complexity is O(N)
		for (int i = 0; i < n; i++) {
			String[] st1 = sc.nextLine().split(",");
			hashing.put(st1[0], new Studentdetails(st1[1], Double.parseDouble(st1[2])));
		}
		int queries = Integer.parseInt(sc.nextLine());
		//The time complexity is O(N)
		for (int i = 0; i < queries; i++) {
			String[] st2 = sc.nextLine().split(" ");
			switch(st2[0]) {
				case "get":
					System.out.println(hashing.get(st2[1], Integer.parseInt(st2[2])));
				break;
				default:
				break;
			}
		}
	}
}
