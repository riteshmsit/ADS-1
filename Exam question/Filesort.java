class Filesort {
	int freqj;
	int i;
	Filesort( int i, int freqj) {
		this.freqj = freqj;
		this.i = i;
		// this.a = a;
		// this.counta = counta;
		
	}
	public int getfreqj() {
		return this.freqj;
	}
	public int geti() {
		return this.i;
	}
	// int[] geta() {
	// 	return this.a;
	// }
	// int counta() {
	// 	return this.counta;
	// }

// time complexity of this method is O(1) as it checks one time.
	public int compareTo(Filesort that) {
	    if (this.getfreqj() > that.getfreqj()) {
	        return 1;
	    } else if (this.getfreqj() == that.getfreqj()) {
	    	if (this.geti() < that.geti()) {
	        return 1;
	    } 

	}
	return 0;
}
}