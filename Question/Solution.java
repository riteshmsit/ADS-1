import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Hashtable hashing = new Hashtable();
		Steque ste = new Steque();
		//Iterable<Registration> keys = hashing.keys();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			// String[] hashinp = line.split(",");
			if (line.equals("JC")) {
			// 	if (ste.isEmpty()) {
			// 		System.out.println("NO Registrations");
			// 	} else {
			System.out.println(ste.display());

			// hashing.get(hashinp[0], hashinp[1]);
				// }
				
			} 
			else {
				ste.addLast(line);
				// hashing.put(new Registration(Integer.parseInt(hashinp[0]), Integer.parseInt(hashinp[1])), Integer.parseInt(hashinp[1]));
			}
	}
}

	
}