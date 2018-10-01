import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nooftestcases = Integer.parseInt(sc.nextLine());
		int i = 0;
		while (i < nooftestcases) {
			Steque<Integer> obj = new Steque<Integer>();
			while (sc.hasNext()) {
				String line = sc.nextLine();
				if (!line.isEmpty()) {
					String[] ins = sc.nextLine().split(" ");
					switch(ins[0]) {
						case "enqueue":
						obj.pushAtEnd(Integer.parseInt(ins[1]));
						obj.print();
						break;	
						case "push":
						obj.insertFront(Integer.parseInt(ins[1]));
						int j = 0;
						if (j > 0) {
							obj.print();
						}
						break;
						case "pop":
						if (obj.isEmpty()) {
							System.out.println("Steque is empty.");
							break;
						} else {
							obj.deleteBack(Integer.parseInt(ins[1]));
							obj.print();
							break;
						}
						default:
						break;
					}
				} else {
					System.out.println();
				}
			}
			i++;
		}
	}
}