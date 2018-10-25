import java.util.Scanner;
/**TAXICABNUMBER.**/
final class Solution {
	/**
	 * @brief [brief description]
	 * @details [long description]
	 */
	private Solution() { }
	/**
	 * @param args value
	 * Time complexity is O(1)
	 */
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String[] tokens = s.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int n1 = Integer.parseInt(tokens[1]);
		//taxicab(n1);
		taxicab(n,n1);
	}
	/**
	 * @param n value
	 * @param n1 value
	 * Time complexity is O(N)
	 */
	public static void taxicab(final int n, final int n1) {
		Minpq<Taxicab> pq = new Minpq<Taxicab>();
		for(int i = 1; i <= 600; i++) {
			Taxicab tc = new Taxicab(i,i);
			pq.insert(tc);
		}
		//Taxicab old1 = new Taxicab(0,0);
		long previous = 0;
		int cnt = 1;
		int numcount = 0;
		while(!pq.isEmpty()) {
			Taxicab new1 = pq.delMin();
				//System.out.println(new1.getsum());
				//System.out.println(new1);
				 if(previous == new1.getsum()) {
					//break;
					cnt++;
				} else {
					cnt = 0;
					//System.out.println(cnt + ">");
				}

				if(cnt == n1 - 1) {
					numcount++;
					//System.out.println(numcount + " - " + n);
					if(numcount == n) {
						System.out.println(new1.getsum());
						break;
					}
				}
				previous = new1.getsum();
				//System.out.println(previous + "<");
			//System.out.println(new1);
			if(new1.getj() < 600) {
				Taxicab tac = new Taxicab(new1.geti(), new1.getj() + 1);
				pq.insert(tac);
			}

}
}
}



