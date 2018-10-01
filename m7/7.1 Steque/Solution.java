import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nooftestcases = Integer.parseInt(sc.nextLine());
		int i = 0;
		Steque<Integer> obj = new Steque<Integer>();
		while (i < nooftestcases) {
			while (sc.hasNext()) {
				String[] ins = sc.nextLine().split(" ");
				switch(ins[0]) {
					case "enqueue":
					obj.pushAtEnd(Integer.parseInt(ins[1]));
					break;	
					case "push":
					obj.insertFront(Integer.parseInt(ins[1]));
					break;
					case "pop":
					obj.deleteBack(Integer.parseInt(ins[1]));
					break;
					default:
					break;
				}
			}
			i++;
		}
	}
}