import java.util.Arrays;
class merged{
	/**
	 * time complexity is O(N^2)
	 */
	public void insertionsort() {
		for(int i = 1; i < size; i++) {
			for(int j = i;j > 0 && team[j].compareTo(team[j - 1]) > -1;j--) {
			exchange(team,j,j-1);
		}
	}
}
	/**
	 * time complexity is O(1)
	 */
	public void exchange(Team[] team,int i,int loc) {
	Team temp = team[loc];
	team[loc] = team[i];
	team[i] = temp;
			}

	/**
	 * time complexity is O(1).
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < size - 1; i++) {
			str += team[i].getname() + ",";
		}
		 str = str + team[size - 1].getname();
		 return str;
	}
}