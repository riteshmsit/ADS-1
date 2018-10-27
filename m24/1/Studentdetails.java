class Studentdetails {
	int rollnumber;
	String name;
	double marks;
	Studentdetails() {

	}
	Studentdetails(int rollnumber, String name, double marks) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks = marks;
	}
	Studentdetails(int rollnumber, String name) {
		this.rollnumber = rollnumber;
		this.name = name;
	}
	public int getrollnumber() {
		return this.rollnumber;
	}
	public String getname() {
		return this.name;
	}
	public double getmarks() {
		return this.marks;
	}
	public int compareTo(Studentdetails that) {
		if(this.getrollnumber() > that.getrollnumber()) {
			return 1;
		} else if(this.getrollnumber() < that.getrollnumber()) {
			return -1;
		} else {
			return 0;
		}
	}
}