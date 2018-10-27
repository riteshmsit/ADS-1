import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Studentdetails details = new Studentdetails();
		Binarysearchtree bst = new Binarysearchtree();
		for (int i = 0; i < n; i++) {
			String[] st1 = sc.nextLine().split(",");
			details = new Studentdetails(Integer.parseInt(st1[0]), st1[1]);
			bst.put(details, Double.parseDouble(st1[2]));
		}
		int queries = Integer.parseInt(sc.nextLine());;
		for (int i = 0; i < queries; i++) {
			String[] st2 = sc.nextLine().split(" ");
			switch(st2[0]) {
				case "get":
					details = new Studentdetails(Integer.parseInt(st2[0]), st2[1]);
					System.out.println(bst.get(details));
				break;
			}
		}
	}
}