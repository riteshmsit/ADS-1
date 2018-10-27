class Studentdetails {
	String name;
	double marks;
	Studentdetails() {

	}
	Studentdetails(String name, double marks) {
		this.marks = marks;
		this.name = name;

	}
	public String toString() {
        return this.getname() + "," + this.getmarks();
    }
	public String getname() {
		return this.name;
	}
	public double getmarks() {
		return this.marks;
	}
}
