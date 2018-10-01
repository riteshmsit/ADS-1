import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nooftestcases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < nooftestcases; i++) {
			Steque obj = new Steque();
			while (sc.hasNext()) {
				String line = sc.nextLine();
				if (!line.isEmpty()) {
					String[] ins = line.split(" ");
					switch(ins[0]) {
						case "enqueue":
						obj.addLast(Integer.parseInt(ins[1]));
						//obj.print();
						break;	
						case "push":
						obj.pushFront(Integer.parseInt(ins[1]));
						break;
						case "pop":
						if (obj.isEmpty()) {
							System.out.println("Steque is empty.");
							break;
						} else {
							obj.deleteLast();
							//obj.print();
							break;
						}
						default:
						break;
					}
				} else {
					System.out.println();
					break;
				}
			}
		}
	}
}