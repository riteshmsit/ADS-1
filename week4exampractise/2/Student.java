class Student implements Comparable<Student> {
	Student() {

	}
	private String name;
	private int roll;
	private double marks;
	public Student(final String name, final double marks, final int roll) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	public double getMarks() {
		return this.marks;
	}
	public int compareTo(Student other) {
		if (this.marks > other.marks) {
			return 1;
		} else if (this.marks < other.marks) {
			return -1;
		} else if (this.roll > other.roll) {
			return 1;
		} else if (this.roll < other.roll) {
			return -1;
		} else {
			return 0;
		}
	}
}