import java.util.*;
/**.
 * Class for solution.
 */
class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Minpq min = new Minpq();
		Maxpq max = new Maxpq();
		BinarysearchMin binmin = new BinarysearchMin();
		BinarySearchMax binmax = new BinarySearchMax();
		//double[] count = new double[n];
		int loopcount = 0;
		// The time complexity is O(N) (6 * N approximately is N) as
		// it goes through the entire elements 6 times
		for (int i = 0; i < 6 * n; i++) {
			String[] s1 = sc.nextLine().split(",");
			//count[i % 6 * n] = Doubs1[];
			if (loopcount % n != 0) {
				min.insert(s1[1]);
				max.insert(s1[1]);
			} else {
				max.getTop5();
				System.out.println();
				min.getTop5();
				System.out.println();
				min.insert(s1[1]);
				max.insert(s1[1]);
			}
			loopcount++;
		}
		int queries = Integer.parseInt(sc.nextLine());
		// The time complexity is O(N) as it goes through
		// all the elements in the loop.
		for (int i = 0; i < queries; i++) {
			String s2 = sc.nextLine();
			String[] ss2 = s2.split(",");
			if (ss2[0].equals("get")) {
				if (ss2[1].equals("maxST")) {
					binmax.getmaxST();
				}
				else if (ss2[1].equals("minST")) {
					binmin.getminST();
				}
			}
			if (s2.equals("intersection")) {

			}
		}
	}

}